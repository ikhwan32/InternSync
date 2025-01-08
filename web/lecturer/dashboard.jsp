<%-- 
    Document   : dashboard
    Created on : Dec 13, 2024, 3:31:26 PM
    Author     : Asyrfl
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        .card {
            background: white;
            border-radius: 20px;
            padding: 25px;
            margin: 20px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            overflow: hidden;
            z-index: 1;
        }
        .header {
            background-color: #fff;
            padding: 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        .header .title {
            font-size: 20px;
            font-weight: bold;
        }
        .header .menu {
            display: flex;
            gap: 20px;
        }
        .menu a {
            text-decoration: none;
            color: #555;
            font-weight: 600;
        }
        .menu a:hover {
            color: #007bff;
        }
        .content {
            padding: 20px;
        }
        .important {
            background-color: #fdfdfd;
            border: 1px solid #ccc;
            padding: 15px;
            margin-bottom: 20px;
            border-radius: 5px;
        }
        .student-status {
            display: grid;
            grid-template-columns: repeat(4, 1fr);
            gap: 10px;
        }
        .phase {
            background: #fff;
            border-radius: 10px;
            padding: 15px;
            text-align: center;
        }
        .phase .progress {
            width: 100px;
            height: 100px;
            margin: 0 auto;
            background: white;
            border: 8px solid #007bff;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 16px;
            color: black;
            position: relative;
        }
        .card-inner{
            background: white;
            border-radius: 20px;
            padding: 25px;
            margin: 0px;
            box-shadow: 0 1px 3px rgba(0,0,0,0.1);
            border: none;
            flex: 1;
            min-width: 200px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .announcement-section {
            background-color: #F8F9FA;
            padding: 20px;
            border-radius: 8px;
            height: 100%;
        }
        .announcement-title {
            text-align: center;
            font-size: 20px;
            font-weight: 500;
            margin-bottom: 15px;
            color: #333;
        }
        .announcement-text {
            font-size: 14px;
            color: #666;
        }
        .dashboard-container {
            flex: 1; 
            margin-left: 100px;
            margin-right: 100px;
        }
        .status{
            width: 160px;
            height: 160px;
            position: relative;
        }
        .outer1{
            height: 160px;
            width: 160px;
            border-radius: 50%;
            padding: 20px;
            box-shadow: 6px 6px 10px -1px rgba(0, 0, 0, 0.15),
                        -6px -6px 10px -1px rgba(755, 755, 755, 0.7);
        }
        .inner1{
            height: 120px;
            width: 120px;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            box-shadow: inset 4px 4px 6px -1px rgba(0, 0, 0, 0.2),
                        inset -4px -4px 6px -1px rgba(755, 755, 755, 0.7),
                        -0.5px -0.5px 0px rgba(255, 255, 255, 1),
                        0.5px 0.5px 0px rgba(0, 0, 0, 0.15),
                        0px 12px 10px -10px rgba(0, 0, 0, 0.05);
            
        }
        #number1, #number2, #number3, #number4{
            font-weight: 600;
            color: #555;
        }
        circle {
            fill: none;
            stroke-width: 20px;
            stroke-dasharray: 472;
            stroke-dashoffset: 472;
            animation: anim 2s linear forwards;
        }

        svg{
            position: absolute;
            top: 0;
            left: 0;
            
        }

        .card-outer{
            display: flex;
            justify-content: center;  
            align-items: center;      
            gap: 80px;                
            flex-wrap: wrap;          
            padding: 20px;
        }        
    </style>
</head>
<body>
    <c:set var="page" value="dashboard" scope="request"/>
    <%@ include file="/WEB-INF/jspf/lecturer/header.jspf" %>

    <div class="dashboard-container">
        <div class="">
            <!------------- Announcement Section ---------------->
            <div class="card" style="border-radius: 20px;">
                <div class="announcement-section">
                    <h3 class="announcement-title">Announcement</h3>
                    <div class="announcement-text" style="text-align: center;">
                        IMMPORTANT: Please alert about incoming due date!.
                    </div>
                </div>
            </div>
            <!------------- student status Section ---------------->
            <div class="card" style="border-radius: 20px;">
                <div style="text-align: center; color: #212529; font-size: 20px; font-weight: 500">Student Status</div>
                    <div class="card-outer">
                        <!-- Phase 1 Progress -->
                        <div class="status">
                            <div class="outer1">
                                <div class="inner1">
                                    <div id="number1"></div>
                                </div>
                            </div>
                            <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                                <defs>
                                    <linearGradient id="GradientColor1">
                                        <stop offset="0%" stop-color="#e91e63" />
                                        <stop offset="100%" stop-color="#673ab7" />
                                    </linearGradient>
                                </defs>
                                <circle cx="80" cy="80" r="70" stroke-linecap="round" style="stroke: url(#GradientColor1);"></circle>
                            </svg>
                            <div style="text-align: center;">Phase 1</div>
                        </div>

                        <!-- Phase 2 Progress -->
                        <div class="status">
                            <div class="outer1">
                                <div class="inner1">
                                    <div id="number2"></div>
                                </div>
                            </div>
                            <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                                <defs>
                                    <linearGradient id="GradientColor2">
                                        <stop offset="0%" stop-color="#e91e63" />
                                        <stop offset="100%" stop-color="#673ab7" />
                                    </linearGradient>
                                </defs>
                                <circle cx="80" cy="80" r="70" stroke-linecap="round" style="stroke: url(#GradientColor2);"></circle>
                            </svg>
                            <div style="text-align: center;">Phase 2</div>
                        </div>
                        <!-- Phase 3 Progress -->
                        <div class="status">
                            <div class="outer1">
                                <div class="inner1">
                                    <div id="number3"></div>
                                </div>
                            </div>
                            <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                                <defs>
                                    <linearGradient id="GradientColor3">
                                        <stop offset="0%" stop-color="#e91e63" />
                                        <stop offset="100%" stop-color="#673ab7" />
                                    </linearGradient>
                                </defs>
                                <circle cx="80" cy="80" r="70" stroke-linecap="round" style="stroke: url(#GradientColor3);"></circle>
                            </svg>
                            <div style="text-align: center;">Phase 3</div>
                        </div>
                        <!-- Phase 4 Progress -->
                        <div class="status">
                            <div class="outer1">
                                <div class="inner1">
                                    <div id="number4"></div>
                                </div>
                            </div>
                            <svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="160px" height="160px">
                                <defs>
                                    <linearGradient id="GradientColor4">
                                        <stop offset="0%" stop-color="#e91e63" />
                                        <stop offset="100%" stop-color="#673ab7" />
                                    </linearGradient>
                                </defs>
                                <circle cx="80" cy="80" r="70" stroke-linecap="round" style="stroke: url(#GradientColor4);"></circle>
                            </svg>
                            <div style="text-align: center;">Phase 4</div>
                        </div>                        
                    </div>


            </div>
        </div>
            
    </div>

            <!------------- script for circle progress bar Section ---------------->
    <script>
function animateProgress(numberId, targetPercentage, circleElement) {
    const radius = 70; // Radius of the circle
    const circumference = 2 * Math.PI * radius;

    // Set the stroke-dasharray for the circle
    circleElement.style.strokeDasharray = circumference;
    circleElement.style.strokeDashoffset = circumference;

    let numberElement = document.getElementById(numberId);
    let counter = 0;

    // Animate the counter
    let interval = setInterval(() => {
        if (counter >= targetPercentage) {
            clearInterval(interval);
        } else {
            counter += 1;
            numberElement.innerHTML = counter + "%";
        }
    }, 30);

    // Add a delay to ensure the transition applies
    setTimeout(() => {
        circleElement.style.transition = "stroke-dashoffset 2s ease";
        circleElement.style.strokeDashoffset = circumference * (1 - targetPercentage / 100);
    }, 100);
}

// Call the function for each progress bar
animateProgress("number1", 50, document.querySelector('#number1').closest('.status').querySelector('circle'));
animateProgress("number2", 75, document.querySelector('#number2').closest('.status').querySelector('circle'));
animateProgress("number3", 15, document.querySelector('#number3').closest('.status').querySelector('circle'));
animateProgress("number4", 30, document.querySelector('#number4').closest('.status').querySelector('circle'));

    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <%@ include file="/WEB-INF/jspf/lecturer/footer.jspf" %>
</body>
</html>

