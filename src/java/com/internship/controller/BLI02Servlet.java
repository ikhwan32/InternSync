package com.internship.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @Itqnazs
 */
@WebServlet("/supervisor/BLI02Servlet")
public class BLI02Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("Starting BLI02Servlet doPost method");
        
        HttpSession session = request.getSession();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            // Log received parameters
            String selectedStudent = request.getParameter("selectedStudent");
            String organizationName = request.getParameter("compName");
            String address = request.getParameter("compAddress");
            String phoneNumber = request.getParameter("compPhone");
            String faxNumber = request.getParameter("compFax");
            String supervisorName = request.getParameter("compSupervisor");
            String email = request.getParameter("compEmail");
            boolean hasAllowance = request.getParameter("allowance") != null;
            boolean hasHostel = request.getParameter("hostel") != null;
            String relatedTasks = request.getParameter("relatedTask");
            
            System.out.println("Received Parameters:");
            System.out.println("Selected Student: " + selectedStudent);
            System.out.println("Organization Name: " + organizationName);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Fax Number: " + faxNumber);
            System.out.println("Supervisor Name: " + supervisorName);
            System.out.println("Email: " + email);
            System.out.println("Has Allowance: " + hasAllowance);
            System.out.println("Has Hostel: " + hasHostel);
            System.out.println("Related Tasks: " + relatedTasks);
            
            // Database operations start
            System.out.println("Starting database operations");
            conn = DBConnection.dbConnect();

            // Get student ID from student table
            String studentQuery = "SELECT userID, studentIC, studentMatric FROM student WHERE studentName = ?";
            ps = conn.prepareStatement(studentQuery);
            ps.setString(1, selectedStudent);
            System.out.println("Executing student query: " + studentQuery + " with name: " + selectedStudent);
            
            rs = ps.executeQuery();
            
            if (!rs.next()) {
                System.out.println("Error: Student not found in database");
                throw new ServletException("Student not found");
            }
            
            int studentID = rs.getInt("userID");
            String studentIC = rs.getString("studentIC");
            String studentMatric = rs.getString("studentMatric");
            System.out.println("Found student ID: " + studentID);

            // First get or create the student's internship
            String internshipQuery = "SELECT internID FROM internship WHERE userID_student = ?";
            ps = conn.prepareStatement(internshipQuery);
            ps.setInt(1, studentID);
            rs = ps.executeQuery();

            Integer internID = null;
            if (rs.next()) {
                internID = rs.getInt("internID");
                System.out.println("Found internship ID: " + internID);
            } else {
                // Create a new internship record if none exists
                String createInternshipQuery = "INSERT INTO internship (internID, userID_student, allowance, startDate, endDate) VALUES (NULL, ?, NULL, NULL, NULL)";
                ps = conn.prepareStatement(createInternshipQuery, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, studentID);
                ps.executeUpdate();
                
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    internID = rs.getInt(1);
                    System.out.println("Created new internship ID: " + internID);
                }
            }

            // Insert or update BLI entry
            String upsertBLIQuery = "INSERT INTO bli (userID_student, status, internID) VALUES (?, 'pending', ?) " +
                "ON DUPLICATE KEY UPDATE status = VALUES(status), internID = VALUES(internID)";
            ps = conn.prepareStatement(upsertBLIQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, studentID);
            ps.setObject(2, internID);
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (!rs.next()) {
                throw new ServletException("Failed to create/update BLI record");
            }
            int bliID = rs.getInt(1);
            System.out.println("BLI ID: " + bliID);
                    

            // Update BLI02
            String upsertBLI02Query = "INSERT INTO bli02 (bliID, name, icNo, matricNo, compName, compAddress, " +
                "compPhone, compFax, compSupervisor, compEmail, allowance, hostel, relatedTask) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                "ON DUPLICATE KEY UPDATE " +
                "name = VALUES(name), icNo = VALUES(icNo), matricNo = VALUES(matricNo), " +
                "compName = VALUES(compName), compAddress = VALUES(compAddress), " +
                "compPhone = VALUES(compPhone), compFax = VALUES(compFax), " +
                "compSupervisor = VALUES(compSupervisor), compEmail = VALUES(compEmail), " +
                "allowance = VALUES(allowance), hostel = VALUES(hostel), " +
                "relatedTask = VALUES(relatedTask)";

            ps = conn.prepareStatement(upsertBLI02Query);
            ps.setInt(1, bliID);
            ps.setString(2, selectedStudent);
            ps.setString(3, studentIC);
            ps.setString(4, studentMatric);
            ps.setString(5, organizationName);
            ps.setString(6, address);
            ps.setString(7, phoneNumber);
            ps.setString(8, faxNumber);
            ps.setString(9, supervisorName);
            ps.setString(10, email);
            ps.setDouble(11, hasAllowance ? 1000.00 : 0.00);
            ps.setBoolean(12, hasHostel);
            ps.setString(13, relatedTasks);
            
            int result = ps.executeUpdate();
            System.out.println("BLI02 upsert result: " + result);
            
            if (result > 0) {
                System.out.println("Form submitted successfully");
                session.setAttribute("success", "BLI02 form submitted successfully for " + selectedStudent);
            } else {
                System.out.println("Form submission failed");
                session.setAttribute("error", "Failed to submit BLI02 form");
            }
            
            System.out.println("Redirecting to task.jsp");
            response.sendRedirect(request.getContextPath() + "/supervisor/task.jsp?studentName=" + selectedStudent);
            
        } catch (Exception e) {
            System.out.println("Error occurred during form processing:");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
            
            session.setAttribute("error", "Error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor/task.jsp");
        } finally {
            System.out.println("Cleaning up resources");
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Starting BLI02Servlet doGet method");
        
        String selectedStudent = request.getParameter("studentName");
        System.out.println("Selected student for GET request: " + selectedStudent);
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = DBConnection.dbConnect();
            String query = "SELECT * FROM student WHERE studentName = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, selectedStudent);
            System.out.println("Executing student query in GET: " + query);
            
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Student found, setting attributes");
                request.setAttribute("studentName", rs.getString("studentName"));
                request.setAttribute("endDate", rs.getString("endDate"));
                request.setAttribute("studentPhone", rs.getString("studentPhone"));
                request.setAttribute("studentEmail", rs.getString("studentEmail"));
            } else {
                System.out.println("No student found with name: " + selectedStudent);
            }

            System.out.println("Forwarding to BLI02.jsp");
            request.getRequestDispatcher("/supervisor/BLI02.jsp").forward(request, response);
            
        } catch (Exception e) {
            System.out.println("Error in doGet:");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/supervisor/task.jsp");
        } finally {
            System.out.println("Cleaning up resources in doGet");
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources in doGet: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}