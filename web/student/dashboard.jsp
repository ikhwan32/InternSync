<%-- Document : dashboard Created on : Dec 13, 2024, 1:41:53 AM Author : myPC --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ include file="/WEB-INF/jspf/auth/auth.jspf" %>
                <!DOCTYPE html>
                <html lang="en">
                <!-- Previous head section remains the same -->

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Student Dashboard</title>
                    <script src="https://cdn.tailwindcss.com"></script>
                    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap"
                        rel="stylesheet">
                    <style>
                        body {
                            font-family: 'Inter', sans-serif;
                        }
                    </style>
                </head>

                <body class="bg-gray-50">
                    <!-- Previous sidebar structure remains the same -->
                    <div class="min-h-screen flex">
                         <!-- Sidebar -->
        <c:set var="page" value="dashboard" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="pageName" value="dashboard" scope="request" />
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

                            <!-- Updated Page Content -->
                            <div class="p-8">
                                <!-- Welcome Section -->
                                <div class="mb-8">
                                    <h2 class="text-2xl font-bold text-gray-900">Welcome back, Muhammad!</h2>
                                    <p class="text-gray-600 mt-1">Here's what's happening with your internship.</p>
                                </div>

                                <!-- Previous Stats Grid remains the same -->

                                <!-- Quick Actions Grid -->
                                <div class="mb-8">
                                    <h3 class="text-lg font-semibold text-gray-900 mb-4">Quick Actions</h3>
                                    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-4">
                                        <!-- BLI 01 -->
                                        <div class="group relative">
                                            <div
                                                class="absolute -inset-0.5 bg-gradient-to-r from-green-600 to-green-700 rounded-lg blur opacity-0 group-hover:opacity-75 transition duration-200">
                                            </div>
                                            <a href="bli01.jsp"
                                                class="relative block p-6 bg-white rounded-lg border hover:border-transparent transition-colors">
                                                <div class="flex items-center justify-between mb-2">
                                                    <h3 class="text-sm font-medium text-gray-900">BLI 01</h3>
                                                    <span
                                                        class="px-2 py-1 text-xs font-medium bg-green-100 text-green-800 rounded-full">Completed</span>
                                                </div>
                                                <p class="text-sm text-gray-600">Personal Detail Form</p>
                                            </a>
                                        </div>

                                        <!-- BLI 03 -->
                                        <div class="group relative">
                                            <div
                                                class="absolute -inset-0.5 bg-gradient-to-r from-green-600 to-green-700 rounded-lg blur opacity-0 group-hover:opacity-75 transition duration-200">
                                            </div>
                                            <a href="bli03.jsp"
                                                class="relative block p-6 bg-white rounded-lg border hover:border-transparent transition-colors">
                                                <div class="flex items-center justify-between mb-2">
                                                    <h3 class="text-sm font-medium text-gray-900">BLI 03</h3>
                                                    <span
                                                        class="px-2 py-1 text-xs font-medium bg-green-100 text-green-800 rounded-full">Completed</span>
                                                </div>
                                                <p class="text-sm text-gray-600">Placement Selection</p>
                                            </a>
                                        </div>

                                        <!-- BLI 04 -->
                                        <div class="group relative">
                                            <div
                                                class="absolute -inset-0.5 bg-gradient-to-r from-red-600 to-red-700 rounded-lg blur opacity-0 group-hover:opacity-75 transition duration-200">
                                            </div>
                                            <a href="bli04.jsp"
                                                class="relative block p-6 bg-white rounded-lg border hover:border-transparent transition-colors">
                                                <div class="flex items-center justify-between mb-2">
                                                    <h3 class="text-sm font-medium text-gray-900">BLI 04</h3>
                                                    <span
                                                        class="px-2 py-1 text-xs font-medium bg-red-100 text-red-800 rounded-full">Pending</span>
                                                </div>
                                                <p class="text-sm text-gray-600">Self-report Verification</p>
                                            </a>
                                        </div>

                                        <!-- BLI 07 -->
                                        <div class="group relative">
                                            <div
                                                class="absolute -inset-0.5 bg-gradient-to-r from-red-600 to-red-700 rounded-lg blur opacity-0 group-hover:opacity-75 transition duration-200">
                                            </div>
                                            <a href="bli07.jsp"
                                                class="relative block p-6 bg-white rounded-lg border hover:border-transparent transition-colors">
                                                <div class="flex items-center justify-between mb-2">
                                                    <h3 class="text-sm font-medium text-gray-900">BLI 07</h3>
                                                    <span
                                                        class="px-2 py-1 text-xs font-medium bg-red-100 text-red-800 rounded-full">Pending</span>
                                                </div>
                                                <p class="text-sm text-gray-600">Feedback Form</p>
                                            </a>
                                        </div>
                                    </div>
                                </div>

                                <!-- Weekly Schedule -->
                                <div class="grid grid-cols-1 lg:grid-cols-2 gap-8 mb-8">
                                    <div class="bg-white rounded-xl shadow-sm p-6">
                                        <h3 class="text-lg font-semibold text-gray-900 mb-4">This Week's Schedule</h3>
                                        <div class="space-y-4">
                                            <div class="flex items-center gap-4">
                                                <div class="w-16 text-sm text-gray-600">Mon</div>
                                                <div
                                                    class="flex-1 h-12 bg-blue-50 rounded-lg border border-blue-100 p-3">
                                                    <div class="text-sm text-blue-700">Backend Development</div>
                                                </div>
                                            </div>
                                            <div class="flex items-center gap-4">
                                                <div class="w-16 text-sm text-gray-600">Tue</div>
                                                <div
                                                    class="flex-1 h-12 bg-purple-50 rounded-lg border border-purple-100 p-3">
                                                    <div class="text-sm text-purple-700">Team Meeting</div>
                                                </div>
                                            </div>
                                            <div class="flex items-center gap-4">
                                                <div class="w-16 text-sm text-gray-600">Wed</div>
                                                <div
                                                    class="flex-1 h-12 bg-green-50 rounded-lg border border-green-100 p-3">
                                                    <div class="text-sm text-green-700">Project Documentation</div>
                                                </div>
                                            </div>
                                            <!-- Add more days as needed -->
                                        </div>
                                    </div>

                                    <!-- Upcoming Deadlines -->
                                    <div class="bg-white rounded-xl shadow-sm p-6">
                                        <h3 class="text-lg font-semibold text-gray-900 mb-4">Upcoming Deadlines</h3>
                                        <div class="space-y-4">
                                            <div
                                                class="flex items-center justify-between p-4 bg-red-50 rounded-lg border border-red-100">
                                                <div>
                                                    <h4 class="text-sm font-medium text-red-900">BLI 04 Submission</h4>
                                                    <p class="text-sm text-red-600">Self-report verification due</p>
                                                </div>
                                                <div class="text-sm font-medium text-red-900">2 days left</div>
                                            </div>
                                            <div
                                                class="flex items-center justify-between p-4 bg-yellow-50 rounded-lg border border-yellow-100">
                                                <div>
                                                    <h4 class="text-sm font-medium text-yellow-900">Weekly Report</h4>
                                                    <p class="text-sm text-yellow-600">Submit weekly progress report</p>
                                                </div>
                                                <div class="text-sm font-medium text-yellow-900">5 days left</div>
                                            </div>
                                            <div
                                                class="flex items-center justify-between p-4 bg-blue-50 rounded-lg border border-blue-100">
                                                <div>
                                                    <h4 class="text-sm font-medium text-blue-900">Project Milestone</h4>
                                                    <p class="text-sm text-blue-600">Backend implementation</p>
                                                </div>
                                                <div class="text-sm font-medium text-blue-900">1 week left</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!-- Recent Activities -->
                                <div class="bg-white rounded-xl shadow-sm p-6">
                                    <h3 class="text-lg font-semibold text-gray-900 mb-4">Recent Activities</h3>
                                    <div class="space-y-4">
                                        <div class="flex items-center gap-4">
                                            <div
                                                class="w-8 h-8 rounded-full bg-green-100 flex items-center justify-center">
                                                <svg class="w-4 h-4 text-green-600" fill="none" stroke="currentColor"
                                                    viewBox="0 0 24 24">
                                                    <path stroke-linecap="round" stroke-linejoin="round"
                                                        stroke-width="2" d="M5 13l4 4L19 7"></path>
                                                </svg>
                                            </div>
                                            <div class="flex-1">
                                                <p class="text-sm text-gray-900">Completed BLI 03 submission</p>
                                                <p class="text-xs text-gray-500">2 hours ago</p>
                                            </div>
                                        </div>
                                        <div class="flex items-center gap-4">
                                            <div
                                                class="w-8 h-8 rounded-full bg-blue-100 flex items-center justify-center">
                                                <svg class="w-4 h-4 text-blue-600" fill="none" stroke="currentColor"
                                                    viewBox="0 0 24 24">
                                                    <path stroke-linecap="round" stroke-linejoin="round"
                                                        stroke-width="2"
                                                        d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                                </svg>
                                            </div>
                                            <div class="flex-1">
                                                <p class="text-sm text-gray-900">Clocked in for the day</p>
                                                <p class="text-xs text-gray-500">8 hours ago</p>
                                            </div>
                                        </div>
                                        <div class="flex items-center gap-4">
                                            <div
                                                class="w-8 h-8 rounded-full bg-purple-100 flex items-center justify-center">
                                                <svg class="w-4 h-4 text-purple-600" fill="none" stroke="currentColor"
                                                    viewBox="0 0 24 24">
                                                    <path stroke-linecap="round" stroke-linejoin="round"
                                                        stroke-width="2"
                                                        d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2">
                                                    </path>
                                                </svg>
                                            </div>
                                            <div class="flex-1">
                                                <p class="text-sm text-gray-900">Submitted weekly report</p>
                                                <p class="text-xs text-gray-500">Yesterday</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </body>

                </html>