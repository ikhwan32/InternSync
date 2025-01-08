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
import com.internship.model.BLI01;
/**
 *
 * @author myPC
 */
public class BLI01Submit extends HttpServlet {

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
            out.println("<title>Servlet BLI01Submit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BLI01Submit at " + request.getContextPath() + "</h1>");
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

        BLI01 bli01;

        String name = request.getParameter("name");
        String icNo = request.getParameter("icNumber");
        String matricNo = request.getParameter("studentId");
        String programme = request.getParameter("courseCode");
        String academicSupervisor = request.getParameter("academicAdvisor");
        int semester = Integer.parseInt(request.getParameter("semester"));
        float cgpa = Float.parseFloat(request.getParameter("cgpa"));
        String phoneNum = request.getParameter("phoneNumber");
        String letterAddress = request.getParameter("letterAddress");
        String uitmEmail = request.getParameter("email");
        String guardianName = request.getParameter("guardianName");
        String guardianRelation = request.getParameter("guardianRelation");
        String guardianPhone = request.getParameter("guardianPhone");
        String guardianAddress = request.getParameter("guardianAddress");
        String compNameFirst = request.getParameter("compNameFirst");
        String compAddressFirst = request.getParameter("compAddressFirst");
        String compNameSecond = request.getParameter("compNameSecond");
        String compAddressSecond = request.getParameter("compAddressSecond");

        bli01 = new BLI01(name, icNo, matricNo, programme, academicSupervisor, semester, cgpa, phoneNum, letterAddress, uitmEmail, guardianName, guardianRelation, guardianPhone, guardianAddress, compNameFirst, compAddressFirst, compNameSecond, compAddressSecond);

        Connection db = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            db=DBConnection.dbConnect();
            //create BLI table first
            String query = "INSERT INTO BLI (userID_student, type) VALUES (?, ?)";
            ps = db.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setString(2, "BLI01");
            ps.executeUpdate();

            //get the BLI ID using userID and bli type
            query = "SELECT bliID FROM BLI WHERE userID_student = ? AND type = ?";
            ps = db.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setString(2, "BLI01");
            rs = ps.executeQuery();

            int bliID = 0;
            if(rs.next()) {
                bliID = rs.getInt("bliID");
            }

            //insert into BLI01 table
            query = "INSERT INTO BLI01 (bliID, name, icNo, matricNo, programme, academicAdvisor, semester, cgpa, phoneNum, letterAddress, uitmEmail, guardianName, guardianRelation, guardianPhone, guardianAddress, compNameFirst, compAddressFirst, compNameSec, compAddressSec) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = db.prepareStatement(query);
            ps.setInt(1, bliID);
            ps.setString(2, bli01.getName());
            ps.setString(3, bli01.getIcNo());
            ps.setString(4, bli01.getMatricNo());
            ps.setString(5, bli01.getProgramme());
            ps.setString(6, bli01.getAcademicSupervisor());
            ps.setInt(7, bli01.getSemester());
            ps.setFloat(8, bli01.getCgpa());
            ps.setString(9, bli01.getPhoneNum());
            ps.setString(10, bli01.getLetterAddress());
            ps.setString(11, bli01.getUitmEmail());
            ps.setString(12, bli01.getGuardianName());
            ps.setString(13, bli01.getGuardianRelation());
            ps.setString(14, bli01.getGuardianPhone());
            ps.setString(15, bli01.getGuardianAddress());
            ps.setString(16, bli01.getCompNameFirst());
            ps.setString(17, bli01.getCompAddressFirst());
            ps.setString(18, bli01.getCompNameSecond());
            ps.setString(19, bli01.getCompAddressSecond());
            ps.executeUpdate();

            request.getSession().setAttribute("success", "Successfully submitted BLI01.");
            response.sendRedirect(request.getContextPath() + "/checkBLIStatusServlet.do");

        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/student/bli01.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/bli01.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/student/bli01.jsp");
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
