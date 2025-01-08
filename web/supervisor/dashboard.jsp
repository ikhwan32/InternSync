<%-- 
    Document   : dashboard
    Created on : Dec 13, 2024, 3:34:03 PM
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
    </style>
</head>
<body class="bg-gray-50">
    <c:set var="page" value="dashboard" scope="request" />

    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <%@ include file="/WEB-INF/jspf/supervisor/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <%@ include file="/WEB-INF/jspf/supervisor/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <!-- Announcement and Total Interns Section -->
                <div class="grid grid-cols-1 md:grid-cols-2 gap-6 mb-8">
                    <!-- Announcement Section -->
                    <div class="bg-white rounded-xl shadow-sm p-6">
                        <h3 class="text-lg font-semibold text-gray-900 mb-4">Announcement</h3>
                        <p class="text-sm text-gray-600">
                            IMPORTANT: Please Complete Company Evaluation (BLI05) before 24/8/2025
                        </p>
                    </div>

                    <!-- Total Interns Section -->
                    <div class="bg-white rounded-xl shadow-sm p-6 flex items-center justify-center">
                        <div class="flex items-center gap-4">
                            <img src="<c:url value='/assets/images/logo1.png'/>" alt="Logo" class="w-16 h-16">
                            <div class="text-center">
                                <h3 class="text-xl font-semibold text-gray-900">Total Interns</h3>
                                <p class="text-2xl font-bold text-blue-500">${studentList.size()}</p>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Internship List Section -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <div class="flex justify-between items-center mb-6">
                        <div>
                            <h2 class="text-xl font-bold text-gray-900">Internship List</h2>
                            <p class="text-sm text-gray-600">All Interns</p>
                        </div>
                        <div class="relative">
                            <button class="bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center" id="dropdownMenuButton">
                                ${param.selectedStudent != null ? param.selectedStudent : 'Sort By'}
                                <svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7"></path>
                                </svg>
                            </button>
                            <ul class="absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10" id="dropdownMenu">
                                <li>
                                    <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectStudent('By Name')">By Name</a>
                                </li>
                                <li>
                                    <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectStudent('ByEndDateDesc')">By End Date desc</a>
                                </li>
                                <li>
                                    <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectStudent('ByEndDateAsc')">By End Date asc</a>
                                </li>
                            </ul>
                        </div>
                        <input type="hidden" name="selectedStudent" id="selectedStudentInput">
                    </div>

                    <!-- Internship Table -->
                    <div class="overflow-x-auto">
                        <table class="min-w-full bg-white border border-gray-200">
                            <thead>
                                <tr>
                                    <th class="px-4 py-2 border-b text-center">Number</th>
                                    <th class="px-4 py-2 border-b">Student Name</th>
                                    <th class="px-4 py-2 border-b">End Date</th>
                                    <th class="px-4 py-2 border-b">Phone Number</th>
                                    <th class="px-4 py-2 border-b">Email</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="student" items="${studentList}" varStatus="status">
                                    <tr>
                                        <td class="px-4 py-2 border-b text-center">${status.index + 1}</td>
                                        <td class="px-4 py-2 border-b">
                                            <span class="text-blue-500 cursor-pointer hover:underline" onclick="navigateToTask('${student.studentName}')">
                                                ${student.studentName}
                                            </span>
                                        </td>
                                        <td class="px-4 py-2 border-b">${student.endDate}</td>
                                        <td class="px-4 py-2 border-b">${student.studentPhone}</td>
                                        <td class="px-4 py-2 border-b">${student.studentEmail}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>

                    <!-- Pagination Info -->
                    <div class="mt-4 text-sm text-gray-600">
                        Showing data 1 to ${studentList.size()} of ${studentList.size()} entries
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

        // Function to navigate to TaskServlet
        function navigateToTask(studentName) {
            // Store the selected student name in sessionStorage
            sessionStorage.setItem('selectedStudent', studentName);
            // Navigate to TaskServlet with the correct path
            window.location.href = '${pageContext.request.contextPath}/supervisor/TaskServlet?studentName=' + encodeURIComponent(studentName);
        }
    </script>
</body>
</html>