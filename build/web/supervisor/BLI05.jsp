<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BLI05 Form - Internship Management System</title>
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
    <div class="min-h-screen flex">
        <!-- Sidebar -->
        <c:set var="page" value="task" scope="request" />
        <%@ include file="/WEB-INF/jspf/supervisor/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="page" value="bli05" scope="request" />
            <%@ include file="/WEB-INF/jspf/supervisor/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">

                <!-- Stepper -->
                <div class="flex justify-between items-center mb-8">
                    <div class="flex-1 text-center cursor-pointer stepper-item active" onclick="showSection('section-b')">
                        <div class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white">
                            1
                        </div>
                        <p class="mt-2 stepper-label text-blue-500">Section B</p>
                    </div>
                    <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                    <div class="flex-1 text-center cursor-pointer stepper-item" onclick="showSection('section-c')">
                        <div class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                            2
                        </div>
                        <p class="mt-2 stepper-label text-gray-500">Section C</p>
                    </div>
                    <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                    <div class="flex-1 text-center cursor-pointer stepper-item" onclick="showSection('section-d')">
                        <div class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                            3
                        </div>
                        <p class="mt-2 stepper-label text-gray-500">Section D</p>
                    </div>
                    <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                    <div class="flex-1 text-center cursor-pointer stepper-item" onclick="showSection('section-e')">
                        <div class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                            4
                        </div>
                        <p class="mt-2 stepper-label text-gray-500">Section E</p>
                    </div>
                </div>

                <!-- Form Sections -->
                <div class="bg-white rounded-xl shadow-sm p-6">
                    <form action="../bli05Submit.do" method="POST">
                        <!-- Section B -->
                        <div id="section-b" class="form-section">
                            <h3 class="text-xl font-bold mb-4">Section B: Company's Expectations</h3>
                            <div class="mb-4">
                                <label class="block text-gray-700">1. Effectiveness in Communication</label>
                                <select class="w-full p-2 border rounded">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                            <!-- Add more fields as needed -->
                            <div class="mt-4 flex justify-end">
                                <button type="button" class="bg-green-500 text-white px-4 py-2 rounded" onclick="showSection('section-c')">Next</button>
                            </div>
                        </div>

                        <!-- Section C -->
                        <div id="section-c" class="form-section hidden">
                            <h3 class="text-xl font-bold mb-4">Section C: Company's Observation</h3>
                            <div class="mb-4">
                                <label class="block text-gray-700">1. Co-operation with co-workers, supervisors and subordinates</label>
                                <select class="w-full p-2 border rounded">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                            <!-- Add more fields as needed -->
                            <div class="mt-4 flex justify-between">
                                <button type="button" class="bg-blue-500 text-white px-4 py-2 rounded" onclick="showSection('section-b')">Previous</button>
                                <button type="button" class="bg-green-500 text-white px-4 py-2 rounded" onclick="showSection('section-d')">Next</button>
                            </div>
                        </div>

                        <!-- Section D -->
                        <div id="section-d" class="form-section hidden">
                            <h3 class="text-xl font-bold mb-4">Section D: Adequacy of University's Curriculum</h3>
                            <div class="mb-4">
                                <label class="block text-gray-700">A. Intern is given task related to their area of education</label>
                                <select class="w-full p-2 border rounded">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                            <!-- Add more fields as needed -->
                            <div class="mt-4 flex justify-between">
                                <button type="button" class="bg-blue-500 text-white px-4 py-2 rounded" onclick="showSection('section-c')">Previous</button>
                                <button type="button" class="bg-green-500 text-white px-4 py-2 rounded" onclick="showSection('section-e')">Next</button>
                            </div>
                        </div>

                        <!-- Section E -->
                        <div id="section-e" class="form-section hidden">
                            <h3 class="text-xl font-bold mb-4">Section E: Final Evaluation</h3>
                            <div class="mb-4">
                                <label class="block text-gray-700">State any weakness of the intern and suggest a way to improve intern's capability:</label>
                                <input type="text" class="w-full p-2 border rounded" placeholder="Enter weakness">
                            </div>
                            <!-- Add more fields as needed -->
                            <div class="mt-4 flex justify-between">
                                <button type="button" class="bg-blue-500 text-white px-4 py-2 rounded" onclick="showSection('section-d')">Previous</button>
                                <button type="submit" class="bg-green-500 text-white px-4 py-2 rounded">Submit</button>
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
                'section-b': 0,
                'section-c': 1,
                'section-d': 2,
                'section-e': 3
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
        showSection('section-b');
    </script>
</body>
</html>