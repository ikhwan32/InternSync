/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import com.internship.model.BLI03;
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
public class phase2Servlet extends HttpServlet {

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
            String query = "SELECT b.name, b.compName, b.phoneNum, b.email, bl.status " +
                             "FROM bli03 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI03> phase2 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents1 = 0;
            int totalCompleted1 = 0;
            int totalUncompleted1 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI03 bli03 = new BLI03();
                bli03.setName(rs.getString("name"));
                bli03.setCompName(rs.getString("compName"));
                bli03.setPhoneNum(rs.getString("phoneNum"));
                bli03.setEmail(rs.getString("email"));
                String status = rs.getString("status");
                bli03.setStatus(status);
                totalStudents1++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted1++;
                } else {
                    totalUncompleted1++;
                }
                phase2.add(bli03);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase2", phase2);
            request.getSession().setAttribute("totalStudents1", totalStudents1);
            request.getSession().setAttribute("totalCompleted1", totalCompleted1);
            request.getSession().setAttribute("totalUncompleted1", totalUncompleted1);

            response.sendRedirect(request.getContextPath() + "/admin/phase2.jsp");

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
            String query = "SELECT b.name, b.compName, b.phoneNum, b.email, bl.status " +
                             "FROM bli03 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI03> phase2 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents1 = 0;
            int totalCompleted1 = 0;
            int totalUncompleted1 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI03 bli03 = new BLI03();
                bli03.setName(rs.getString("name"));
                bli03.setCompName(rs.getString("compName"));
                bli03.setPhoneNum(rs.getString("phoneNum"));
                bli03.setEmail(rs.getString("email"));
                String status = rs.getString("status");
                bli03.setStatus(status);
                totalStudents1++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted1++;
                } else {
                    totalUncompleted1++;
                }
                phase2.add(bli03);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase2", phase2);
            request.getSession().setAttribute("totalStudents1", totalStudents1);
            request.getSession().setAttribute("totalCompleted1", totalCompleted1);
            request.getSession().setAttribute("totalUncompleted1", totalUncompleted1);

            response.sendRedirect(request.getContextPath() + "/admin/phase2.jsp");

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
