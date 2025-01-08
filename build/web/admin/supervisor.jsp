<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Supervisor List</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
<body class="bg-gray-50 min-h-screen flex">
    <c:set var="page" value="supervisor" scope="request"/>

    <!-- Sidebar -->
    <%@ include file="/WEB-INF/jspf/admin/sidebar.jspf" %>

    <!-- Main Content -->
    <div class="flex-1">
        <!-- Top Bar -->
        <%@ include file="/WEB-INF/jspf/admin/top.jspf" %>

        <!-- Page Content -->
        <div class="p-8">
            <!-- Filters Section -->
            <div class="flex justify-between items-center mb-6">
                <div class="flex items-center gap-4">
                    <a href="student.jsp" class="bg-blue-500 text-white px-6 py-2 rounded-md hover:bg-blue-600 transition-colors">Back</a>
                    <div class="relative">
                        <button class="bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center" id="dropdownMenuButton">
                            ${param.selectedSupervisor != null ? param.selectedSupervisor : 'Select Supervisor'}
                            <svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 9l-7 7-7-7"></path>
                            </svg>
                        </button>
                        <ul class="absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10" id="dropdownMenu">
                            <li>
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectSupervisor('Academic')">Academic</a>
                            </li>
                            <li>
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white" onclick="selectSupervisor('Industrial')">Industrial</a>
                            </li>
                        </ul>
                    </div>
                    <input type="text" placeholder="Search name..." class="p-2 border rounded-md">
                </div>
            </div>

            <!-- Stats Section -->
            <div class="bg-white rounded-xl shadow-sm p-6 mb-6">
                <div class="flex items-center gap-4">
                    <img src="<c:url value='/assets/images/icon1.png'/>" alt="Total Supervisor" class="w-12 h-12">
                    <div>
                        <h2 class="text-lg font-semibold text-gray-900">Total Supervisor</h2>
                        <p class="text-2xl font-bold text-blue-500">4</p>
                    </div>
                </div>
            </div>

            <!-- Supervisor List Section -->
            <div class="bg-white rounded-xl shadow-sm p-6">
                <div class="flex justify-between items-center mb-6">
                    <div>
                        <h2 class="text-xl font-bold text-gray-900">Supervisor List</h2>
                        <p class="text-sm text-gray-600">All Supervisor</p>
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
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white">Newest</a>
                            </li>
                            <li>
                                <a href="#" class="block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white">Oldest</a>
                            </li>
                        </ul>
                    </div>
                </div>

                <!-- Table -->
                <div class="overflow-x-auto">
                    <table class="min-w-full bg-white border border-gray-200">
                        <thead>
                            <tr>
                                <th class="px-4 py-2 border-b">Number</th>
                                <th class="px-4 py-2 border-b">Supervisor Name</th>
                                <th class="px-4 py-2 border-b">Staff ID</th>
                                <th class="px-4 py-2 border-b">Phone Number</th>
                                <th class="px-4 py-2 border-b">Email</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="px-4 py-2 border-b text-center">1</td>
                                <td class="px-4 py-2 border-b">Supervisor Name</td>
                                <td class="px-4 py-2 border-b">2024567890</td>
                                <td class="px-4 py-2 border-b">012 345 6789</td>
                                <td class="px-4 py-2 border-b">name@gmail.com</td>
                            </tr>
                            <tr>
                                <td class="px-4 py-2 border-b text-center">2</td>
                                <td class="px-4 py-2 border-b">Supervisor Name</td>
                                <td class="px-4 py-2 border-b">2024567890</td>
                                <td class="px-4 py-2 border-b">012 345 6789</td>
                                <td class="px-4 py-2 border-b">name@gmail.com</td>
                            </tr>
                            <tr>
                                <td class="px-4 py-2 border-b text-center">3</td>
                                <td class="px-4 py-2 border-b">Supervisor Name</td>
                                <td class="px-4 py-2 border-b">2024567890</td>
                                <td class="px-4 py-2 border-b">012 345 6789</td>
                                <td class="px-4 py-2 border-b">name@gmail.com</td>
                            </tr>
                            <tr>
                                <td class="px-4 py-2 border-b text-center">4</td>
                                <td class="px-4 py-2 border-b">Supervisor Name</td>
                                <td class="px-4 py-2 border-b">2024567890</td>
                                <td class="px-4 py-2 border-b">012 345 6789</td>
                                <td class="px-4 py-2 border-b">name@gmail.com</td>
                            </tr>
                        </tbody>
                    </table>
                </div>

                <!-- Pagination Info -->
                <div class="mt-4 text-sm text-gray-600">
                    Showing data 1 to 4 of 4 entries
                </div>
            </div>
        </div>
    </div>

    <script>
        // Function to handle Supervisor selection from dropdown
        function selectSupervisor(name) {
            document.getElementById('dropdownMenuButton').textContent = name;
            document.getElementById('selectedSupervisorInput').value = name;
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