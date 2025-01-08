/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import com.internship.model.BLI02;
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
public class phase1Bli02Servlet extends HttpServlet {

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
        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            db = DBConnection.dbConnect();
            String query = "SELECT b.name, b.compName, b.compPhone, b.compEmail, " +
                         "CASE " +
                         "WHEN bl.type IN ('BLI01', 'BLI02') THEN bl.status " +
                         "ELSE NULL END AS status " +
                         "FROM bli02 b " +
                         "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI02> bliList1 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudent = 0;
            int totalComplete = 0;
            int totalUncomplete = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI02 bli02 = new BLI02();
                bli02.setName(rs.getString("name"));
                bli02.setCompName(rs.getString("compName"));
                bli02.setCompPhone(rs.getString("compPhone"));
                bli02.setCompEmail(rs.getString("compEmail"));
                String status = rs.getString("status");
                bli02.setStatus(status);
                totalStudent++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalComplete++;
                } else {
                    totalUncomplete++;
                }
                bliList1.add(bli02);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("bliList1", bliList1);
            request.getSession().setAttribute("totalStudent", totalStudent);
            request.getSession().setAttribute("totalComplete", totalComplete);
            request.getSession().setAttribute("totalUncomplete", totalUncomplete);

            response.sendRedirect(request.getContextPath() + "/admin/phase1Bli02.jsp");

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
            String query = "SELECT b.name, b.compName, b.compPhone, b.compEmail, " +
                         "CASE " +
                         "WHEN bl.type IN ('BLI01', 'BLI02') THEN bl.status " +
                         "ELSE NULL END AS status " +
                         "FROM bli02 b " +
                         "LEFT JOIN bli bl ON b.bliID = bl.bliID";
            
            ps = db.prepareStatement(query);
      

            ArrayList<BLI02> bliList1 = new ArrayList<>();
            rs = ps.executeQuery();
            int totalStudent = 0;
            int totalComplete = 0;
            int totalUncomplete = 0;

            // Add all students to the list
            while (rs.next()) {
                BLI02 bli02 = new BLI02();
                bli02.setName(rs.getString("name"));
                bli02.setCompName(rs.getString("compName"));
                bli02.setCompPhone(rs.getString("compPhone"));
                bli02.setCompEmail(rs.getString("compEmail"));
                String status = rs.getString("status");
                bli02.setStatus(status);
                totalStudent++;
                if ("completed".equalsIgnoreCase(status)) {
                    totalComplete++;
                } else {
                    totalUncomplete++;
                }
                bliList1.add(bli02);
            }

            

            // Add data to session attributes
            request.getSession().setAttribute("bliList1", bliList1);
            request.getSession().setAttribute("totalStudent", totalStudent);
            request.getSession().setAttribute("totalComplete", totalComplete);
            request.getSession().setAttribute("totalUncomplete", totalUncomplete);

            response.sendRedirect(request.getContextPath() + "/admin/phase1Bli02.jsp");

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
