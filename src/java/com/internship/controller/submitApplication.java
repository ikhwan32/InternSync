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
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author myPC
 */
public class submitApplication extends HttpServlet {

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
        String companyIDParameter = request.getParameter("companyID");
        String companyName = request.getParameter("companyName");
        String newCompanyName = request.getParameter("newCompanyName");
        String newCompanyAddress = request.getParameter("newCompanyAddress");
        String newCompanyJobScope = request.getParameter("newCompanyJobScope");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userID = user.getUserID();

        int companyID = 0;
        boolean isNewCompany = "true".equals(request.getParameter("isNewCompany"));

        try {
            Connection conn = DBConnection.dbConnect();

            if (isNewCompany) {
                // Insert new company into the database
                String insertCompanyQuery = "INSERT INTO company (companyName, companyAddress, companyJobScope) VALUES (?, ?, ?)";
                PreparedStatement insertCompanyStmt = conn.prepareStatement(insertCompanyQuery);
                insertCompanyStmt.setString(1, newCompanyName);
                insertCompanyStmt.setString(2, newCompanyAddress);
                insertCompanyStmt.setString(3, newCompanyJobScope);
                insertCompanyStmt.executeUpdate();

                insertCompanyStmt.close();

                // Get the companyID of the newly inserted company
                String getCompanyIDQuery = "SELECT companyID FROM company WHERE companyName = ?";
                PreparedStatement getCompanyIDStmt = conn.prepareStatement(getCompanyIDQuery);
                getCompanyIDStmt.setString(1, newCompanyName);
                ResultSet rs = getCompanyIDStmt.executeQuery();
                if (rs.next()) {
                    companyID = rs.getInt("companyID");
                }


                getCompanyIDStmt.close();

            } else {
                // Existing company
                companyID = Integer.parseInt(companyIDParameter);
            }

            // Insert student application into the database
            String insertApplicationQuery = "INSERT INTO application (status, userID, companyID) VALUES (?, ?, ?)";
            PreparedStatement insertApplicationStmt = conn.prepareStatement(insertApplicationQuery);
            insertApplicationStmt.setString(1, "Pending");
            insertApplicationStmt.setInt(2, userID);
            insertApplicationStmt.setInt(3, companyID);
            insertApplicationStmt.executeUpdate();
            insertApplicationStmt.close();

            // Close the connection
            conn.close();

            // Redirect to a success page
            response.sendRedirect(request.getContextPath() + "/student/applicationSuccess.jsp");
        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/student/apply.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/apply.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/apply.jsp");
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
