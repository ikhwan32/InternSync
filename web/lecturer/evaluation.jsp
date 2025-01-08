<%-- 
    Document   : task
    Created on : Dec 13, 2024, 3:48:58 PM
    Author     : Itqnazs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Academic Supervisor Dashboard - Internship Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
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

        .dashboard-container {
            flex: 1; 
            margin-left: 100px;
            margin-right: 100px;
        }
        .card {
            background: white;
            border-radius: 10px;
            padding: 25px;
            margin: 20px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 1;
        }
        .card-task {
            background: white;
            border-radius: 10px;
            padding: 25px;
            margin: 20px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: 2px solid lightgrey;
            overflow: hidden;
            z-index: 1;
            height: 280px;
            
        }
        .card-outer{
            background: none;
            padding: 0px;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            position: relative;
        }
        .cardforlogo{
            background: none;
            padding: 0px;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            gap: 10px;
            align-items: center;
            justify-content: center;
        }
        .cardforlogo img{
            max-width: auto;
            height: auto;
        }
        .inner {
            padding: 20px;
            margin: 0px;
            border: none;
            flex: 1;
            min-width: 0px;
            display: flex;
            flex-direction: column;
        }
        .dropdown{
            position: absolute;
            right: 0;
        }
        .btn-secondary.dropdown-toggle {
            background-color: #ffffff; 
            color: #333; 
            border-color: #5D8BFF; 
        }
        .btn-secondary.dropdown-toggle:hover {
            background-color: #5D8BFF; 
            color: white; 
            border-color: #5D8BFF; 
        }
        .dropdown-item:hover {
            background-color: #5D8BFF; 
            color: white;
        }

    </style>
</head>
<body>
    <c:set var="page" value="dashboard" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    
    <div class="dashboard-container">
        
        <!-------------  task Section ---------------->            
        <div class="card" style="border-radius: 20px;">
            <div class="card-outer">
                <div class="inner" style="padding-top: 20px;">
                    <div style="font-weight: 500; font-size: 25px;">Evaluation</div>
                    <div>Forms</div>
                </div>
                
            <form action="submitDropdownSelection.jsp" method="POST">
                <div class="card-outer" style='padding-top: 20px;'>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false" style="width: 250px; border-radius: 10px;">
                            ${param.selectedStudent != null ? param.selectedStudent : 'Select Student'}
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="selectStudent('studentName1')">studentName1</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectStudent('studentName2')">studentName2</a></li>
                            <li><a class="dropdown-item" href="#" onclick="selectStudent('studentName3')">studentName3</a></li>
                        </ul>
                    </div>
                    <input type="hidden" name="selectedStudent" id="selectedStudentInput">
                    <a href="#" type="submit" class="btn btn-primary" style='width: 100px; background-color: #5D8BFF;'>Search</a>
                </div>
            </form>

            <script>
                function selectStudent(name) {
                    document.getElementById('dropdownMenuButton').textContent = name;
                    document.getElementById('selectedStudentInput').value = name;
                }
            </script>

            </div>
            
            <div class="card-task" >
                <div class="cardforlogo" >
                    <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="thumbnail" style="border-radius: 20px; width: 200px; height: 200px">
                    <div class="inner" style="padding-top: 20px; ">
                        <div style="font-weight: 500; font-size: 30px;">BLI 06</div>
                        <div>Industrial training visit evaluation form</div>
                        <a href="BLI06-1.jsp" class="btn btn-primary" style='width: 200px; margin-top: 10px; background-color: #5D8BFF;'>Open</a>
                    </div>
                </div>
            </div>
            <div class="card-task" >
                <div class="cardforlogo" >
                    <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="thumbnail" style="border-radius: 20px; width: 200px; height: 200px">
                    <div class="inner" style="padding-top: 20px; ">
                        <div style="font-weight: 500; font-size: 30px;">BLI 08</div>
                        <div>Academic supervisor evaluation form</div>
                        <a href="bli08-1.jsp" class="btn btn-primary" style='width: 200px; margin-top: 10px; background-color: #5D8BFF;'>Open</a>
                    </div>
                </div>
            </div>
        </div>
        

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>

</html>
