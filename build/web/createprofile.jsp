<%-- 
    Document   : createprofile
    Created on : Dec 17, 2024, 12:36:15 PM
    Author     : myPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.internship.model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Onboarding - Internship Management System</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f0f0f0;
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .main-container {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
            padding: 15px;
        }
        .login-container {
            background: white;
            padding: 2rem;
            border-radius: 15px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            width: 100%;
            max-width: 800px;
        }
        .btn-toggle-group {
            display: flex;
            gap: 5px;
            margin-bottom: 20px;
            width: 100%;
            flex-wrap: nowrap;
        }
        .btn-toggle-group .btn {
            flex: 1;
            padding: 8px 4px;
            font-size: 14px;
            white-space: nowrap;
        }
        .btn-toggle-group .btn.active {
            background-color: #0d6efd;
            color: white;
            border-color: #0d6efd;
        }
        .submit-btn {
            width: 100%;
        }
        .register-text {
            text-align: center;
            margin-top: 1rem;
        }
        .form-control {
            padding: 8px 12px;
            margin-bottom: 15px;
        }
        .form-label {
            color: #212529;
            margin-bottom: 5px;
        }
        h1 {
            font-size: 24px;
            text-align: center;
            margin-bottom: 15px;
            width: 100%;
        }
        h2 {
            font-size: 20px;
            text-align: center;
            margin-bottom: 20px;
            width: 100%;
        }
        #userType {
            display: none;
        }
    </style>
</head>
<body>
    <div class="main-container">
        <div class="login-container">
            <h1>Internship Management System</h1>
            <h2>Create Your Profile</h2>

           
            <%-- Display user data from session --%>
            <% 
                User user = (User) session.getAttribute("user");
                if (user != null) { 
            %>
                <div class="alert alert-info mt-3">
                    <strong>Your Information:</strong>
                    <p>User ID: <%= user.getUserID() %></p>
                    <p>Username: <%= user.getUsername() %></p>
                    <p>Email: <%= user.getEmail() %></p>
                    <p>Phone: <%= user.getPhoneNumber() %></p>
                </div>
            <% } else { %>
                <div class="alert alert-warning mt-3">
                    No user data found in session. Please log in again.
                </div>
            <% } %>

            <form class="row g-3" action="CreateProfileServlet.do" method="POST">
                    <div class="col-md-6">
                      <label for="fullName" class="form-label">Full Name</label>
                      <input type="text" name="fullName" class="form-control" id="fullName">
                    </div>
                    <div class="col-md-6">
                      <label for="ic" class="form-label">IC Number</label>
                      <input type="text" name="ic" class="form-control" id="ic">
                    </div>
                    <div class="col-12">
                      <label for="address" class="form-label">Address</label>
                      <textarea type="text" name="address" class="form-control" id="address"></textarea>
                    </div>
                    <div class="col-md-6">
                        <label for="studentEmail" class="form-label">Student Email (@student.uitm.edu.my)</label>
                        <input type="email" name="studentEmail" class="form-control" id="studentEmail">
                    </div>
                    <div class="col-md-6">
                        <label for="advisor" class="form-label">Academic Advisor</label>
                        <input type="text" name="advisor" class="form-control" id="advisor">
                      </div>
                    <div class="col-md-3">
                        <label for="matric" class="form-label">Matric Number</label>
                        <input type="text" name="matric" class="form-control" id="matric">
                      </div>
                    <div class="col-md-3">
                        <label for="cgpa" class="form-label">Latest CGPA</label>
                        <input type="text" name="cgpa" class="form-control" id="cgpa">
                    </div>
                    <div class="col-md-3">
                        <label for="semester" class="form-label">Semester</label>
                        <input type="text" name="semester" class="form-control" id="semester">
                      </div>
                    <div class="col-md-3">
                        <label for="course" class="form-label">Course Code</label>
                        <input type="text" name="course" class="form-control" id="course">
                    </div>
                    <div class="col-12">
                        <label for="letterAddress" class="form-label">Letter Address</label>
                        <textarea type="text" name="letterAddress" class="form-control" id="letterAddress"></textarea>
                    </div>
                    <div class="col-md-6">
                        <label for="guardianName" class="form-label">Guardian Name</label>
                        <input type="text" name="guardianName" class="form-control" id="guardianName">
                      </div>
                      <div class="col-md-3">
                        <label for="guardianPhone" class="form-label">Guardian Phone</label>
                        <input type="text" name="guardianPhone" class="form-control" id="guardianPhone">
                      </div>
                      <div class="col-md-3">
                        <label for="guardianRelationship" class="form-label">Guardian Relationship</label>
                        <select name="guardianRelationship" class="form-select" id="guardianRelationship">
                          <option value="Parent" selected>Parent</option>
                          <option value="Guardian">Guardian</option>
                        </select>
                      </div>
                      <div class="col-12">
                        <label for="guardianAddress" class="form-label">Guardian Address</label>
                        <textarea type="text" name="guardianAddress" class="form-control" id="guardianAddress"></textarea>
                      </div>
                    <div class="col-12">
                      <button type="submit" class="btn btn-primary">Create My Profile</button>
                    </div>
            </form>
            
            <%-- Display error message if any --%>
            <% if (session.getAttribute("error") != null) { %>
                <div class="alert alert-danger mt-3">
                    <%= session.getAttribute("error") %>
                    <% session.removeAttribute("error"); %>
                </div>
            <% } %>

            <%-- Display success message if any --%>
            <% if (session.getAttribute("success") != null) { %>
                <div class="alert alert-success mt-3">
                    <%= session.getAttribute("success") %>
                    <% session.removeAttribute("success"); %>
                </div>
            <% } %>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    
</body>
</html>
