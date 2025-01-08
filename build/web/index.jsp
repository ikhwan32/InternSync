<%-- 
    Document   : index
    Created on : Dec 13, 2024, 1:19:16 AM
    Author     : myPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Internship Management System</title>
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
            max-width: 400px;
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
            <h2>Log In</h2>

            <form action="Login.do" method="POST">
                <div class="mb-3">
                    <label class="form-label">Username :</label>
                    <input type="text" class="form-control" name="username" placeholder="Username" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Password :</label>
                    <input type="password" class="form-control" name="password" placeholder="Password" required>
                </div>
                <button type="submit" class="btn btn-primary submit-btn">Submit</button>
                <div class="register-text">
                    Don't have an account? <a href="register.jsp">Register</a>
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