<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.internship.model.BLI01" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Phase - Internship Management System</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
<body class="bg-gray-50 min-h-screen flex">
    <c:set var="page" value="phase4" scope="request" />

    <!-- Sidebar -->
    <%@ include file="/WEB-INF/jspf/lecturer/sidebar.jspf" %>

    <!-- Main Content -->
    <div class="flex-1">
        <!-- Top Bar -->
        <%@ include file="/WEB-INF/jspf/lecturer/top.jspf" %>

        <!-- Page Content -->
        <div class="p-8">
            <!-- Filters Section -->
            <div class="flex justify-between items-center mb-6">
                <div class="flex items-center gap-4">
                    <a href="studentTask.jsp" class="bg-blue-500 text-white px-6 py-2 rounded-md hover:bg-blue-600 transition-colors">Back</a>
                </div>
                <div class="flex items-center gap-4">
                    <div class="relative">
                        <button class="bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center" id="dropdownMenuButton">
                            ${param.selectedBLI != null ? param.selectedBLI : 'Select BLI'}
                            <svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7"></path>
                            </svg>
                        </button>
                        <ul class="absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10" id="dropdownMenu">
                            <li>
                                <a href="phase4.jsp" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectBLI('BLI06')">BLI06</a>
                            </li>
                            <li>
                                <a href="phase4Bli08.jsp" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectBLI('BLI08')">BLI08</a>
                            </li>
                        </ul>
                    </div>
                    <input type="text" placeholder="Search name..." class="p-2 border rounded-md">
                </div>
            </div>

            <!-- Stats Section -->
            <div class="grid grid-cols-1 md:grid-cols-3 gap-6 mb-6">
                <div class="bg-white rounded-xl shadow-sm p-6 text-center">
                    <img src="<c:url value='/assets/images/icon1.png'/>" alt="Total Students" class="w-12 h-12 mx-auto mb-2">
                    <h2 class="text-lg font-semibold text-gray-900">Total Students</h2>
                    <p class="text-2xl font-bold text-blue-500">${totalStudents5}</p>
                </div>
                <div class="bg-white rounded-xl shadow-sm p-6 text-center">
                    <img src="<c:url value='/assets/images/completed.png'/>" alt="Completed" class="w-12 h-12 mx-auto mb-2">
                    <h2 class="text-lg font-semibold text-gray-900">Completed</h2>
                    <p class="text-2xl font-bold text-green-500">${totalCompleted5}</p>
                </div>
                <div class="bg-white rounded-xl shadow-sm p-6 text-center">
                    <img src="<c:url value='/assets/images/uncompleted.png'/>" alt="Uncompleted" class="w-12 h-12 mx-auto mb-2">
                    <h2 class="text-lg font-semibold text-gray-900">Uncompleted</h2>
                    <p class="text-2xl font-bold text-red-500">${totalUncompleted5}</p>
                </div>
            </div>

            <!-- Internship List Section -->
            <div class="bg-white rounded-xl shadow-sm p-6">
                <div class="flex justify-between items-center mb-6">
                    <div>
                        <h2 class="text-xl font-bold text-gray-900">PHASE 4</h2>
                        <p class="text-sm text-gray-600">BLI 06</p>
                    </div>
                    <div class="relative">
                        <button class="bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center" id="sortDropdown">
                            Sort by :
                            <svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7"></path>
                            </svg>
                        </button>
                        <ul class="absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10" id="sortMenu">
                            <li>
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white">Completed</a>
                            </li>
                            <li>
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white">Uncompleted</a>
                            </li>
                        </ul>
                    </div>
                </div>

                <!-- Table -->
                <div class="overflow-x-auto">
                    <table class="min-w-full bg-white border border-gray-200">
                        <thead>
                            <tr>
                                <th class="px-4 py-2 border-b">Student Name</th>
                                <th class="px-4 py-2 border-b">Student ID</th>
                                <th class="px-4 py-2 border-b">Course</th>
                                <th class="px-4 py-2 border-b">Phone Number</th>
                                <th class="px-4 py-2 border-b">Action</th>
                                <th class="px-4 py-2 border-b">Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="bli06" items="${phase4}">
                                <tr>
                                    <td class="px-4 py-2 border-b">${bli06.name}</td>
                                    <td class="px-4 py-2 border-b">${bli06.matricNum}</td>
                                    <td class="px-4 py-2 border-b">${bli06.programme}</td>
                                    <td class="px-4 py-2 border-b">${bli06.phoneNum}</td>
                                    <td class="px-4 py-2 border-b">
                                        <button class="bg-blue-500 text-white px-4 py-1 rounded-md hover:bg-blue-600 transition-colors">Reopen</button>
                                    </td>
                                    <td class="px-4 py-2 border-b">
                                        <span class="${bli06.status == 'Completed' ? 'text-green-500' : 'text-red-500'} font-semibold">
                                            ${bli06.status}
                                        </span>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

                <!-- Pagination Info -->
                <div class="mt-4 text-sm text-gray-600">
                    Showing data 1 to ${phase4.size()} of ${phase4.size()} entries
                </div>
            </div>
        </div>
    </div>

    <script>
        // Function to handle BLI selection from dropdown
        function selectBLI(name) {
            document.getElementById('dropdownMenuButton').textContent = name;
            document.getElementById('selectedBLIInput').value = name;
            document.getElementById('BLIFilterForm').submit();
        }

        // Toggle dropdown menu
        document.getElementById('dropdownMenuButton').addEventListener('click', function() {
            const dropdownMenu = document.getElementById('dropdownMenu');
            dropdownMenu.classList.toggle('hidden');
        });

        // Toggle sort dropdown menu
        document.getElementById('sortDropdown').addEventListener('click', function() {
            const sortMenu = document.getElementById('sortMenu');
            sortMenu.classList.toggle('hidden');
        });

        // Close dropdowns when clicking outside
        document.addEventListener('click', function(event) {
            const dropdownMenu = document.getElementById('dropdownMenu');
            const sortMenu = document.getElementById('sortMenu');
            const dropdownButton = document.getElementById('dropdownMenuButton');
            const sortButton = document.getElementById('sortDropdown');

            if (!dropdownButton.contains(event.target) && !dropdownMenu.contains(event.target)) {
                dropdownMenu.classList.add('hidden');
            }
            if (!sortButton.contains(event.target) && !sortMenu.contains(event.target)) {
                sortMenu.classList.add('hidden');
            }
        });
    </script>

   
</body>
</html>
