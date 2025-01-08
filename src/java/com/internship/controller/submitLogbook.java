/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;
import com.internship.model.Company;
import com.internship.model.User;
import com.internship.model.Application;
import java.io.File;
import java.io.InputStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.servlet.http.Part;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author myPC
 */
@WebServlet(name = "submitLogbook", urlPatterns = {"/submitLogbook.do"})
@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
  maxFileSize = 1024 * 1024 * 10,      // 10 MB
  maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class submitLogbook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }

        int userID = user.getUserID();
        String attendance = request.getParameter("attendance");
        String reason = request.getParameter("reason");
        String date = request.getParameter("date");
        Part mcFilePart = request.getPart("mcFile");
        String summary = request.getParameter("summary");
        Part evidenceFilePart = request.getPart("evidenceFile");

        // Use a standard date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(new Date()); // Current date

        // Sanitize file names to avoid issues
        String mcFileName = sanitizeFileName(mcFilePart.getSubmittedFileName());
        String evidenceFileName = sanitizeFileName(evidenceFilePart.getSubmittedFileName());

        // Define a base upload directory (make sure this is writable by the server)
        String baseUploadPath = "C:" + File.separator + "uploads";

        // Create user-specific directory if it doesn't exist
        String userUploadPath = baseUploadPath + File.separator + userID;
        File userUploadDir = new File(userUploadPath);
        if (!userUploadDir.exists()) {
            if (!userUploadDir.mkdirs()) {
                session.setAttribute("error", "Failed to create directory: " + userUploadPath);
                response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
                return;
            }
        }
        
        String mcFilePath = "";
        if (mcFileName != null && !mcFileName.isEmpty()) {
            mcFilePath = userUploadPath + File.separator + mcFileName;
            try (InputStream is = mcFilePart.getInputStream()) {
                Files.copy(is, Paths.get(mcFilePath), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                session.setAttribute("error", "Error uploading MC file: " + e.getMessage());
                response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
                return;
            }
        }

        String evidenceFilePath = "";
        if (evidenceFileName != null && !evidenceFileName.isEmpty()) {
            evidenceFilePath = userUploadPath + File.separator + evidenceFileName;
            try (InputStream is = evidenceFilePart.getInputStream()) {
                Files.copy(is, Paths.get(evidenceFilePath), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                session.setAttribute("error", "Error uploading evidence file: " + e.getMessage());
                response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
                return;
            }
        }

        try {
            boolean attend = "Present".equalsIgnoreCase(attendance);

            // Insert into database
            Connection conn = DBConnection.dbConnect();
            String insertLogbook = "INSERT INTO logbook (attendance, attendFile, description, descFile, date, userID) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertLogbookStmt = conn.prepareStatement(insertLogbook);
            insertLogbookStmt.setBoolean(1, attend);
            insertLogbookStmt.setString(2, mcFilePath); // Store path or empty string
            insertLogbookStmt.setString(3, summary);
            insertLogbookStmt.setString(4, evidenceFilePath); // Store path or empty string
            insertLogbookStmt.setDate(5, java.sql.Date.valueOf(date));
            insertLogbookStmt.setInt(6, userID);
            insertLogbookStmt.executeUpdate();
            insertLogbookStmt.close();
            conn.close();

            session.setAttribute("success", "Logbook entry submitted successfully.");
            response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            session.setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/logbook.jsp");
        }
    }

    // Helper function to sanitize file names
    private String sanitizeFileName(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            return "";
        }
        // Remove potentially harmful characters
        return fileName.replaceAll("[^a-zA-Z0-9.\\-]", "_");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
