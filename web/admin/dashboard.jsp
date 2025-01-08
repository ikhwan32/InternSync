<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
</head>
<body class="bg-gray-50 min-h-screen flex">
    <c:set var="page" value="dashboard" scope="request"/>
    <!-- Sidebar -->
    <%@ include file="/WEB-INF/jspf/admin/sidebar.jspf" %>

    <!-- Main Content -->
    <div class="flex-1">
        <!-- Top Bar -->
        <%@ include file="/WEB-INF/jspf/admin/top.jspf" %>

        <!-- Page Content -->
        <div class="p-8">
            <!-- Announcement Section -->
            <div class="bg-white rounded-xl shadow-sm p-6 mb-8">
                <h3 class="text-xl font-semibold text-center mb-4">Announcement</h3>
                <p class="text-gray-600 text-center">
                    IMPORTANT: There is a request from a student to change the internship company.
                </p>
            </div>

            <!-- Student Status Section -->
            <div class="bg-white rounded-xl shadow-sm p-6">
                <h2 class="text-xl font-semibold text-center mb-6">Student Status</h2>
                <div class="grid grid-cols-1 md:grid-cols-4 gap-6">
                    <!-- Phase 1 Progress -->
                    <div class="text-center">
                        <div class="relative w-40 h-40 mx-auto">
                            <svg class="w-full h-full" viewBox="0 0 160 160">
                                <circle cx="80" cy="80" r="70" stroke="#e0e0e0" stroke-width="20" fill="none"/>
                                <circle cx="80" cy="80" r="70" stroke="url(#GradientColor1)" stroke-width="20" stroke-dasharray="472" stroke-dashoffset="472" class="transition-all duration-1000" style="stroke-dashoffset: 236;"/>
                                <defs>
                                    <linearGradient id="GradientColor1">
                                        <stop offset="0%" stop-color="#e91e63"/>
                                        <stop offset="100%" stop-color="#673ab7"/>
                                    </linearGradient>
                                </defs>
                            </svg>
                            <div class="absolute inset-0 flex items-center justify-center text-lg font-semibold">
                                50%
                            </div>
                        </div>
                        <p class="mt-2 text-gray-700">Phase 1</p>
                    </div>

                    <!-- Phase 2 Progress -->
                    <div class="text-center">
                        <div class="relative w-40 h-40 mx-auto">
                            <svg class="w-full h-full" viewBox="0 0 160 160">
                                <circle cx="80" cy="80" r="70" stroke="#e0e0e0" stroke-width="20" fill="none"/>
                                <circle cx="80" cy="80" r="70" stroke="url(#GradientColor2)" stroke-width="20" stroke-dasharray="472" stroke-dashoffset="472" class="transition-all duration-1000" style="stroke-dashoffset: 118;"/>
                                <defs>
                                    <linearGradient id="GradientColor2">
                                        <stop offset="0%" stop-color="#e91e63"/>
                                        <stop offset="100%" stop-color="#673ab7"/>
                                    </linearGradient>
                                </defs>
                            </svg>
                            <div class="absolute inset-0 flex items-center justify-center text-lg font-semibold">
                                75%
                            </div>
                        </div>
                        <p class="mt-2 text-gray-700">Phase 2</p>
                    </div>

                    <!-- Phase 3 Progress -->
                    <div class="text-center">
                        <div class="relative w-40 h-40 mx-auto">
                            <svg class="w-full h-full" viewBox="0 0 160 160">
                                <circle cx="80" cy="80" r="70" stroke="#e0e0e0" stroke-width="20" fill="none"/>
                                <circle cx="80" cy="80" r="70" stroke="url(#GradientColor3)" stroke-width="20" stroke-dasharray="472" stroke-dashoffset="472" class="transition-all duration-1000" style="stroke-dashoffset: 401;"/>
                                <defs>
                                    <linearGradient id="GradientColor3">
                                        <stop offset="0%" stop-color="#e91e63"/>
                                        <stop offset="100%" stop-color="#673ab7"/>
                                    </linearGradient>
                                </defs>
                            </svg>
                            <div class="absolute inset-0 flex items-center justify-center text-lg font-semibold">
                                15%
                            </div>
                        </div>
                        <p class="mt-2 text-gray-700">Phase 3</p>
                    </div>

                    <!-- Phase 4 Progress -->
                    <div class="text-center">
                        <div class="relative w-40 h-40 mx-auto">
                            <svg class="w-full h-full" viewBox="0 0 160 160">
                                <circle cx="80" cy="80" r="70" stroke="#e0e0e0" stroke-width="20" fill="none"/>
                                <circle cx="80" cy="80" r="70" stroke="url(#GradientColor4)" stroke-width="20" stroke-dasharray="472" stroke-dashoffset="472" class="transition-all duration-1000" style="stroke-dashoffset: 330;"/>
                                <defs>
                                    <linearGradient id="GradientColor4">
                                        <stop offset="0%" stop-color="#e91e63"/>
                                        <stop offset="100%" stop-color="#673ab7"/>
                                    </linearGradient>
                                </defs>
                            </svg>
                            <div class="absolute inset-0 flex items-center justify-center text-lg font-semibold">
                                30%
                            </div>
                        </div>
                        <p class="mt-2 text-gray-700">Phase 4</p>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>