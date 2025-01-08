<%-- 
    Document   : task
    Created on : Dec 13, 2024, 2:18:12 AM
    Author     : myPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Task</title>
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
                </div>
            </div>

            <!-- Task Section -->
            <div class="bg-white rounded-xl shadow-sm p-6">
                <div class="flex justify-between items-center mb-6">
                    <div>
                        <h2 class="text-xl font-bold text-gray-900">Student Tasks</h2>
                        <p class="text-sm text-gray-600">Phases</p>
                    </div>
                </div>

                <!-- Phase Cards -->
                <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                    <!-- Phase 1 -->
                    <div class="bg-white rounded-xl shadow-sm p-6 border-2 border-gray-200">
                        <div class="flex items-center gap-4">
                            <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="Phase 1" class="w-16 h-16 rounded-lg">
                            <div>
                                <h3 class="text-lg font-bold">PHASE 1</h3>
                                <p class="text-sm text-gray-600">BLI 01 | BLI 02</p>
                                <a href="phase1.jsp" class="inline-block mt-2 px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                            </div>
                        </div>
                    </div>

                    <!-- Phase 2 -->
                    <div class="bg-white rounded-xl shadow-sm p-6 border-2 border-gray-200">
                        <div class="flex items-center gap-4">
                            <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="Phase 2" class="w-16 h-16 rounded-lg">
                            <div>
                                <h3 class="text-lg font-bold">PHASE 2</h3>
                                <p class="text-sm text-gray-600">BLI 03</p>
                                <a href="phase2.jsp" class="inline-block mt-2 px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                            </div>
                        </div>
                    </div>

                    <!-- Phase 3 -->
                    <div class="bg-white rounded-xl shadow-sm p-6 border-2 border-gray-200">
                        <div class="flex items-center gap-4">
                            <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="Phase 3" class="w-16 h-16 rounded-lg">
                            <div>
                                <h3 class="text-lg font-bold">PHASE 3</h3>
                                <p class="text-sm text-gray-600">BLI 04 | BLI 05 | BLI 07</p>
                                <a href="phase3.jsp" class="inline-block mt-2 px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                            </div>
                        </div>
                    </div>

                    <!-- Phase 4 -->
                    <div class="bg-white rounded-xl shadow-sm p-6 border-2 border-gray-200">
                        <div class="flex items-center gap-4">
                            <img src="<c:url value='/assets/images/thumbnail1.png'/>" alt="Phase 4" class="w-16 h-16 rounded-lg">
                            <div>
                                <h3 class="text-lg font-bold">PHASE 4</h3>
                                <p class="text-sm text-gray-600">BLI 06 | BLI 08</p>
                                <a href="phase4.jsp" class="inline-block mt-2 px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors">Open</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    
</body>
</html>
