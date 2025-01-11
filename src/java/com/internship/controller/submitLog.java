/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import java.text.SimpleDateFormat;
import java.nio.file.Paths;

/**
 *
 * @author myPC
 */

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class submitLog extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try {
            // Get form data
            int userID = Integer.parseInt(request.getParameter("userID"));
            String attendanceDate = request.getParameter("attendanceDate");
            int attendanceStatus = Integer.parseInt(request.getParameter("attendanceStatus"));
            String desc = request.getParameter("logbookEntry");

            // Set up base directories
            String applicationPath = request.getServletContext().getRealPath("");
            String uploadsPath = applicationPath + File.separator + "uploads";
            String userPath = uploadsPath + File.separator + userID;
            String attendancePath = userPath + File.separator + "attendance";
            String logbookPath = userPath + File.separator + "logbook";
            
            // Create all necessary directories
            //ni method untuk wak file, kalu xdok ye x wak ah kalu ade ye wak
            //saje wak function sbb napok style agi
            createDirectories(uploadsPath, userPath, attendancePath, logbookPath);
            
            // Handle attendance file upload
            Part filePart = request.getPart("supportingDocument");
            String fileName = null;
            String savedFileName = null;
            String relativePath = null;
            
            //tgk file ade ke dok
            if (filePart != null && filePart.getSize() > 0) {
                fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
                String fileExtension = "";
                int i = fileName.lastIndexOf('.');
                if (i > 0) {
                    fileExtension = fileName.substring(i); // includes the dot. bakpe dot? sbb kita nok extension file tu
                }
                
                // Generate unique filename with extension
                savedFileName = "attendance" + attendanceDate + "_" + userID + fileExtension;
                String filePath = attendancePath + File.separator + savedFileName;//attendance path kita setup doh atas tadi. ye akan jadi upload/userid/attendance/namafile.extensionfile aa
                relativePath = "uploads" + File.separator + userID + File.separator + 
                             "attendance" + File.separator + savedFileName;
                //relative path ni ekgi nk letok dalam db biar mudoh access kalu nk edit
                // Save file using InputStream and OutputStream
                try (InputStream input = filePart.getInputStream();
                     OutputStream output = new FileOutputStream(filePath)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = input.read(buffer)) > 0) {
                        output.write(buffer, 0, length);
                    }
                }
            }

            // Handle logbook file upload
            Part filePart2 = request.getPart("logbookFile");
            String fileName2 = null;
            String savedFileName2 = null;
            String relativePath2 = null;

            if (filePart2 != null && filePart2.getSize() > 0) {
                fileName2 = Paths.get(filePart2.getSubmittedFileName()).getFileName().toString();
                String fileExtension = "";
                int i = fileName2.lastIndexOf('.');
                if (i > 0) {
                    fileExtension = fileName2.substring(i); // includes the dot
                }
                
                // Generate unique filename with extension
                savedFileName2 = "logbook" + attendanceDate + "_" + userID + fileExtension;
                String filePath = logbookPath + File.separator + savedFileName2;
                relativePath2 = "uploads" + File.separator + userID + File.separator + 
                              "logbook" + File.separator + savedFileName2;
                
                // Save file using InputStream and OutputStream
                try (InputStream input = filePart2.getInputStream();
                     OutputStream output = new FileOutputStream(filePath)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = input.read(buffer)) > 0) {
                        output.write(buffer, 0, length);
                    }
                }
            }

            // Database connection
            Connection conn = null;
            PreparedStatement pstmt = null;
            
            try {
                conn = DBConnection.dbConnect();
                String sql = "INSERT INTO logBook (attendance, attendFile, description, descFile, date, userID) " +
                           "VALUES (?, ?, ?, ?, ?, ?)";
                
                pstmt = conn.prepareStatement(sql);
                
                // Convert date string to SQL date
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date parsed = sdf.parse(attendanceDate);
                java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
                
                // Set parameters - store relative paths in database
                pstmt.setInt(1, attendanceStatus);
                pstmt.setString(2, relativePath); // Store the relative path
                pstmt.setString(3, desc);
                pstmt.setString(4, relativePath2); // Store the relative path
                pstmt.setDate(5, sqlDate);
                pstmt.setInt(6, userID);

                pstmt.executeUpdate();
                response.sendRedirect("student/attendance.jsp?success=true");
                
            } catch (Exception e) {
                getServletContext().log("Error in SubmitLogServlet", e);
                response.sendRedirect("student/attendance.jsp?error=true");
            } finally {
                if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
                if (conn != null) try { conn.close(); } catch (SQLException e) {}
            }

        } catch (Exception e) {
            getServletContext().log("Error in SubmitLogServlet", e);
            response.sendRedirect("student/attendance.jsp?error=true");
        }
    }

    private void createDirectories(String... paths) {
        //loop untuk wak file sbb malas wak serabut atas. thanks to stackoverflow
        for (String path : paths) {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }
        }
    }

}