<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Logbook Entry - Internship Management System</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
</head>

<body class="bg-gray-50">
    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <!-- Logbook Entry Section -->
                <div class="mb-8">
                    <h2 class="text-2xl font-bold text-gray-900">Logbook Entry for ${param.date}</h2>
                    <p class="text-gray-600 mt-1">Fill in your attendance and logbook details for the selected date.</p>
                </div>

                <div class="bg-white rounded-xl shadow-sm p-6">
                    <form action="LogbookServlet" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="date" value="${param.date}">

                        <!-- Attendance Section -->
                        <div class="mb-8">
                            <h3 class="text-xl font-semibold text-gray-900 mb-4">Attendance</h3>
                            <div class="space-y-4">
                                <div>
                                    <label class="block text-sm font-medium text-gray-700">Attendance Status</label>
                                    <select name="attendanceStatus" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
                                        <option value="Present">Present</option>
                                        <option value="Absent">Absent</option>
                                        <option value="Late">Late</option>
                                    </select>
                                </div>
                                <div>
                                    <label class="block text-sm font-medium text-gray-700">Reason for Absence/Late</label>
                                    <textarea name="reason" class="mt-1 block w-full p-2 border border-gray-300 rounded-md"></textarea>
                                </div>
                                <div>
                                    <label class="block text-sm font-medium text-gray-700">Supporting Document (Image/PDF)</label>
                                    <input type="file" name="attendanceDocument" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
                                </div>
                            </div>
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
                                    <input type="file" name="logbookDocument" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
                                </div>
                            </div>
                        </div>

                        <!-- Submit Button -->
                        <div class="flex justify-end">
                            <button type="submit" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>