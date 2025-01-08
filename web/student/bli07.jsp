<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="/WEB-INF/jspf/student/import.jspf" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>BLI07 - Internship Management System</title>
                <script src="https://cdn.tailwindcss.com"></script>
                <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap"
                    rel="stylesheet">
                <style>
                    body {
                        font-family: 'Inter', sans-serif;
                    }

                    .stepper-item.active .stepper-circle {
                        background-color: #3b82f6;
                        /* Blue background for active step */
                        border-color: #3b82f6;
                        color: white;
                    }

                    .stepper-item.completed .stepper-circle {
                        background-color: #3b82f6;
                        /* Blue background for completed steps */
                        border-color: #3b82f6;
                        color: white;
                    }

                    .stepper-item.active .stepper-label {
                        color: #3b82f6;
                        /* Blue text for active step */
                    }

                    .stepper-item.completed .stepper-label {
                        color: #3b82f6;
                        /* Blue text for completed steps */
                    }

                    .rating-input:checked+label {
                        background-color: #3b82f6;
                        color: white;
                    }
                </style>
            </head>

            <body class="bg-gray-50">
                <div class="min-h-screen flex">
                    <!-- Sidebar -->
                    <c:set var="page" value="bliForms" scope="request" />
                    <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

                        <!-- Main Content -->
                        <div class="flex-1">
                            <!-- Top bar -->
                            <c:set var="page" value="bli07" scope="request" />
                            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

                                <!-- Page Content -->
                                <div class="p-8">
                                    <!-- Stepper -->
                                    <div class="flex justify-between items-center mb-8">
                                        <div class="flex-1 text-center cursor-pointer stepper-item active"
                                            onclick="showSection('personal')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white">
                                                1
                                            </div>
                                            <p class="mt-2 stepper-label text-blue-500">Personal Information</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('partA')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                2
                                            </div>
                                            <p class="mt-2 stepper-label text-gray-500">Part A</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('partB')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                3
                                            </div>
                                            <p class="mt-2 stepper-label text-gray-500">Part B</p>
                                        </div>
                                    </div>

                                    <!-- Form Container -->
                                    <div class="bg-white rounded-xl shadow-sm p-6">
                                        <form action="../bli07Submit.do" method="POST">
                                            <!-- Personal Information Section -->
                                            <div id="personal" class="form-section">
                                                <h2 class="text-lg font-semibold mb-4">Student Details</h2>
                                                <div class="space-y-4">
                                                    <div>
                                                        <label class="block text-gray-700">Name:</label>
                                                        <input type="text" name="name" class="w-full p-2 border rounded"
                                                            placeholder="Enter your name" required>
                                                    </div>
                                                    <div>
                                                        <label class="block text-gray-700">Student ID:</label>
                                                        <input type="text" name="studentId"
                                                            class="w-full p-2 border rounded"
                                                            placeholder="Enter your student ID" required>
                                                    </div>
                                                    <div>
                                                        <label class="block text-gray-700">IC Number:</label>
                                                        <input type="text" name="icNumber"
                                                            class="w-full p-2 border rounded"
                                                            placeholder="Enter your IC number" required>
                                                    </div>
                                                    <div>
                                                        <label class="block text-gray-700">Course Code:</label>
                                                        <input type="text" name="courseCode"
                                                            class="w-full p-2 border rounded"
                                                            placeholder="Enter your course code" required>
                                                    </div>
                                                    <div>
                                                        <label class="block text-gray-700">Phone Number:</label>
                                                        <input type="text" name="phoneNumber"
                                                            class="w-full p-2 border rounded"
                                                            placeholder="Enter your phone number" required>
                                                    </div>
                                                    <div>
                                                        <label class="block text-gray-700">Internship Period:</label>
                                                        <input type="text" name="internshipPeriod"
                                                            class="w-full p-2 border rounded"
                                                            placeholder="Enter your internship period" required>
                                                    </div>
                                                </div>
                                                <div class="mt-4 flex justify-end">
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('partA')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Part A Section -->
                                            <div id="partA" class="form-section hidden">
                                                <h2 class="text-lg font-semibold mb-4">Part A: Assessment of the
                                                    Organization</h2>
                                                <div class="mb-6">

                                                    <!-- Q1 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Is the
                                                            assigned assignment or project related to your area of
                                                            specialization?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q1" id="q1_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q1_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q1" id="q1_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q1_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q1" id="q1_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q1_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q1" id="q1_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q1_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q1" id="q1_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q1_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Q2 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Does the
                                                            employer provide
                                                            appropriate computer hardware or software for your
                                                            convenience to carry out industrial training?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q2" id="q2_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q2_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q2" id="q2_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q2_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q2" id="q2_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q2_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q2" id="q2_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q2_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q2" id="q2_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q2_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Q3 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Is the allocated time fully used
                                                            to carry out the assigned task or project?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q3" id="q3_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q3_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q3" id="q3_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q3_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q3" id="q3_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q3_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q3" id="q3_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q3_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q3" id="q3_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q3_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Q4 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Does the employer supervise and
                                                            provide guidance during the implementation of assignments or
                                                            industrial training projects?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q4" id="q4_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q4_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q4" id="q4_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q4_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q4" id="q4_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q4_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q4" id="q4_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q4_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q4" id="q4_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q4_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Q5 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Does the employer involve you in
                                                            activities outside of work (sports, social, religious
                                                            activities, etc.)?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q5" id="q5_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q5_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q5" id="q5_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q5_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q5" id="q5_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q5_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q5" id="q5_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q5_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q5" id="q5_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q5_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Q6 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">6. Would you recommend other
                                                            students to undergo industrial training in this
                                                            organization?</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q6" id="q6_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q6_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q6" id="q6_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q6_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q6" id="q6_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q6_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q6" id="q6_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q6_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q6" id="q6_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q6_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>


                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('personal')">Previous</button>
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('partB')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Part B Section -->
                                            <div id="partB" class="form-section hidden">
                                                <h2 class="text-lg font-semibold mb-4">Part B: Review</h2>
                                                <div class="space-y-4">
                                                    <div>
                                                        <label class="text-gray-700">6. Would you recommend other
                                                            students to undergo industrial training in this
                                                            organization?</label>
                                                        <textarea class="w-full p-2 border rounded"
                                                            name="recommendation"></textarea>
                                                    </div>
                                                    <div>
                                                        <label class="text-gray-700">7. Other suggestions or comments if
                                                            any?</label>
                                                        <textarea class="w-full p-2 border rounded"
                                                            name="comments"></textarea>
                                                    </div>
                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('partA')">Previous</button>
                                                    <button type="submit"
                                                        class="bg-green-500 text-white px-4 py-2 rounded">Submit</button>
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
                            personal: 0,
                            partA: 1,
                            partB: 2
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
                    showSection('personal');
                </script>
            </body>

            </html>