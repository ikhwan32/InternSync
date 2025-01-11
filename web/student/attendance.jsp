<%-- 
    Document   : attendance
    Created on : Jan 1, 2025, 9:42:22 PM
    Author     : myPC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jspf/auth/auth.jspf" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<% 
            userID = Integer.parseInt(session.getAttribute("userID").toString());
          
    %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance - Student Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <!-- Flatpickr CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
</head>

<body class="bg-gray-50">
    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <c:set var="page" value="attendance" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="pageName" value="attendance" scope="request" />
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <h2 class="text-2xl font-bold text-gray-900 mb-6">Attendance</h2>

                <!-- Attendance Form -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <form action="../submitLog.do" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="userID" value="<%= userID %>">
                        <!-- Date Picker -->
                        <div class="mb-6">
                            <label class="block text-sm font-medium text-gray-700 mb-2">Select Date</label>
                            <input type="text" id="attendanceDate" name="attendanceDate"
                                class="w-full p-2 border border-gray-300 rounded-lg flatpickr"
                                placeholder="Select date">
                        </div>

                        <!-- Attendance Status -->
                        <div class="mb-6">
                            <label class="block text-sm font-medium text-gray-700 mb-2">Attendance Status</label>
                            <select name="attendanceStatus" class="w-full p-2 border border-gray-300 rounded-lg">
                                <option value="1">Present</option>
                                <option value="0">Late</option>
                            </select>
                        </div>

                        <!-- Supporting Document -->
                        <div class="mb-6">
                            <label class="block text-sm font-medium text-gray-700 mb-2">Supporting Document</label>
                            <input type="file" name="supportingDocument"
                                class="w-full p-2 border border-gray-300 rounded-lg">
                        </div>
                        
                        <!-- Logbook Entries Section -->
                        <div class="mb-8">
                            <h3 class="text-xl font-semibold text-gray-900 mb-4">Logbook Entries</h3>
                            <div class="space-y-4">
                                <div>
                                    <label class="block text-sm font-medium text-gray-700">Logbook Entry</label>
                                    <textarea name="logbookEntry" class="mt-1 block w-full p-2 border border-gray-300 rounded-md"></textarea>
                                </div>
                                <div>
                                    <label class="block text-sm font-medium text-gray-700">Supporting Document (Image/PDF)</label>
                                    <input type="file" name="logbookFile" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
                                </div>
                            </div>
                        </div>

                        <!-- Submit Button -->
                        <button type="submit"
                            class="w-full bg-blue-600 text-white py-2 px-4 rounded-lg hover:bg-blue-700 transition duration-200">
                            Submit Attendance
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Flatpickr JS -->
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <script>
        // Initialize Flatpickr for the date picker
        flatpickr("#attendanceDate", {
            dateFormat: "d-m-Y", // Format: YYYY-MM-DD
            defaultDate: "today", // Default to today's date
            maxDate: "today",
        });
    </script>
</body>

</html>
