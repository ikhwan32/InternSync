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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.internship.controller.DBConnection;
import com.internship.model.LogBook;
import com.internship.model.User;
import java.io.PrintWriter;

/**
 *
 * @author myPC
 */
public class loadLogServlet extends HttpServlet {

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
            out.println("<title>Servlet loadLogServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loadLogServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
             HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        int userID = user.getUserID();
        List<LogBook> logbookEntries = new ArrayList<>(); // Use a List
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (Connection db = DBConnection.dbConnect();
             PreparedStatement stmt = db.prepareStatement("SELECT logBookID, attendance, date, description FROM logbook WHERE userID = ? ORDER BY date DESC")) {

            stmt.setInt(1, userID);
            try (ResultSet result = stmt.executeQuery()) {
                while (result.next()) {
                    LogBook logbook = new LogBook();
                    logbook.setLogBookID(result.getInt("logBookID"));
                    String dateString = result.getString("date");
                    Date dateConvert = dateFormat.parse(dateString);
                    logbook.setDate(dateConvert);
                    logbook.setDescription(result.getString("description"));
                    logbook.setAttendance(result.getBoolean("attendance"));

                    // Add each logbook entry to the list
                    logbookEntries.add(logbook);
                }
            }

            // Set the list as a request attribute
            request.setAttribute("logbookEntries", logbookEntries);
            session.setAttribute("success", "Kelazz.");
            // Forward to attendance.jsp
            response.sendRedirect(request.getContextPath() + "/student/attendance.jsp");

        } catch (ClassNotFoundException e) {
            session.setAttribute("error", "Database driver not found. Please contact administrator.");
            request.getRequestDispatcher("/student/attendance.jsp").forward(request, response);
        } catch (SQLException e) {
            session.setAttribute("error", "Database error: " + e.getMessage());
            request.getRequestDispatcher("/student/attendance.jsp").forward(request, response);
        } catch (Exception e) {
            // Catch any other exception
            e.printStackTrace(); // Log the exception details
            session.setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            request.getRequestDispatcher("/student/attendance.jsp").forward(request, response);
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
        processRequest(request, response);
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
