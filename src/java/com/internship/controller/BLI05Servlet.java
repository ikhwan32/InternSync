package com.internship.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet("/supervisor/BLI05Servlet")
public class BLI05Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            // Calculate section B total
            int sectionB = 0;
            for(int i = 1; i <= 16; i++) {
                String mark = request.getParameter("selectedb" + i);
                if(mark != null && !mark.isEmpty()) {
                    sectionB += Integer.parseInt(mark);
                }
            }

            // Calculate section C subsection totals
            int[] sectionCTotals = new int[7];
            
            // Interpersonal Skills (1-3)
            sectionCTotals[0] = calculateSubsectionTotal(request, "c", 1, 3);
            
            // Communication Skills (4-7)
            sectionCTotals[1] = calculateSubsectionTotal(request, "c", 4, 7);
            
            // Intellectual Skills (8-12)
            sectionCTotals[2] = calculateSubsectionTotal(request, "c", 8, 12);
            
            // Initiative Taking (13-16)
            sectionCTotals[3] = calculateSubsectionTotal(request, "c", 13, 16);
            
            // Job Attitude (17-21)
            sectionCTotals[4] = calculateSubsectionTotal(request, "c", 17, 21);
            
            // Personal Efficiency (22-25)
            sectionCTotals[5] = calculateSubsectionTotal(request, "c", 22, 25);
            
            // Leadership Skills (26-28)
            sectionCTotals[6] = calculateSubsectionTotal(request, "c", 26, 28);

            // Calculate section D total
            int sectionD = 0;
            for(int i = 1; i <= 4; i++) {
                String mark = request.getParameter("selectedd" + i);
                if(mark != null && !mark.isEmpty()) {
                    sectionD += Integer.parseInt(mark);
                }
            }

            // Get section E inputs
            String weakness = request.getParameter("formE1");
            String strength = request.getParameter("formE2");
            boolean recommend = "option1".equals(request.getParameter("option"));

            conn = DBConnection.dbConnect();

            // Get or create BLI record
            int bliID = getBliID(conn, request);

            // Insert into BLI05
            String upsertQuery = "INSERT INTO bli05 (bliID, sectionB, totalMark1, totalMark2, totalMark3, " +
                "totalMark4, totalMark5, totalMark6, totalMark7, sectionD, weakness, strength, recommend) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                "ON DUPLICATE KEY UPDATE " +
                "sectionB = VALUES(sectionB), totalMark1 = VALUES(totalMark1), " +
                "totalMark2 = VALUES(totalMark2), totalMark3 = VALUES(totalMark3), " +
                "totalMark4 = VALUES(totalMark4), totalMark5 = VALUES(totalMark5), " +
                "totalMark6 = VALUES(totalMark6), totalMark7 = VALUES(totalMark7), " +
                "sectionD = VALUES(sectionD), weakness = VALUES(weakness), " +
                "strength = VALUES(strength), recommend = VALUES(recommend)";

            ps = conn.prepareStatement(upsertQuery);
            ps.setInt(1, bliID);
            ps.setInt(2, sectionB);
            for(int i = 0; i < 7; i++) {
                ps.setInt(i + 3, sectionCTotals[i]);
            }
            ps.setInt(10, sectionD);
            ps.setString(11, weakness);
            ps.setString(12, strength);
            ps.setBoolean(13, recommend);

            int result = ps.executeUpdate();
            
            if(result > 0) {
                session.setAttribute("success", "BLI05 form submitted successfully");
            } else {
                session.setAttribute("error", "Failed to submit BLI05 form");
            }
            
            response.sendRedirect(request.getContextPath() + "/supervisor/task.jsp");
            
        } catch(Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "Error: " + e.getMessage());
            response.sendRedirect(request.getContextPath() + "/supervisor/task.jsp");
        } finally {
            try {
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(conn != null) conn.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int calculateSubsectionTotal(HttpServletRequest request, String prefix, int start, int end) {
        int total = 0;
        for(int i = start; i <= end; i++) {
            String mark = request.getParameter("selected" + prefix + i);
            if(mark != null && !mark.isEmpty()) {
                total += Integer.parseInt(mark);
            }
        }
        return total;
    }

    private int getBliID(Connection conn, HttpServletRequest request) throws Exception {
        String selectedStudent = request.getParameter("studentName");
        
        PreparedStatement ps = conn.prepareStatement(
            "SELECT bli.bliID FROM bli " +
            "JOIN student ON bli.userID_student = student.userID " +
            "WHERE student.studentName = ?");
        ps.setString(1, selectedStudent);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            return rs.getInt("bliID");
        }
        
        throw new ServletException("No BLI record found for student: " + selectedStudent);
    }
}