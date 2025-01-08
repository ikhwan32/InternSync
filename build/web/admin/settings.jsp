<%-- 
    Document   : settings
    Created on : Dec 13, 2024, 3:49:19 PM
    Author     : Itqnazs
--%>

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
            background-color: #E8E8E8 !important; 
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
        .subcard {
            position: relative;
            background: #F6F6F6;
            border-radius: 20px;
            padding: 0px;
            margin-bottom: 10px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 2;
            height: 400px;
        }
        .subcard2 {
            background-image: url('<c:url value="/assets/images/background2.png"/>'); 
            background-size: cover;     
            background-repeat: no-repeat; 
            background-attachment: fixed; 
            background-position: center;  
            border-radius: 20px;
            padding: 0px;
            margin: 0px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 4;
            height: 200px;
        }
        .subcard3 {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;  
            align-items: center;     
            justify-content: center; 
            background: none;
            border-radius: 20px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            z-index: 4;
            pointer-events: none;    
        }

        .subcard3 img {
            margin-bottom: 10px;     
        }

        .subcard3 span {
            display: block;          
            text-align: center;      
            margin-bottom: 5px;           
            font-weight: 1000;
            color: grey;
        }
        .subcard4 {
            background: #F6F6F6;
            border-radius: 20px;
            padding: 25px;
            margin: 20px 300px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 2;
        }
        .form-control {
            padding: 8px 12px;
            margin-bottom: 15px;
        }
        .form-label {
            color: #212529;
            margin-bottom: 5px;
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
        .card-outer .btn {
            background-color: #5D8BFF;
            flex-grow: 1; 
            text-align: center; 
        }        
        /*
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
*/
    .student-avatar {
        width: 24px; height: 24px; border-radius: 50%; background: #f0f0f0;
        
        
        
    }

    </style>
</head>
<body>
    <c:set var="page" value="dashboard" scope="request"/>
    <%@ include file="/WEB-INF/jspf/admin/header.jspf" %>
    
    <div class="dashboard-container">
        
        <!-------------  settings Section ---------------->            
        <div class="card" style="border-radius: 20px; padding: 0px;">
            <div class="subcard">
                <div class="subcard2">
                    <div class="subcard3">
                        <img src="<c:url value='/assets/images/avatar.png'/>" width="200" height="200" alt="Avatar" style="width: 200px; height: 200px; border-radius: 50%;">
                        <span style="font-size: 20px; color: darkslategrey;">ADMIN NAME</span>
                        <span>user_id</span>
                        <span>Admin | University_name</span>
                    </div>
                    
                </div>
            </div>
            <div class="subcard4">
                <div style="text-align: center; color: #212529; font-size: 20px;">Personal Information</div><br><br>
                <form id="profileSettingForm" action="#" method="POST">
                    <div class="mb-3">
                        <label class="form-label">Full Name :</label>
                        <input type="text" class="form-control" name="fullname" placeholder="FullName" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Contact :</label>
                        <input type="text" class="form-control" name="contact" placeholder="Contact" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Email :</label>
                        <input type="text" class="form-control" name="email" placeholder="Email" required>
                    </div>                    
                    
                </form>
            </div>
                        
            <!-------------  button Section ----------------> 
            <div class="card-outer" style="margin-bottom: 0px;">
                <a href="dashboard.jsp" class="btn btn-primary" style='background-color: #5D8BFF; border: none; flex-grow: 1;'>Back</a>
                <a href="#" type="submit" onclick="document.getElementById('profileSettingForm').submit();" class="btn btn-primary" style='background-color: #00D072; border: none; flex-grow: 1;'>Edit Profile</a>
            </div>
            <div class="card-outer" style="margin-bottom: 40px;">
                <a href="index.jsp" class="btn btn-primary" style='background-color: #FF6F6F; border: none; flex-grow: 1;'>Log Out</a>
                <a href="#" class="btn btn-primary" style='background-color: #00D072; border: none; flex-grow: 1;'>Upload Image</a>
            </div>

        </div>
        

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <%@ include file="/WEB-INF/jspf/supervisor/footer.jspf" %>
</body>

</html>
