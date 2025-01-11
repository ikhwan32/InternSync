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
                 maxFileSize = 1024 * 1024 * 10,      // 10MB
                 maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class submitLog extends HttpServlet {
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            // Get form data
            String type = request.getParameter("type");
            int userID = Integer.parseInt(request.getParameter("userID"));
            String attendanceDate = request.getParameter("attendanceDate");
            int attendanceStatus = Integer.parseInt(request.getParameter("attendanceStatus"));
            String reason = request.getParameter("reason");
            
            // Handle file upload
            Part filePart = request.getPart("supportingDocument");
            String fileName = null;
            String savedFileName = null;
            
            if (filePart != null && filePart.getSize() > 0) {
                fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
                
                // Create uploads directory if it doesn't exist
                String applicationPath = request.getServletContext().getRealPath("");
                String uploadsPath = applicationPath + File.separator + "uploads";
                File uploadsDir = new File(uploadsPath);
                if (!uploadsDir.exists()) {
                    uploadsDir.mkdirs();
                }
                
                // Generate unique filename
                savedFileName = System.currentTimeMillis() + "_" + fileName;
                String filePath = uploadsDir.getAbsolutePath() + File.separator + savedFileName;
                
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
            
            // Database connection
            Connection conn = null;
            PreparedStatement pstmt = null;
            
            try {
                // Get database connection
                conn = DBConnection.dbConnect();
                
                // Prepare SQL statement
                String sql = "INSERT INTO logBook (userID, date, attendance, attendFile, description) " +
                           "VALUES (?, ?, ?, ?, ?)";
                
                pstmt = conn.prepareStatement(sql);
                
                // Convert date string to SQL date
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date parsed = sdf.parse(attendanceDate);
                java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
                
                // Set parameters
                pstmt.setInt(1, userID);
                pstmt.setDate(2, sqlDate);
                pstmt.setInt(3, attendanceStatus);
                pstmt.setString(4, savedFileName); // Store the saved filename
                pstmt.setString(5, reason);
                
                // Execute query
                pstmt.executeUpdate();
                
                // Redirect to success page
                response.sendRedirect("student/attendance.jsp?success=true");
                
            } catch (Exception e) {
                // Log the error
                getServletContext().log("Error in SubmitLogServlet", e);
                response.sendRedirect("student/attendance.jsp?error=true");
            } finally {
                // Close resources
                if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
                if (conn != null) try { conn.close(); } catch (SQLException e) {}
            }
            
        } catch (Exception e) {
            getServletContext().log("Error in SubmitLogServlet", e);
            response.sendRedirect("student/attendance.jsp?error=true");
        }
    }

}