<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Logbook Calendar - Internship Management System</title>
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
                <!-- Calendar Section -->
                <div class="mb-8">
                    <h2 class="text-2xl font-bold text-gray-900">Logbook Calendar</h2>
                    <p class="text-gray-600 mt-1">Select a date to update your logbook and attendance.</p>
                </div>

                <div class="bg-white rounded-xl shadow-sm p-6">
                    <table class="w-full text-center">
                        <thead>
                            <tr>
                                <th class="p-2">Sun</th>
                                <th class="p-2">Mon</th>
                                <th class="p-2">Tue</th>
                                <th class="p-2">Wed</th>
                                <th class="p-2">Thu</th>
                                <th class="p-2">Fri</th>
                                <th class="p-2">Sat</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Example calendar rows -->
                            <tr>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-01" class="text-blue-500 hover:underline">1</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-02" class="text-blue-500 hover:underline">2</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-03" class="text-blue-500 hover:underline">3</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-04" class="text-blue-500 hover:underline">4</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-05" class="text-blue-500 hover:underline">5</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-06" class="text-blue-500 hover:underline">6</a></td>
                                <td class="p-2"><a href="logbook.jsp?date=2023-10-07" class="text-blue-500 hover:underline">7</a></td>
                            </tr>
                            <!-- Add more rows as needed -->
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>

</html>