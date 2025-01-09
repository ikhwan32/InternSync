<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>
<style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
<body class="bg-gray-50 min-h-screen flex">
    <c:set var="page" value="student" scope="request"/>

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
                    <a href="dashboard.jsp" class="bg-blue-500 text-white px-6 py-2 rounded-md hover:bg-blue-600 transition-colors">Back</a>
                </div>
            </div>

            <!-- Stats Section -->
            <div class="grid grid-cols-1 md:grid-cols-2 gap-6 mb-6">
                <!-- Student List Card -->
                <div class="bg-white rounded-xl shadow-sm p-6 text-center">
                    <img src="<c:url value='/assets/images/Users.png'/>" alt="Student List" class="w-12 h-12 mx-auto mb-2">
                    <h2 class="text-lg font-semibold text-gray-900">Student List</h2>
                    <p class="text-2xl font-bold text-blue-500">4</p>
                    <a href="studentList.jsp" class="inline-block mt-4 px-6 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                </div>

                <!-- Student Task Card -->
                <div class="bg-white rounded-xl shadow-sm p-6 text-center">
                    <img src="<c:url value='/assets/images/Users.png'/>" alt="Student Task" class="w-12 h-12 mx-auto mb-2">
                    <h2 class="text-lg font-semibold text-gray-900">Student Task</h2>
                    <p class="text-2xl font-bold text-blue-500">4</p>
                    <a href="studentTask.jsp" class="inline-block mt-4 px-6 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>