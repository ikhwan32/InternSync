/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import com.internship.model.BLI06;
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
public class phase4Servlet extends HttpServlet {

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
            String query = "SELECT b.name, b.matricNum, b.programme, b.phoneNum, bl.status " +
                             "FROM bli06 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI06> phase4 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents5 = 0;
            int totalCompleted5 = 0;
            int totalUncompleted5 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI06 bli06 = new BLI06();
                bli06.setName(rs.getString("name"));
                bli06.setMatricNum(rs.getString("matricNum"));
                bli06.setProgramme(rs.getString("programme"));
                bli06.setPhoneNum(rs.getString("phoneNum"));
                String status = rs.getString("status");
                bli06.setStatus(status);
                totalStudents5++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted5++;
                } else {
                    totalUncompleted5++;
                }
                phase4.add(bli06);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase4", phase4);
            request.getSession().setAttribute("totalStudents5", totalStudents5);
            request.getSession().setAttribute("totalCompleted5", totalCompleted5);
            request.getSession().setAttribute("totalUncompleted5", totalUncompleted5);

            response.sendRedirect(request.getContextPath() + "/admin/phase4.jsp");

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
            String query = "SELECT b.name, b.matricNum, b.programme, b.phoneNum, bl.status " +
                             "FROM bli06 b " +
                             "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI06> phase4 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudents5 = 0;
            int totalCompleted5 = 0;
            int totalUncompleted5 = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI06 bli06 = new BLI06();
                bli06.setName(rs.getString("name"));
                bli06.setMatricNum(rs.getString("matricNum"));
                bli06.setProgramme(rs.getString("programme"));
                bli06.setPhoneNum(rs.getString("phoneNum"));
                String status = rs.getString("status");
                bli06.setStatus(status);
                totalStudents5++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalCompleted5++;
                } else {
                    totalUncompleted5++;
                }
                phase4.add(bli06);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("phase4", phase4);
            request.getSession().setAttribute("totalStudents5", totalStudents5);
            request.getSession().setAttribute("totalCompleted5", totalCompleted5);
            request.getSession().setAttribute("totalUncompleted5", totalUncompleted5);

            response.sendRedirect(request.getContextPath() + "/admin/phase4.jsp");

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
