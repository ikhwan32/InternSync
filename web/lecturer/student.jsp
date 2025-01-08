<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Academic Supervisor Dashboard - Internship Management System</title>
    <style>
        body {
            background-image: url('<c:url value="/assets/images/background.png"/>'); 
            background-size: cover;     
            background-repeat: no-repeat; 
            background-attachment: fixed; 
            background-position: center;  
            min-height: 100vh;
            margin: 0;
            padding: 0;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
            display: flex;
            flex-direction: column;
            
        }
        .cards {
            display: flex;
            justify-content: center;
            gap: 100px;
            margin-top: 30px;
        }
        .card {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            text-align: center;
            padding: 30px;
            width: 400px;
            margin-top: 140px;
        }
        .card .icon {
            font-size: 50px;
            color: #007bff;
            margin-bottom: 10px;
        }
        .card .count {
            font-size: 30px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .card .label {
            font-size: 16px;
            color: #555;
            margin-bottom: 15px;
        }
        .card .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            cursor: pointer;
        }
        .card .button:hover {
            background-color: #0056b3;
        }
        .dashboard-container {
            flex: 1; 
            margin-left: 100px;
            margin-right: 100px;
        }        
    </style>
</head>
<body>
    <c:set var="page" value="admin" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    <div class="dashboard-container">
    <div class="cards">
            <div class="card" style="border-radius: 20px;">
                <div class="icon">
                    <img src="<c:url value='/assets/images/Users.png'/>">
                </div>
                <div class="count">4</div>
                <div class="label">Student List</div>
                <a href="studentList.jsp" class="button" style="background-color: #5D8BFF;">Open</a>
            </div>
            <div class="card" style="border-radius: 20px;">
                <div class="icon">
                    <img src="<c:url value='/assets/images/Users.png'/>">
                </div>
                <div class="count">4</div>
                <div class="label">Student Task</div>
                <a href="studentTask.jsp" class="button" style="background-color: #5D8BFF;">Open</a>
            </div>
        </div>        
    </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
            <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>
</html>