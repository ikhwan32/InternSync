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
import com.internship.controller.DBConnection;

import com.internship.model.Student;
import com.internship.model.User;
/**
 *
 * @author myPC
 */
@WebServlet(name = "saveProfileServlet", urlPatterns = {"/saveProfileServlet.do"})
public class saveProfileServlet extends HttpServlet {

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
            out.println("<title>Servlet saveProfileServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet saveProfileServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        //fetch userID from session
        HttpSession session = request.getSession();
        int userID = (int) session.getAttribute("userID");
        Student student;

        //get all the parameters from the form
        String studentName = request.getParameter("studentName");
        String studentIC = request.getParameter("studentIC");
        String studentMatric = request.getParameter("studentMatric");
        String studentAddress = request.getParameter("studentAddress");
        String studentProgramme = request.getParameter("studentProgramme");
        String academicAdvisor = request.getParameter("academicAdvisor");
        String studentSemester = request.getParameter("studentSemester");
        float studentCGPA = Float.parseFloat(request.getParameter("studentCGPA"));
        String studentEmail = request.getParameter("studentEmail");
        String letterAddress = request.getParameter("letterAddress");
        String guardianName = request.getParameter("guardianName");
        String guardianRelation = request.getParameter("guardianRelationship");
        String guardianPhone = request.getParameter("guardianPhone");
        String guardianAddress = request.getParameter("guardianAddress");

        //set student attributes again
        student = new Student();
        student.setStudentName(studentName);
        student.setStudentIC(studentIC);
        student.setStudentMatric(studentMatric);
        student.setStudentAddress(studentAddress);
        student.setStudentProgramme(studentProgramme);
        student.setAcademicAdvisor(academicAdvisor);
        student.setStudentSemester(studentSemester);
        student.setStudentCGPA(studentCGPA);
        student.setStudentEmail(studentEmail);
        student.setLetterAddress(letterAddress);
        student.setGuardianName(guardianName);
        student.setGuardianRelation(guardianRelation);
        student.setGuardianPhone(guardianPhone);
        student.setGuardianAddress(guardianAddress);

        //update student profile into database
        Connection db = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            db = DBConnection.dbConnect();
            String query = "UPDATE student SET studentName = ?, studentIC = ?, studentMatric = ?, studentAddress = ?, studentCourse = ?, academicAdvisor = ?, studentPart = ?, studentCGPA = ?, studentEmail = ?, studentHomeAddress = ?, guardianName = ?, guardianRelation = ?, guardianPhone = ?, guardianAddress = ? WHERE userID = ?";
            pst = db.prepareStatement(query);
            pst.setString(1, student.getStudentName());
            pst.setString(2, student.getStudentIC());
            pst.setString(3, student.getStudentMatric());
            pst.setString(4, student.getStudentAddress());
            pst.setString(5, student.getStudentProgramme());
            pst.setString(6, student.getAcademicAdvisor());
            pst.setString(7, student.getStudentSemester());
            pst.setFloat(8, student.getStudentCGPA());
            pst.setString(9, student.getStudentEmail());
            pst.setString(10, student.getLetterAddress());
            pst.setString(11, student.getGuardianName());
            pst.setString(12, student.getGuardianRelation());
            pst.setString(13, student.getGuardianPhone());
            pst.setString(14, student.getGuardianAddress());
            pst.setInt(15, userID);
            pst.executeUpdate();

            request.getSession().setAttribute("success", "Profile updated successfully");
            response.sendRedirect(request.getContextPath() + "/student/settings.jsp");
        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/student//settings.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student//settings.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student//settings.jsp");
        } finally {
            try {
                db.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
