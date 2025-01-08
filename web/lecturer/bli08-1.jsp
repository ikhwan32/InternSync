<!--page1-->
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Industrial Supervisor Dashboard - Internship Management System</title>
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
        .card-outer {
            background: none;
            padding: 0;
            margin: 20px;
            border: none;
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            position: relative;
            align-items: center; /* Align items vertically centered */
        }
        .card-outer .btn {
            background-color: #5D8BFF;
            flex-grow: 1; 
            text-align: center; 
        }
        .inner {
            padding: 20px;
            margin: 0;
            border: none;
            flex: 1;
            min-width: 0;
            display: flex;
            flex-direction: column;
        }
        .form-control::placeholder {
            color: #D3D3D3 !important;
        }
        
        /* Style for toggle switch */
        .switch {
            position: relative;
            display: inline-block;
            width: 60px;
            height: 34px;
        }

        .switch input {
            opacity: 0;
            width: 0;
            height: 0;
        }

        .slider {
            position: absolute;
            cursor: pointer;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: #ccc;
            transition: .4s;
            border-radius: 34px;
        }

        .slider:before {
            position: absolute;
            content: "";
            height: 26px;
            width: 26px;
            left: 4px;
            bottom: 4px;
            background-color: white;
            transition: .4s;
            border-radius: 50%;
        }

        input:checked + .slider {
            background-color: #2196F3;
        }

        input:checked + .slider:before {
            transform: translateX(26px);
        }

        /* Checkbox section styling */
        .checkbox-container {
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <c:set var="page" value="dashboard" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>
    
    <div class="dashboard-container">
        
        <!-------------  Form Section ---------------->            
        <div class="card" style="border-radius: 20px;">
            <div class="inner" style="padding-top: 20px;">
                <div style="font-weight: 500; font-size: 25px;">BLI 08</div>
                <div>Academic supervisor evaluation form for report,logbook and company feedback</div>
            </div>
            <br>
            <form action="bli02" method="POST">
                <input type="hidden" name="userType" value="student">
            
                <div>Student information</div><br>
                
                <div class="mb-3">
                    <label class="form-label">Student Name :</label>
                    <input type="text" class="form-control" name="name" placeholder="Student Name" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Matric Number :</label>
                    <input type="text" class="form-control" name="matricNum" placeholder="Matric Number" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Programme :</label>
                    <input type="text" class="form-control" name="programme" placeholder="Programme" required>
                </div>      
                <div class="mb-3">
                    <label class="form-label">Phone Number :</label>
                    <input type="text" class="form-control" name="phoneNum" placeholder="Phone Number" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Industrial Training Period :</label>
                    <input type="text" class="form-control" name="LiDuration" placeholder="Phone Number" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Start Date :</label>
                    <input type="date" class="form-control" name="startDate" placeholder="Supervisor's Name" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">End Date :</label>
                    <input type="date" class="form-control" name="endDate" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Organization Supervisor Name :</label>
                    <input type="text" class="form-control" name="svName" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Organization Name and Address :</label>
                    <input type="text" class="form-control" name="compNameAddress" placeholder="Organization Name and Address" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Office Phone Number :</label>
                    <input type="text" class="form-control" name="compPhone" placeholder="Academic Supervisor Name" required>
                </div><br>
                
                <div>Academic Supervisor information</div>
                <br>
                
                <div class="mb-3">
                    <label class="form-label">Academic supervisor name :</label>
                    <input type="text" class="form-control" name="lectName" placeholder="Academic Supervisor Name" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Office Phone Number :</label>
                    <input type="text" class="form-control" name="lectPhone" required>
                </div>
                <!-------------  button Section ----------------> 
            <div class="card-outer" style="margin-bottom: 0px;">
                <a href="evaluation.jsp" class="btn btn-primary" style='background-color: #5D8BFF; border: none; flex-grow: 1;'>Back</a>
                <a href="bli08-2.jsp" type="submit" class="btn btn-primary" style='background-color: #00D072; border: none; flex-grow: 1;'>Next</a>
            </div>
            </form>
            

            <div class="container my-5">
                <nav>
                    <ul class="pagination d-flex justify-content-center">
                        <li class="page-item">
                        </li>
                        <li class="page-item"><a class="page-link" href="bli08-1.jsp" style="background-color: #5D8BFF; color: white; border: none; border-radius: 10px;">1</a></li>
                        <li class="page-item"><a class="page-link" href="bli08-2.jsp" style="border: none;">2</a></li>
                        <li class="page-item"><a class="page-link" href="bli08-3.jsp" style="border: none;">3</a></li>
                        <li class="page-item"><a class="page-link" href="bli08-4.jsp" style="border: none;">4</a></li>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>

    <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>
</html>