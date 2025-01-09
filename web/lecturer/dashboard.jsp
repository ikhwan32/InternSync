<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Academic Supervisor Dashboard - Internship Management System</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }

        .stepper-item.active .stepper-circle {
            background-color: #3b82f6;
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.completed .stepper-circle {
            background-color: #3b82f6;
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.active .stepper-label {
            color: #3b82f6;
        }

        .stepper-item.completed .stepper-label {
            color: #3b82f6;
        }

        .rating-input:checked+label {
            background-color: #3b82f6;
            color: white;
        }

        .status {
            width: 160px;
            height: 160px;
            position: relative;
        }

        .outer1 {
            height: 160px;
            width: 160px;
            border-radius: 50%;
            padding: 20px;
            box-shadow: 6px 6px 10px -1px rgba(0, 0, 0, 0.15),
                        -6px -6px 10px -1px rgba(755, 755, 755, 0.7);
        }

        .inner1 {
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

        #number1, #number2, #number3, #number4 {
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

        svg {
            position: absolute;
            top: 0;
            left: 0;
        }

        .card-outer {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 80px;
            flex-wrap: wrap;
            padding: 20px;
        }
    </style>
</head>
<body class="bg-gray-50">
    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <c:set var="page" value="dashboard" scope="request" />
        <%@ include file="/WEB-INF/jspf/supervisor/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="page" value="dashboard" scope="request" />
            <%@ include file="/WEB-INF/jspf/supervisor/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <!-- Announcement Section -->
                <div class="bg-white rounded-xl shadow-sm p-6 mb-8">
                    <h3 class="text-xl font-bold mb-4">Announcement</h3>
                    <div class="text-gray-700 text-center">
                        IMPORTANT: Please alert about incoming due date!
                    </div>
                </div>

                <!-- Student Status Section -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <h3 class="text-xl font-bold mb-4">Student Status</h3>
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
                            <div class="text-center mt-2">Phase 1</div>
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
                            <div class="text-center mt-2">Phase 2</div>
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
                            <div class="text-center mt-2">Phase 3</div>
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
                            <div class="text-center mt-2">Phase 4</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        function animateProgress(numberId, targetPercentage, circleElement) {
            const radius = 70;
            const circumference = 2 * Math.PI * radius;

            circleElement.style.strokeDasharray = circumference;
            circleElement.style.strokeDashoffset = circumference;

            let numberElement = document.getElementById(numberId);
            let counter = 0;

            let interval = setInterval(() => {
                if (counter >= targetPercentage) {
                    clearInterval(interval);
                } else {
                    counter += 1;
                    numberElement.innerHTML = counter + "%";
                }
            }, 30);

            setTimeout(() => {
                circleElement.style.transition = "stroke-dashoffset 2s ease";
                circleElement.style.strokeDashoffset = circumference * (1 - targetPercentage / 100);
            }, 100);
        }

        animateProgress("number1", 50, document.querySelector('#number1').closest('.status').querySelector('circle'));
        animateProgress("number2", 75, document.querySelector('#number2').closest('.status').querySelector('circle'));
        animateProgress("number3", 15, document.querySelector('#number3').closest('.status').querySelector('circle'));
        animateProgress("number4", 30, document.querySelector('#number4').closest('.status').querySelector('circle'));
    </script>
</body>
</html>