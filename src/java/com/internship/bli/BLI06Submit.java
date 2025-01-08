/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.bli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;
import com.internship.model.BLI;
import com.internship.model.Student;
import com.internship.model.User;
import com.internship.model.BLI03;
/**
 *
 * @author myPC
 */
public class BLI06Submit extends HttpServlet {

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
            out.println("<title>Servlet BLI03Submit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BLI03Submit at " + request.getContextPath() + "</h1>");
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
    HttpSession session = request.getSession();
    User user = (User) session.getAttribute("user");

    if (user == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }

    int userID = user.getUserID();

    // Fetch input parameters from request
    String name = request.getParameter("name");
    String programme = request.getParameter("programme");
    String matricNo = request.getParameter("matricNo");
    String phoneNumber = request.getParameter("phoneNum");
    String startDateStr = request.getParameter("startDate");
    String endDateStr = request.getParameter("endDate");
    String svName = request.getParameter("svName");
    String compNameAddress = request.getParameter("compNameAddress");
    String lectName = request.getParameter("lectName");
    String dateStr = request.getParameter("date");
    float totalMarks = Float.parseFloat(request.getParameter("totalMarks"));
    String comment = request.getParameter("comment");

    // Parse dates
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date startDate, endDate, submissionDate;

    try {
        startDate = sdf.parse(startDateStr);
        endDate = sdf.parse(endDateStr);
        submissionDate = sdf.parse(dateStr);
    } catch (Exception e) {
        request.getSession().setAttribute("error", "Invalid date format. Please use yyyy-MM-dd format.");
        response.sendRedirect(request.getContextPath() + "/student/bli06.jsp");
        return;
    }

    Connection db = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    float calMarks1 = 0, calMarks2 = 0;

    try {
        db = DBConnection.dbConnect();

        // Fetch marks from BLI06-2
        String query = "SELECT marks FROM BLI06_2 WHERE userID = ?";
        ps = db.prepareStatement(query);
        ps.setInt(1, userID);
        rs = ps.executeQuery();
        if (rs.next()) {
            calMarks1 = rs.getFloat("marks");
        }

        // Fetch marks from BLI06-3
        query = "SELECT marks FROM BLI06_3 WHERE userID = ?";
        ps = db.prepareStatement(query);
        ps.setInt(1, userID);
        rs = ps.executeQuery();
        if (rs.next()) {
            calMarks2 = rs.getFloat("marks");
        }

        // Calculate total marks
        totalMarks = calMarks1 + calMarks2;

        // Insert data into BLI06 table
        query = "INSERT INTO BLI06 (userID, name, programme, matricNo, phoneNum, startDate, endDate, svName, compNameAddress, lectName, date, totalMarks, comment) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        ps = db.prepareStatement(query);
        ps.setInt(1, userID);
        ps.setString(2, name);
        ps.setString(3, programme);
        ps.setString(4, matricNo);
        ps.setString(5, phoneNumber);
        ps.setDate(6, new java.sql.Date(startDate.getTime()));
        ps.setDate(7, new java.sql.Date(endDate.getTime()));
        ps.setString(8, svName);
        ps.setString(9, compNameAddress);
        ps.setString(10, lectName);
        ps.setDate(11, new java.sql.Date(submissionDate.getTime()));
        ps.setFloat(12, totalMarks);
        ps.setString(13, comment);
        ps.executeUpdate();

        request.getSession().setAttribute("success", "Data submitted successfully. Total Marks: " + totalMarks);
        response.sendRedirect(request.getContextPath() + "/student/bli06.jsp");

    } catch (ClassNotFoundException e) {
        request.getSession().setAttribute("error", "Database driver not found. Please contact the administrator.");
        response.sendRedirect(request.getContextPath() + "/student/bli06.jsp");
    } catch (SQLException e) {
        request.getSession().setAttribute("error", "Database error: " + e.getMessage());
        response.sendRedirect(request.getContextPath() + "/student/bli06.jsp");
    } finally {
        try {
            if (db != null) db.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}}

