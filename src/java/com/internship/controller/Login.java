/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;

import java.io.IOException;
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
import javax.swing.text.StyledEditorKit.BoldAction;

import com.internship.model.User;
import com.internship.controller.DBConnection;
/**
 *
 * @author myPC
 */
@WebServlet(name = "Login", urlPatterns = {"/Login.do"})
public class Login extends HttpServlet {

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
        
       
    }

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
        response.sendRedirect(request.getContextPath() + "/index.jsp");
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        // Validate input parameters
        if (username == null || username.trim().isEmpty() || 
            password == null || password.trim().isEmpty()) {
            request.getSession().setAttribute("error", "Please fill in all required fields");
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return;
        }

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = DBConnection.dbConnect();
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship", "root", "");
            
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                //fetch user data from database
                int userID = rs.getInt("userID");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String userAuth = rs.getString("userType");
                Boolean profile = rs.getBoolean("profile");

                // Create user object and set session
                User user = new User(userID, username, password, email, phoneNumber, userAuth);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                session.setAttribute("username", username);
                session.setAttribute("userID", userID);
                session.setAttribute("userType", userAuth);
                //set attribute for student
                

                // Check if profile needs to be created
                

                // If profile exists, redirect to appropriate dashboard
                String contextPath = request.getContextPath();
                switch(userAuth.toLowerCase()) {
                    case "student":
                    if(!profile) {
                        response.sendRedirect(request.getContextPath() + "/createprofile.jsp");
                        return;
                    }
                        response.sendRedirect(contextPath + "/checkBLIStatusServlet.do");
                        break;
                    case "admin_university":
                        response.sendRedirect(contextPath + "/admin/dashboard.jsp");
                        break;
                    case "internship_supervisor":
                        response.sendRedirect(contextPath + "/supervisor/dashboard.jsp");
                        break;
                    case "university_supervisor":
                        response.sendRedirect(contextPath + "/lecturer/dashboard.jsp");
                        break;
                    default:
                        response.sendRedirect(contextPath + "/index.jsp");
                }
            } else {
                request.getSession().setAttribute("error", "Invalid username or password");
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            }
            
        } catch (ClassNotFoundException e) {
            request.getSession().setAttribute("error", "Database driver not found. Please contact administrator.");
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } catch (SQLException e) {
            request.getSession().setAttribute("error", "Database error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } catch (Exception e) {
            request.getSession().setAttribute("error", "An unexpected error occurred: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
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
