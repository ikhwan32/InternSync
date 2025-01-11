<%-- Document : bli01 Created on : Dec 14, 2024, 6:03:37 PM Author : myPC --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ include file="/WEB-INF/jspf/student/import.jspf" %>

                <!DOCTYPE html>
                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <title>Student BLI01 - Internship Management System</title>
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
                         <!-- Sidebar -->
        <c:set var="page" value="bli" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="pageName" value="bli01" scope="request" />
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

                            <!-- Page Content -->
                            <div class="p-8">
                                <div class="bg-white rounded-xl shadow-sm p-6">
                                    <!-- Header -->
                                    <div class="mb-8">
                                        <h2 class="text-2xl font-bold text-gray-900">BLI 01</h2>
                                        <p class="text-gray-600 mt-1">Personal Information Form</p>
                                    </div>

                                    <!-- Alert Messages -->
                                    <c:set var="isBli1Submitted" value="${not empty bli1 && bli1}" scope="request" />

                                    <% if (session.getAttribute("error") !=null) { %>
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
                                                    <p class="text-sm text-red-700">
                                                        <%= session.getAttribute("error") %>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                        <% session.removeAttribute("error"); %>
                                            <% } %>

                                                <% if (session.getAttribute("success") !=null) { %>
                                                    <div
                                                        class="mb-6 p-4 rounded-lg bg-green-50 border border-green-200">
                                                        <div class="flex">
                                                            <div class="flex-shrink-0">
                                                                <svg class="h-5 w-5 text-green-400" fill="none"
                                                                    stroke="currentColor" viewBox="0 0 24 24">
                                                                    <path stroke-linecap="round" stroke-linejoin="round"
                                                                        stroke-width="2" d="M5 13l4 4L19 7" />
                                                                </svg>
                                                            </div>
                                                            <div class="ml-3">
                                                                <p class="text-sm text-green-700">
                                                                    <%= session.getAttribute("success") %>
                                                                </p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <% session.removeAttribute("success"); %>
                                                        <% } %>

                                                            <!-- Form -->
                                                            <!-- Form -->
                                                            <form action="../BLI01Submit.do" method="POST"
                                                                class="space-y-4">
                                                                <!-- Reduced space-y-6 to space-y-4 -->
                                                                <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                                                                    <!-- Changed to 3 columns and reduced gap -->
                                                                    <!-- Personal Information -->
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Name</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="name"
                                                                            value="<%= student.getStudentName() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">IC
                                                                            Number</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="icNumber"
                                                                            value="<%= student.getStudentIC() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Student
                                                                            ID</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="studentId"
                                                                            value="<%= student.getStudentMatric() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                </div>

                                                                <div class="grid grid-cols-1 md:grid-cols-4 gap-4">
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Course
                                                                            Code</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="courseCode"
                                                                            value="<%= student.getStudentProgramme() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Semester</label>
                                                                        <input type="number"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="semester"
                                                                            value="<%= student.getStudentSemester() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">CGPA</label>
                                                                        <input type="text"
                                                                            pattern="^(0(\.00?)?|1(\.[0-9]{1,2})?|2(\.[0-9]{1,2})?|3(\.[0-9]{1,2})?|4(\.00?)?)$"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="cgpa"
                                                                            value="<%= student.getStudentCGPA() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Phone
                                                                            Number</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="phoneNumber" ${isBli1Submitted
                                                                            ? 'disabled' : '' } required>
                                                                    </div>
                                                                </div>

                                                                <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Email</label>
                                                                        <input type="email"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="email"
                                                                            value="<%= student.getStudentEmail() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Letter
                                                                            Address</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="letterAddress"
                                                                            value="<%= student.getLetterAddress() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                </div>

                                                                <!-- Guardian Information -->
                                                                <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Guardian
                                                                            Name</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="parentName"
                                                                            value="<%= student.getGuardianName() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Guardian
                                                                            Address</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="parentAddress"
                                                                            value="<%= student.getGuardianAddress() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                    <div>
                                                                        <label
                                                                            class="block text-sm font-medium text-gray-700 mb-1">Guardian
                                                                            Phone Number</label>
                                                                        <input type="text"
                                                                            class="w-full px-3 py-1.5 border rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 ${isBli1Submitted ? 'bg-gray-100' : ''}"
                                                                            name="parentPhoneNumber"
                                                                            value="<%= student.getGuardianPhone() %>"
                                                                            ${isBli1Submitted ? 'disabled' : '' }
                                                                            required>
                                                                    </div>
                                                                </div>

                                                                <!-- Buttons -->
                                                                <div class="flex justify-end space-x-4 mt-6">
                                                                    <button type="button"
                                                                        class="px-4 py-1.5 border border-red-500 text-red-500 rounded-lg hover:bg-red-50 transition-colors ${isBli1Submitted ? 'opacity-50 cursor-not-allowed' : ''}"
                                                                        ${isBli1Submitted ? 'disabled' : '' }>
                                                                        Cancel
                                                                    </button>
                                                                    <button type="submit"
                                                                        class="px-4 py-1.5 bg-green-500 text-white rounded-lg hover:bg-green-600 transition-colors ${isBli1Submitted ? 'opacity-50 cursor-not-allowed' : ''}"
                                                                        ${isBli1Submitted ? 'disabled' : '' }>
                                                                        Submit
                                                                    </button>
                                                                </div>
                                                            </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </body>

                </html>