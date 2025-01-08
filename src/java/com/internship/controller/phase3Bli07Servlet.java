/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import com.internship.model.BLI07;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class phase3Bli07Servlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            db = DBConnection.dbConnect();
            String query = "SELECT b.name, b.phoneNum, b.startDate, b.endDate, bl.status " +
                             "FROM bli07 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI07> phase37 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents4 = 0;
            int totalCompleted4 = 0;
            int totalUncompleted4 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI07 bli07 = new BLI07();
                bli07.setName(rs.getString("name"));
                bli07.setPhoneNum(rs.getString("phoneNum"));
                bli07.setStartDate(rs.getDate("startDate"));
                bli07.setEndDate(rs.getDate("endDate"));
                String status = rs.getString("status");
                bli07.setStatus(status);
                totalStudents4++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted4++;
                } else {
                    totalUncompleted4++;
                }
                phase37.add(bli07);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase37", phase37);
            request.getSession().setAttribute("totalStudents4", totalStudents4);
            request.getSession().setAttribute("totalCompleted4", totalCompleted4);
            request.getSession().setAttribute("totalUncompleted4", totalUncompleted4);

            response.sendRedirect(request.getContextPath() + "/admin/phase3Bli07.jsp");

        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        }
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
        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            db = DBConnection.dbConnect();
            String query = "SELECT b.name, b.phoneNum, b.startDate, b.endDate, bl.status " +
                             "FROM bli07 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI07> phase37 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents4 = 0;
            int totalCompleted4 = 0;
            int totalUncompleted4 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI07 bli07 = new BLI07();
                bli07.setName(rs.getString("name"));
                bli07.setPhoneNum(rs.getString("phoneNum"));
                bli07.setStartDate(rs.getDate("startDate"));
                bli07.setEndDate(rs.getDate("endDate"));
                String status = rs.getString("status");
                bli07.setStatus(status);
                totalStudents4++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted4++;
                } else {
                    totalUncompleted4++;
                }
                phase37.add(bli07);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase37", phase37);
            request.getSession().setAttribute("totalStudents4", totalStudents4);
            request.getSession().setAttribute("totalCompleted4", totalCompleted4);
            request.getSession().setAttribute("totalUncompleted4", totalUncompleted4);

            response.sendRedirect(request.getContextPath() + "/admin/phase3Bli07.jsp");

        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/admin/settings.jsp");
        }
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
