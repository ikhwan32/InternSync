<%-- 
    Document   : BLI02
    Created on : Dec 14, 2024, 1:13:32 AM
    Author     : Itqnazs
--%>
<%
    String selectedStudent = request.getParameter("studentName");
    if (selectedStudent == null || selectedStudent.isEmpty()) {
        response.sendRedirect("task.jsp");
        return;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BLI02 Form - Internship Management System</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }

        .stepper-item.active .stepper-circle {
            background-color: #3b82f6; /* Blue background for active step */
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.completed .stepper-circle {
            background-color: #3b82f6; /* Blue background for completed steps */
            border-color: #3b82f6;
            color: white;
        }

        .stepper-item.active .stepper-label {
            color: #3b82f6; /* Blue text for active step */
        }

        .stepper-item.completed .stepper-label {
            color: #3b82f6; /* Blue text for completed steps */
        }
    </style>
</head>
<body class="bg-gray-50">
    <c:set var="page" value="task" scope="request" />


    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <%@ include file="/WEB-INF/jspf/supervisor/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
             <c:set var="page" value="bli02" scope="request" />
            <%@ include file="/WEB-INF/jspf/supervisor/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">
                <!-- Stepper -->
                <div class="flex justify-between items-center mb-6">
                    <div class="flex-1 text-center cursor-pointer stepper-item active" onclick="showSection('student-details')">
                        <div class="stepper-circle flex items-center justify-center w-8 h-8 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white">
                            1
                        </div>
                        <p class="mt-1 stepper-label text-blue-500 text-sm">Student Details</p>
                    </div>
                    <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                    <div class="flex-1 text-center cursor-pointer stepper-item" onclick="showSection('organization-details')">
                        <div class="stepper-circle flex items-center justify-center w-8 h-8 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                            2
                        </div>
                        <p class="mt-1 stepper-label text-gray-500 text-sm">Organization Details</p>
                    </div>
                </div>

                <!-- Form Container -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <form action="${pageContext.request.contextPath}/supervisor/BLI02Servlet" method="POST" onsubmit="return validateAndSubmit()">
                        <!-- Student Details Section -->
                        <div id="student-details" class="form-section">
                            <h2 class="text-lg font-semibold mb-4">Student Details</h2>
                            <div class="space-y-4">
                                <div>
                                    <label class="block text-gray-700 text-sm">Do you agree to accept the student below?</label>
                                    <div class="flex space-x-3">
                                        <label class="flex items-center text-sm">
                                            <input type="radio" name="option" value="option1" class="form-radio" required>
                                            <span class="ml-1">Agree</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="radio" name="option" value="option2" class="form-radio" required>
                                            <span class="ml-1">Disagree</span>
                                        </label>
                                    </div>
                                </div>
                                <div class="overflow-x-auto">
                                    <table class="min-w-full bg-white border border-gray-200">
                                        <thead>
                                            <tr>
                                                <th class="px-4 py-2 border-b text-center">Number</th>
                                                <th class="px-4 py-2 border-b">Student Name</th>
                                                <th class="px-4 py-2 border-b">End Date</th>
                                                <th class="px-4 py-2 border-b">Phone Number</th>
                                                <th class="px-4 py-2 border-b">Email</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td class="px-4 py-2 border-b text-center">1</td>
                                                <td class="px-4 py-2 border-b">${requestScope.studentName}</td>
                                                <td class="px-4 py-2 border-b">${requestScope.endDate}</td>
                                                <td class="px-4 py-2 border-b">${requestScope.studentPhone}</td>
                                                <td class="px-4 py-2 border-b">${requestScope.studentEmail}</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Tasks to Assign:</label>
                                    <div class="grid grid-cols-2 gap-2">
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Computer Maintenance" class="form-checkbox">
                                            <span class="ml-1">Computer Maintenance</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Network/Security" class="form-checkbox">
                                            <span class="ml-1">Network/Security</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="System/Web/Mobile Development" class="form-checkbox">
                                            <span class="ml-1">System/Web/Mobile Development</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Multimedia Courseware" class="form-checkbox">
                                            <span class="ml-1">Multimedia Courseware</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Training" class="form-checkbox">
                                            <span class="ml-1">Training</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Database" class="form-checkbox">
                                            <span class="ml-1">Database</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Communication" class="form-checkbox">
                                            <span class="ml-1">Communication</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Documentation" class="form-checkbox">
                                            <span class="ml-1">Documentation</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Testing" class="form-checkbox">
                                            <span class="ml-1">Testing</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="task" value="Others" class="form-checkbox">
                                            <span class="ml-1">Others</span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="mt-4 flex justify-end">
                                <button type="button" class="bg-green-500 text-white px-3 py-1 rounded text-sm" onclick="showSection('organization-details')">Next</button>
                            </div>
                        </div>

                        <!-- Organization Details Section -->
                        <div id="organization-details" class="form-section hidden">
                            <h2 class="text-lg font-semibold mb-4">Organization Details</h2>
                            <div class="space-y-4">
                                <div>
                                    <label class="block text-gray-700 text-sm">Organization Name:</label>
                                    <input type="text" name="compName" class="w-full p-1 border rounded text-sm" placeholder="Organization Name" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Address:</label>
                                    <input type="text" name="compAddress" class="w-full p-1 border rounded text-sm" placeholder="Address" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Phone Number:</label>
                                    <input type="text" name="compPhone" class="w-full p-1 border rounded text-sm" placeholder="Phone Number" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Fax Number:</label>
                                    <input type="text" name="compFax" class="w-full p-1 border rounded text-sm" placeholder="Fax Number" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Supervisor Name:</label>
                                    <input type="text" name="compSupervisor" class="w-full p-1 border rounded text-sm" placeholder="Supervisor's Name" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Email:</label>
                                    <input type="email" name="compEmail" class="w-full p-1 border rounded text-sm" placeholder="Email" required>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Convenience Provided:</label>
                                    <div class="flex space-x-3">
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="allowance" value="true" class="form-checkbox">
                                            <span class="ml-1">Allowance</span>
                                        </label>
                                        <label class="flex items-center text-sm">
                                            <input type="checkbox" name="hostel" value="true" class="form-checkbox">
                                            <span class="ml-1">Hostel</span>
                                        </label>
                                    </div>
                                </div>
                                <div>
                                    <label class="block text-gray-700 text-sm">Confirmation:</label>
                                    <label class="flex items-center text-sm">
                                        <input type="checkbox" name="confirmation" class="form-checkbox" required>
                                        <span class="ml-1">I hereby confirm that our organization has reviewed the application of the student mentioned above for industrial training.</span>
                                    </label>
                                </div>
                            </div>
                            <div class="mt-4 flex justify-between">
                                <button type="button" class="bg-blue-500 text-white px-3 py-1 rounded text-sm" onclick="showSection('student-details')">Previous</button>
                                <button type="submit" class="bg-green-500 text-white px-3 py-1 rounded text-sm">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
        // Function to show a specific section and update the stepper
        function showSection(sectionId) {
            // Hide all sections
            document.querySelectorAll('.form-section').forEach(section => {
                section.classList.add('hidden');
            });

            // Show the selected section
            document.getElementById(sectionId).classList.remove('hidden');

            // Update the stepper
            updateStepper(sectionId);
        }

        // Function to update the stepper
        function updateStepper(sectionId) {
            const stepperItems = document.querySelectorAll('.stepper-item');

            // Map section IDs to their step indexes
            const sectionToStepIndex = {
                'student-details': 0,
                'organization-details': 1
            };

            // Get the current step index
            const currentStepIndex = sectionToStepIndex[sectionId];

            stepperItems.forEach((item, index) => {
                item.classList.remove('active', 'completed');

                if (index < currentStepIndex) {
                    item.classList.add('completed'); // Mark previous steps as completed
                } else if (index === currentStepIndex) {
                    item.classList.add('active'); // Mark the current step as active
                }
            });
        }

        // Initialize the form with the first section
        showSection('student-details');
    </script>
</body>
</html>
