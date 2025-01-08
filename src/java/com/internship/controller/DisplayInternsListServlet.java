/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

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
import com.internship.controller.DBConnection;

import com.internship.model.Student;

/**
 *
 * @Itqnazs
 */
public class DisplayInternsListServlet extends HttpServlet {

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
            String query = "SELECT * FROM student";
            ps = db.prepareStatement(query);

            ArrayList<Student> studentList = new ArrayList<Student>();

            rs = ps.executeQuery();

            //add all students to the list to display in studentList.jsp
            while (rs.next()) {
                Student student = new Student();
                student.setStudentName(rs.getString("studentName"));
                student.setEndDate(rs.getString("endDate"));
                student.setStudentPhone(rs.getString("studentPhone"));
                student.setStudentEmail(rs.getString("studentEmail"));
                studentList.add(student);
            }

            request.getSession().setAttribute("studentList", studentList);
            response.sendRedirect(request.getContextPath() + "/supervisor/dashboard.jsp");

        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
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
        //processRequest(request, response);

        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db = DBConnection.dbConnect();
            String query = "SELECT * FROM student";
            ps = db.prepareStatement(query);

            ArrayList<Student> studentList = new ArrayList<Student>();

            rs = ps.executeQuery();

            //add all students to the list to display in studentList.jsp
            while (rs.next()) {
                Student student = new Student();
                student.setStudentName(rs.getString("studentName"));
                student.setEndDate(rs.getString("endDate"));
                student.setStudentPhone(rs.getString("studentPhone"));
                student.setStudentEmail(rs.getString("studentEmail"));
                studentList.add(student);
            }

            request.getSession().setAttribute("studentList", studentList);
            response.sendRedirect(request.getContextPath() + "/supervisor/dashboard.jsp");

        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor//settings.jsp");
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
