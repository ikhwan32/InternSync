<%-- 
    Document   : testDB
    Created on : Dec 13, 2024, 8:58:09 PM
    Author     : myPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@page import="java.sql.*"%>
    <%
    Connection conn = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship", "root", "");
        out.println("Database is connected!");
    } catch (Exception e) {
        out.println("Database is not connected! Error: " + e.getMessage());
    }
    %>

    <%
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            out.println(rs.getString("username"));
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } %>

    </body>
</html>
