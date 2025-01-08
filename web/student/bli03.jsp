<%-- Document : bli03 Created on : Dec 14, 2024, 9:28:55 PM Author : myPC --%>


    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ include file="/WEB-INF/jspf/student/import.jspf" %>

                <!DOCTYPE html>
                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <title>Student BLI03 - Internship Management System</title>
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
                    <div class="min-h-screen flex">
                        <!-- Sidebar (previous code remains the same) -->
                        <div class="w-64 bg-white shadow-sm border-r">
                            <!-- Logo -->
                            <div class="h-16 flex items-center px-6 border-b">
                                <span class="text-xl font-bold text-gray-800">IMS Portal</span>
                            </div>

                            <!-- Profile Section -->
                            <div class="p-4 border-b">
                                <div class="flex items-center gap-3">
                                    <div class="w-10 h-10 rounded-full bg-gray-100 flex items-center justify-center">
                                        <span class="text-sm font-medium text-gray-600">MH</span>
                                    </div>
                                    <div>
                                        <div class="text-sm font-medium text-gray-900">Muhammad Ikhwan</div>
                                        <div class="text-xs text-gray-500">Student</div>
                                    </div>
                                </div>
                            </div>

                            <!-- Navigation -->
                            <nav class="p-4">
                                <div class="space-y-1">
                                    <a href="#"
                                        class="flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md text-white bg-indigo-600">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6">
                                            </path>
                                        </svg>
                                        Dashboard
                                    </a>
                                    <a href="#"
                                        class="flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md text-gray-600 hover:bg-gray-50">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z">
                                            </path>
                                        </svg>
                                        BLI Forms
                                    </a>
                                    <a href="#"
                                        class="flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md text-gray-600 hover:bg-gray-50">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z">
                                            </path>
                                        </svg>
                                        Attendance
                                    </a>
                                    <a href="#"
                                        class="flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md text-gray-600 hover:bg-gray-50">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2">
                                            </path>
                                        </svg>
                                        Reports
                                    </a>
                                    <a href="#"
                                        class="flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md text-gray-600 hover:bg-gray-50">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z">
                                            </path>
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"></path>
                                        </svg>
                                        Settings
                                    </a>
                                </div>
                            </nav>
                        </div>

                        <!-- Main Content -->
                        <div class="flex-1">
                             <!-- Previous topbar remains the same -->
                             <div class="h-16 bg-white shadow-sm border-b flex items-center justify-between px-8">
                                <h1 class="text-lg font-medium">BLI 03 Form</h1>
                                <div class="flex items-center gap-4">
                                    <button class="p-1.5 rounded-full text-gray-600 hover:bg-gray-100">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9">
                                            </path>
                                        </svg>
                                    </button>
                                    <button class="p-1.5 rounded-full text-gray-600 hover:bg-gray-100">
                                        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                                d="M12 5v.01M12 12v.01M12 19v.01M12 6a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2z">
                                            </path>
                                        </svg>
                                    </button>
                                </div>
                            </div>

                            <!-- Page Content -->
                            <div class="p-8">
                                <div class="bg-white rounded-xl shadow-sm p-6">
                                    <!-- Header -->
                                    <div class="mb-8">
                                        <h2 class="text-2xl font-bold text-gray-900">BLI 03</h2>
                                        <p class="text-gray-600 mt-1">Placement Selection Form</p>
                                    </div>

                                    <c:set var="isBli3Submitted" value="${not empty bli3 && bli3}" scope="request" />

                                    <!-- Alert Messages -->
                                    <c:if test="${not empty error}">
                                        <div class="mb-6 p-4 rounded-lg bg-red-50 border border-red-200">
                                            <div class="flex">
                                                <div class="flex-shrink-0">
                                                    <svg class="h-5 w-5 text-red-400" fill="none" stroke="currentColor"
                                                        viewBox="0 0 24 24">
                                                        <path stroke-linecap="round" stroke-linejoin="round"
                                                            stroke-width="2"
                                                            d="M12 8v4m0 4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                                                    </svg>
                                                </div>
                                                <div class="ml-3">
                                                    <p class="text-sm text-red-700">${error}</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>

                                    <!-- Form -->
                                    <form action="../submitBLI3.do" method="POST" class="space-y-4">
                                        <!-- Student Details Section -->
                                        <div id="studentDetailsSection">
                                            <h3 class="text-lg font-medium text-gray-900 mb-4">Student Details</h3>
                                            <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                                                <div>
                                                    <label
                                                        class="block text-sm font-medium text-gray-700 mb-1">Name</label>
                                                    <input type="text" name="name"
                                                        value="<%= student.getStudentName() %>"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Student
                                                        ID</label>
                                                    <input type="text" name="studentId"
                                                        value="<%= student.getStudentMatric() %>"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">IC
                                                        Number</label>
                                                    <input type="text" name="icNumber"
                                                        value="<%= student.getStudentIC() %>"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                            </div>

                                            <div class="grid grid-cols-1 md:grid-cols-3 gap-4 mt-4">
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Course
                                                        Code</label>
                                                    <input type="text" name="courseCode"
                                                        value="<%= student.getStudentProgramme() %>"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Phone
                                                        Number</label>
                                                    <input type="text" name="phoneNumber"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label
                                                        class="block text-sm font-medium text-gray-700 mb-1">Email</label>
                                                    <input type="email" name="email"
                                                        value="<%= student.getStudentEmail() %>"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                            </div>

                                            <div class="grid grid-cols-1 md:grid-cols-2 gap-4 mt-4">
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Start
                                                        Date of Internship</label>
                                                    <input type="date" name="startDate"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">End Date
                                                        of Internship</label>
                                                    <input type="date" name="endDate"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                            </div>

                                            <div class="flex justify-end space-x-4 mt-6">
                                                <button type="button"
                                                    class="px-4 py-1.5 border border-red-500 text-red-500 rounded-lg hover:bg-red-50 transition-colors"
                                                    ${isBli3Submitted ? 'disabled' : '' }>
                                                    Cancel
                                                </button>
                                                <button type="button" onclick="showPlaceSelection()"
                                                    class="px-4 py-1.5 bg-green-500 text-white rounded-lg hover:bg-green-600 transition-colors"
                                                    ${isBli3Submitted ? 'disabled' : '' }>
                                                    Next
                                                </button>
                                            </div>
                                        </div>

                                        <!-- Place Selection Section -->
                                        <div id="placeSelectionSection" class="hidden">
                                            <h3 class="text-lg font-medium text-gray-900 mb-4">Place Selection</h3>
                                            <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                                                <!-- Company Information -->
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Company
                                                        Name</label>
                                                    <input type="text" name="companyName"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <div>
                                                    <label class="block text-sm font-medium text-gray-700 mb-1">Company
                                                        Address</label>
                                                    <input type="text" name="companyAddress"
                                                        class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli3Submitted ? 'bg-gray-100' : ''}"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                </div>
                                                <!-- Add remaining company fields following the same pattern -->
                                            </div>

                                            <!-- Confirmation Checkbox -->
                                            <div class="mt-6">
                                                <div class="flex items-start">
                                                    <input type="checkbox" id="confirmationCheck"
                                                        class="h-4 w-4 rounded border-gray-300 text-indigo-600 focus:ring-indigo-500"
                                                        ${isBli3Submitted ? 'disabled' : '' } required>
                                                    <label for="confirmationCheck" class="ml-2 text-sm text-gray-600">
                                                        I hereby agree to undergo industrial training at the above
                                                        organization...
                                                    </label>
                                                </div>
                                            </div>

                                            <!-- Warning Message -->
                                            <div class="mt-4 p-4 bg-yellow-50 border border-yellow-200 rounded-md">
                                                <p class="text-sm text-yellow-700">
                                                    <strong>Important:</strong> Once you submit this form, you will not
                                                    be able to change your placement selection.
                                                </p>
                                            </div>

                                            <!-- Action Buttons -->
                                            <div class="flex justify-end space-x-4 mt-6">
                                                <button type="button" onclick="showStudentDetails()"
                                                    class="px-4 py-1.5 border border-gray-300 text-gray-700 rounded-lg hover:bg-gray-50 transition-colors"
                                                    ${isBli3Submitted ? 'disabled' : '' }>
                                                    Previous
                                                </button>
                                                <button type="submit"
                                                    class="px-4 py-1.5 bg-green-500 text-white rounded-lg hover:bg-green-600 transition-colors"
                                                    ${isBli3Submitted ? 'disabled' : '' }>
                                                    Submit
                                                </button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <script>
                        function showPlaceSelection() {
                            document.getElementById('studentDetailsSection').style.display = 'none';
                            document.getElementById('placeSelectionSection').style.display = 'block';
                        }

                        function showStudentDetails() {
                            document.getElementById('studentDetailsSection').style.display = 'block';
                            document.getElementById('placeSelectionSection').style.display = 'none';
                        }
                    </script>
                </body>

                </html>