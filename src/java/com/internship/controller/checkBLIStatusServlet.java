/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;
import com.internship.model.User;

/**
 *
 * @author myPC
 */
@WebServlet(name = "checkBLIStatusServlet", urlPatterns = {"/checkBLIStatusServlet.do"})
public class checkBLIStatusServlet extends HttpServlet {

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
        

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userID = user.getUserID();

        Boolean bli1 = false, bli3 = false, bli4 = false, bli7 = false; 

         try {
        Connection conn = DBConnection.dbConnect();

        // Use try-with-resources to ensure proper closing of resources
        try (PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM BLI WHERE userID_student = ? AND type = 'BLI01'");
             PreparedStatement ps3 = conn.prepareStatement("SELECT * FROM BLI WHERE userID_student = ? AND type = 'BLI03'");
             PreparedStatement ps4 = conn.prepareStatement("SELECT * FROM BLI WHERE userID_student = ? AND type = 'BLI04'");
             PreparedStatement ps7 = conn.prepareStatement("SELECT * FROM BLI WHERE userID_student = ? AND type = 'BLI07'")) {

                ps1.setInt(1, userID);
                try (ResultSet rs1 = ps1.executeQuery()) {
                    if (rs1.next()) {
                        bli1 = true; // Set to true if BLI01 exists
                    }
                }

                ps3.setInt(1, userID);
                try (ResultSet rs3 = ps3.executeQuery()) {
                    if (rs3.next()) {
                        bli3 = true; // Set to true if BLI03 exists
                    }
                }

                ps4.setInt(1, userID);
                try (ResultSet rs4 = ps4.executeQuery()) {
                    if (rs4.next()) {
                        bli4 = true; // Set to true if BLI04 exists
                    }
                }

                ps7.setInt(1, userID);
                try (ResultSet rs7 = ps7.executeQuery()) {
                    if (rs7.next()) {
                        bli7 = true; // Set to true if BLI07 exists
                    }
                }
        }

        session.setAttribute("bli1", bli1);
        session.setAttribute("bli3", bli3);
        session.setAttribute("bli4", bli4);
        session.setAttribute("bli7", bli7);

        response.sendRedirect(request.getContextPath() + "/student/dashboard.jsp");

    } catch (SQLException e) {
        e.printStackTrace(); // Log the error to server logs
        session.setAttribute("error", "Database error: " + e.getMessage());
        response.sendRedirect(request.getContextPath() + "/student/debug.jsp"); // Redirect to a dedicated error page
    } catch (Exception e) {
        e.printStackTrace(); // Log the error
        session.setAttribute("error", "An unexpected error occurred: " + e.getMessage());
        response.sendRedirect(request.getContextPath() + "/student/debug.jsp"); // Redirect to an error page
    }
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
