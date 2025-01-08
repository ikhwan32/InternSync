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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;

import com.internship.model.Student;

/**
 *
 * @author myPC
 */
@WebServlet("/supervisor/TaskServlet")
public class TaskServlet extends HttpServlet {

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
    
    Connection db = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        db = DBConnection.dbConnect();
        // Update query to select all fields
        String query = "SELECT * FROM student";
        ps = db.prepareStatement(query);

        ArrayList<Student> studentList = new ArrayList<Student>();

        rs = ps.executeQuery();

        while (rs.next()) {
            Student student = new Student();
            student.setStudentName(rs.getString("studentName"));
            student.setEndDate(rs.getString("endDate"));       // Add this
            student.setStudentPhone(rs.getString("studentPhone")); // Add this
            student.setStudentEmail(rs.getString("studentEmail")); // Add this
            studentList.add(student);
        }

        // Get the selected student name from the request
        String selectedStudent = request.getParameter("studentName");
        
        // Store the list and selected student in session
        HttpSession session = request.getSession();
        session.setAttribute("studentList", studentList);
        
        // Build the redirect URL with the correct context path
        StringBuilder redirectURL = new StringBuilder();
        redirectURL.append(request.getContextPath())
                  .append("/supervisor/task.jsp");
        
        if (selectedStudent != null && !selectedStudent.trim().isEmpty()) {
            redirectURL.append("?studentName=")
                      .append(java.net.URLEncoder.encode(selectedStudent, "UTF-8"));
        }
        
        // Perform the redirect
        response.sendRedirect(redirectURL.toString());

    } catch (Exception e) {
        e.printStackTrace(); // Log the error for debugging
        request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
        response.sendRedirect(request.getContextPath() + "/supervisor/settings.jsp");
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (db != null) db.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
    processRequest(request, response);  // Just call processRequest since it now has all the fields
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
