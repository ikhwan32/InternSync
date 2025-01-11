<%-- attendance.jsp --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/jspf/auth/auth.jspf" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<% 
    userID = Integer.parseInt(session.getAttribute("userID").toString());
    request.setAttribute("userID", userID); // Make userID available to JSTL
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance - Student Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
    </style>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>

<body class="bg-gray-50">
<div class="min-h-screen flex">
    <c:set var="page" value="attendance" scope="request" />
    <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

    <div class="flex-1">
        <c:set var="pageName" value="attendance" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

        <div class="p-8">
            <div class="bg-white rounded-xl shadow-sm p-6">
                <c:if test="${not empty param.date}">
                    <jsp:forward page="checkLogbookServlet">
                        <jsp:param name="date" value="${param.date}" />
                        <jsp:param name="userID" value="${userID}" />
                    </jsp:forward>
                </c:if>

                <form id="attendanceForm" action="${isUpdate ? 'updateLog.do' : '../submitLog.do'}" method="post" enctype="multipart/form-data">
                    <input type="hidden" name="userID" value="${userID}">
                    <c:if test="${isUpdate}">
                        <input type="hidden" name="operation" value="update">
                        <input type="hidden" name="logBookID" value="${logBookID}">
                    </c:if>

                    <div class="mb-6">
                        <label class="block text-sm font-medium text-gray-700 mb-2">Date</label>
                        <input type="text" name="attendanceDate" value="${param.date}" readonly>
                    </div>

                    <!-- Attendance Status -->
                    <div class="mb-6">
                        <label class="block text-sm font-medium text-gray-700 mb-2">Attendance Status</label>
                        <select name="attendanceStatus" id="attendanceStatus" class="w-full p-2 border border-gray-300 rounded-lg">
                            <option value="1" ${attendanceStatus == 1 ? 'selected' : ''}>Present</option>
                            <option value="0" ${attendanceStatus == 0 ? 'selected' : ''}>Absent</option>
                        </select>
                    </div>

                    <!-- Supporting Document -->
                    <div class="mb-6">
                        <label class="block text-sm font-medium text-gray-700 mb-2">Supporting Document For Being Absent</label>
                        <c:if test="${not empty attendFile}">
                            <div id="existingAttendFile" class="mb-2">
                                <p class="text-sm text-gray-600">Current file: <span>${attendFile}</span></p>
                                <label>
                                    <input type="checkbox" name="replaceAttendFile" value="true"> Replace file?
                                </label>
                            </div>
                        </c:if>
                        <input type="file" name="supportingDocument" id="supportingDocument"
                               class="w-full p-2 border border-gray-300 rounded-lg" ${not empty attendFile ? 'disabled' : ''}>
                    </div>

                    <!-- Logbook Entry -->
                    <div class="mb-8">
                        <h3 class="text-xl font-semibold text-gray-900 mb-4">Logbook Entries</h3>
                        <div class="space-y-4">
                            <div>
                                <label class="block text-sm font-medium text-gray-700">Logbook Entry</label>
                                <textarea name="logbookEntry" id="logbookEntry"
                                          class="mt-1 block w-full p-2 border border-gray-300 rounded-md">${logbookEntry}</textarea>
                            </div>
                            <div>
                                <label class="block text-sm font-medium text-gray-700">Supporting Document</label>
                                <c:if test="${not empty logbookFile}">
                                    <div id="existingLogbookFile" class="mb-2">
                                        <p class="text-sm text-gray-600">Current file: <span>${logbookFile}</span></p>
                                        <label>
                                            <input type="checkbox" name="replaceLogbookFile" value="true"> Replace file?
                                        </label>
                                    </div>
                                </c:if>
                                <input type="file" name="logbookFile" id="logbookFile"
                                       class="mt-1 block w-full p-2 border border-gray-300 rounded-md" ${not empty logbookFile ? 'disabled' : ''}>
                            </div>
                        </div>
                    </div>

                    <!-- Submit Button -->
                    <button type="submit" id="submitButton"
                            class="w-full bg-blue-600 text-white py-2 px-4 rounded-lg hover:bg-blue-700 transition duration-200">
                        ${isUpdate ? 'Update Attendance' : 'Submit Attendance'}
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    // JavaScript to enable/disable file input based on checkbox (Optional)
    const replaceAttendFileCheckbox = document.querySelector('input[name="replaceAttendFile"]');
    const supportingDocumentInput = document.getElementById('supportingDocument');
    if (replaceAttendFileCheckbox) {
        replaceAttendFileCheckbox.addEventListener('change', () => {
            supportingDocumentInput.disabled = !replaceAttendFileCheckbox.checked;
        });
    }

    const replaceLogbookFileCheckbox = document.querySelector('input[name="replaceLogbookFile"]');
    const logbookFileInput = document.getElementById('logbookFile');
    if (replaceLogbookFileCheckbox) {
        replaceLogbookFileCheckbox.addEventListener('change', () => {
            logbookFileInput.disabled = !replaceLogbookFileCheckbox.checked;
        });
    }
</script>
</body>
</html>