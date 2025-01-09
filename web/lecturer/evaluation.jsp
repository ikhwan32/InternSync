<%-- 
    Document   : task
    Created on : Dec 13, 2024, 3:48:58 PM
    Author     : Itqnazs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Industrial Supervisor Dashboard - Internship Management System</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }

        .stepper-item.active .stepper-circle {
            background-color: #3b82f6; /* Blue background for active step */
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.completed .stepper-circle {
            background-color: #3b82f6; /* Blue background for completed steps */
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.active .stepper-label {
            color: #3b82f6; /* Blue text for active step */
        }

        .stepper-item.completed .stepper-label {
            color: #3b82f6; /* Blue text for completed steps */
        }
    </style>
</head>
<body class="bg-gray-50">
    <c:set var="page" value="task" scope="request" />

    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <%@ include file="/WEB-INF/jspf/lecturer/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <%@ include file="/WEB-INF/jspf/lecturer/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <!-- Success Message -->
                <c:if test="${not empty sessionScope.success}">
                    <div class="bg-green-100 border border-green-400 text-green-700 px-4 py-3 rounded relative mb-4" role="alert">
                        <span class="block sm:inline">${sessionScope.success}</span>
                        <button type="button" class="absolute top-0 bottom-0 right-0 px-4 py-3" onclick="this.parentElement.remove()">
                            <span class="text-green-700">&times;</span>
                        </button>
                    </div>
                    <% session.removeAttribute("success"); %>
                </c:if>

                <!-- Error Message -->
                <c:if test="${not empty sessionScope.error}">
                    <div class="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded relative mb-4" role="alert">
                        <span class="block sm:inline">${sessionScope.error}</span>
                        <button type="button" class="absolute top-0 bottom-0 right-0 px-4 py-3" onclick="this.parentElement.remove()">
                            <span class="text-red-700">&times;</span>
                        </button>
                    </div>
                    <% session.removeAttribute("error"); %>
                </c:if>

                <!-- Task Section -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <div class="flex justify-between items-center mb-6">
                        <div>
                            <h2 class="text-xl font-bold text-gray-900">Supervisor Tasks</h2>
                            <p class="text-gray-600">Forms</p>
                        </div>
                        <form method="GET" action="TaskServlet" class="flex items-center gap-4">
                            <div class="relative">
                                <button type="button" class="bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center" id="dropdownMenuButton">
                                    ${param.studentName != null ? param.studentName : 'Select Student'}
                                    <svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7"></path>
                                    </svg>
                                </button>
                                <ul class="absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10" id="dropdownMenu">
                                    <c:forEach var="student" items="${studentList}">
                                        <li>
                                            <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectStudent('${student.studentName}')">
                                                ${student.studentName}
                                            </a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                            <input type="hidden" name="studentName" id="selectedStudentInput" value="${param.studentName}">
                            <button type="submit" class="bg-blue-500 text-white px-4 py-2 rounded-md">Search</button>
                        </form>
                    </div>

                    <!-- Task Cards -->
                    <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                        <div class="bg-white border border-gray-200 rounded-lg p-6 shadow-sm">
                            <div class="flex items-center gap-4">
                                <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="thumbnail" class="w-20 h-20 rounded-lg object-cover">
                                <div>
                                    <h3 class="text-lg font-semibold text-gray-900">BLI 06</h3>
                                    <p class="text-sm text-gray-600">Industrial training visit evaluation form</p>
                                    <a href="BLI06.jsp" class="mt-2 inline-block w-full bg-blue-500 text-white px-4 py-2 rounded-md text-center">Open</a>
                                </div>
                            </div>
                        </div>
                        <div class="bg-white border border-gray-200 rounded-lg p-6 shadow-sm">
                            <div class="flex items-center gap-4">
                                <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="thumbnail" class="w-20 h-20 rounded-lg object-cover">
                                <div>
                                    <h3 class="text-lg font-semibold text-gray-900">BLI 08</h3>
                                    <p class="text-sm text-gray-600">Academic supervisor evaluation form</p>
                                    <a href="BLI08.jsp" class="mt-2 inline-block w-full bg-blue-500 text-white px-4 py-2 rounded-md text-center">Open</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        // Function to handle student selection from dropdown
        function selectStudent(name) {
            document.getElementById('dropdownMenuButton').textContent = name;
            document.getElementById('selectedStudentInput').value = name;
            // Submit the form when a student is selected
            document.forms[0].submit();
        }

        // Toggle dropdown menu
        document.getElementById('dropdownMenuButton').addEventListener('click', function() {
            const dropdownMenu = document.getElementById('dropdownMenu');
            dropdownMenu.classList.toggle('hidden');
        });

        // Close dropdown when clicking outside
        document.addEventListener('click', function(event) {
            const dropdownMenu = document.getElementById('dropdownMenu');
            const dropdownButton = document.getElementById('dropdownMenuButton');
            if (!dropdownButton.contains(event.target) && !dropdownMenu.contains(event.target)) {
                dropdownMenu.classList.add('hidden');
            }
        });

        // Run when page loads
        window.onload = function() {
            // Get selected student from parameter
            const urlParams = new URLSearchParams(window.location.search);
            const selectedStudent = urlParams.get('studentName');

            if (selectedStudent) {
                // Update dropdown text
                document.getElementById('dropdownMenuButton').textContent = selectedStudent;
                // Update hidden input
                document.getElementById('selectedStudentInput').value = selectedStudent;
            }
        }
    </script>
</body>
</html>