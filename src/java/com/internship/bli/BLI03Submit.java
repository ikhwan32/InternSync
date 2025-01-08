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
public class BLI03Submit extends HttpServlet {

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
        //processRequest(request, response);

        //fetch userID
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userID = user.getUserID();

        BLI03 bli03 = new BLI03();
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String matricNo = request.getParameter("studentId");
        String programme = request.getParameter("courseCode");
        String phoneNum = request.getParameter("phoneNumber");
        String Address = request.getParameter("address");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        String compName = request.getParameter("companyName");
        String compAddress = request.getParameter("companyAddress");
        String compPhone = request.getParameter("companyPhone");
        String compFax = request.getParameter("companyFax");
        String compSupervisor = request.getParameter("companySupervisor");
        String svPhone = request.getParameter("personInChargePhoneNumber");
        String svEmail = request.getParameter("personInChargeEmail");
        String BLI02 = null;
        String offerLetter = null;

        Date start, end;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            start = sdf.parse(startDate);
            end = sdf.parse(endDate);
        } catch (Exception e) {
            request.getSession().setAttribute("error", "Invalid date format. Please use yyyy-MM-dd format.");
            response.sendRedirect(request.getContextPath() + "/student/bli03.jsp");
            return;
        }

        bli03 = new BLI03(0, "Pending", email, name, matricNo, programme, phoneNum, Address, start, end, compName, compAddress, compPhone, compFax, compSupervisor, svPhone, svEmail, BLI02, offerLetter);

        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            db = DBConnection.dbConnect();
            //create BLI table first
            String query = "INSERT INTO BLI (userID_student, type) VALUES (?, ?)";
            ps = db.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setString(2, "BLI03");
            ps.executeUpdate();


            //get the BLI ID
            query = "SELECT MAX(bliID) FROM BLI WHERE userID_student = ? AND type = ?";
            ps = db.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setString(2, "BLI03");
            rs = ps.executeQuery();

            int bliID = 0;
            if (rs.next()) {
                bliID = rs.getInt(1);
            }

            //insert into BLI03 table
            query = "INSERT INTO BLI03 (bliID, email, name, matricNum , programme, phoneNum, Address, startDate, endDate, compName, compAddress, compPhone, compFax, compSupervisor, svPhone, svEmail, BLI02, offerLetter) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = db.prepareStatement(query);
            ps.setInt(1, bliID);
            ps.setString(2, bli03.getEmail());
            ps.setString(3, bli03.getName());
            ps.setString(4, bli03.getMatricNo());
            ps.setString(5, bli03.getProgramme());
            ps.setString(6, bli03.getPhoneNum());
            ps.setString(7, bli03.getAddress());
            ps.setDate(8, new java.sql.Date(start.getTime()));
            ps.setDate(9, new java.sql.Date(end.getTime()));
            ps.setString(10, bli03.getCompName());
            ps.setString(11, bli03.getCompAddress());
            ps.setString(12, bli03.getCompPhone());
            ps.setString(13, bli03.getCompFax());
            ps.setString(14, bli03.getCompSupervisor());
            ps.setString(15, bli03.getSvPhone());
            ps.setString(16, bli03.getSvEmail());
            ps.setString(17, bli03.getBLI02());
            ps.setString(18, bli03.getOfferLetter());
            ps.executeUpdate();

            request.getSession().setAttribute("success", "Your application has been submitted successfully.");
            response.sendRedirect(request.getContextPath() + "/checkBLIStatusServlet.do");


        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/student/bli03.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/bli03.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/bli03.jsp");
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
