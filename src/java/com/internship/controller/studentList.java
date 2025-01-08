/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;

import com.internship.model.Student;
import com.internship.model.User;

/**
 *
 * @author myPC
 */
@WebServlet(name = "studentList", urlPatterns = {"/studentList.do"})

public class studentList extends HttpServlet {

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
            // Retrieve selected course parameter
            String selectedCourse = request.getParameter("selectedCourse");

            db = DBConnection.dbConnect();
            String query = "SELECT studentName, studentMatric, studentIC, studentEmail FROM student";
            String countQuery = "SELECT COUNT(*) AS total FROM student";

            // Modify query if a course is selected
            if (selectedCourse != null && !selectedCourse.isEmpty()) {
                query += " WHERE studentCourse = ?";
                countQuery += " WHERE studentCourse = ?";
            }

            ps = db.prepareStatement(query);
            PreparedStatement psCount = db.prepareStatement(countQuery);

            if (selectedCourse != null && !selectedCourse.isEmpty()) {
                ps.setString(1, selectedCourse);
                psCount.setString(1, selectedCourse);
            }

            ArrayList<Student> studentList = new ArrayList<>();
            rs = ps.executeQuery();

            // Add all students to the list
            while (rs.next()) {
                Student student = new Student();
                student.setStudentName(rs.getString("studentName"));
                student.setStudentMatric(rs.getString("studentMatric"));
                student.setStudentIC(rs.getString("studentIC"));
                student.setStudentEmail(rs.getString("studentEmail"));
                studentList.add(student);
            }

            // Retrieve total student count
            int totalStudent = 0;
            ResultSet rsCount = psCount.executeQuery();
            if (rsCount.next()) {
                totalStudent = rsCount.getInt("total");
            }

            // Add data to session attributes
            request.getSession().setAttribute("studentList", studentList);
            request.getSession().setAttribute("totalStudent", totalStudent);
            request.getSession().setAttribute("selectedCourse", selectedCourse);

            response.sendRedirect(request.getContextPath() + "/admin/studentList.jsp");

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
            // Retrieve selected course parameter
            String selectedCourse = request.getParameter("selectedCourse");

            db = DBConnection.dbConnect();
            String query = "SELECT studentName, studentMatric, studentIC, studentEmail FROM student";
            String countQuery = "SELECT COUNT(*) AS total FROM student";

            // Modify query if a course is selected
            if (selectedCourse != null && !selectedCourse.isEmpty()) {
                query += " WHERE studentCourse = ?";
                countQuery += " WHERE studentCourse = ?";
            }

            ps = db.prepareStatement(query);
            PreparedStatement psCount = db.prepareStatement(countQuery);

            if (selectedCourse != null && !selectedCourse.isEmpty()) {
                ps.setString(1, selectedCourse);
                psCount.setString(1, selectedCourse);
            }

            ArrayList<Student> studentList = new ArrayList<>();
            rs = ps.executeQuery();

            // Add all students to the list
            while (rs.next()) {
                Student student = new Student();
                student.setStudentName(rs.getString("studentName"));
                student.setStudentMatric(rs.getString("studentMatric"));
                student.setStudentIC(rs.getString("studentIC"));
                student.setStudentEmail(rs.getString("studentEmail"));
                studentList.add(student);
            }

            // Retrieve total student count
            int totalStudent = 0;
            ResultSet rsCount = psCount.executeQuery();
            if (rsCount.next()) {
                totalStudent = rsCount.getInt("total");
            }

            // Add data to session attributes
            request.getSession().setAttribute("studentList", studentList);
            request.getSession().setAttribute("totalStudent", totalStudent);
            request.getSession().setAttribute("selectedCourse", selectedCourse);

            response.sendRedirect(request.getContextPath() + "/admin/studentList.jsp");

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
