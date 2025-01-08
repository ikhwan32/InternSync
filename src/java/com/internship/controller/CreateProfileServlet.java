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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.internship.model.Student;
import com.internship.model.User;
import com.internship.controller.DBConnection;

/**
 *
 * @author myPC
 */
@WebServlet(name = "CreateProfileServlet", urlPatterns = {"/CreateProfileServlet.do"})
public class CreateProfileServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CreateProfileServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateProfileServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        //fetch userID from session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userID = user.getUserID();
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String phoneNumber = user.getPhoneNumber();
        String userType = user.getUserType();

        //create student
        Student student;

        //get all parameters from the form
        String fullName = request.getParameter("fullName");
        String ic = request.getParameter("ic");
        String matric = request.getParameter("matric");
        String address = request.getParameter("address");
        String course = request.getParameter("course");
        String advisor = request.getParameter("advisor");
        String semester = request.getParameter("semester");
        Float cgpa = Float.parseFloat(request.getParameter("cgpa"));
        String studentEmail = request.getParameter("studentEmail");
        String letterAddress = request.getParameter("letterAddress");
        String guardianName = request.getParameter("guardianName");
        String guardianRelation = request.getParameter("guardianRelationship");
        String guardianPhone = request.getParameter("guardianPhone");
        String guardianAddress = request.getParameter("guardianAddress");

        //set student attributes
        student = new Student(userID, username, password, email, phoneNumber, userType, fullName, ic, matric, address, course, advisor,
                semester, cgpa, studentEmail, letterAddress, guardianName, guardianRelation, guardianPhone, guardianAddress);

        //insert student into database
        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            db = DBConnection.dbConnect();
            ps = db.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, userID);
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getStudentIC());
            ps.setString(4, student.getStudentMatric());
            ps.setString(5, student.getStudentAddress());
            ps.setString(6, student.getStudentProgramme());
            ps.setString(7, student.getStudentSemester());
            ps.setString(8, student.getAcademicAdvisor());
            ps.setFloat(9, student.getStudentCGPA());
            ps.setString(10, student.getStudentEmail());
            ps.setString(11, student.getLetterAddress());
            ps.setString(12, student.getGuardianName());
            ps.setString(13, student.getGuardianPhone());
            ps.setString(14, student.getGuardianRelation());
            ps.setString(15, student.getGuardianAddress());
            ps.executeUpdate();
            
            //update profile boolean to true
            ps = db.prepareStatement("UPDATE users SET profile = ? WHERE userID = ?");
            ps.setBoolean(1, true);
            ps.setInt(2, userID);
            ps.executeUpdate();

            
            response.sendRedirect("student/dashboard.jsp");
        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/createprofile.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/createprofile.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/createprofile.jsp");
        } finally {
            try {
                db.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
