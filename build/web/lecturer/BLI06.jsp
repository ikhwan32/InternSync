<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="/WEB-INF/jspf/lecturer/import.jspf" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>BLI06 Form - Internship Management System</title>
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
                    <c:set var="page" value="task" scope="request" />
                    <%@ include file="/WEB-INF/jspf/supervisor/sidebar.jspf" %>

                        <!-- Main Content -->
                        <div class="flex-1">
                            <!-- Top bar -->
                            <c:set var="page" value="bli06" scope="request" />
                            <%@ include file="/WEB-INF/jspf/supervisor/top.jspf" %>

                                <!-- Page Content -->
                                <div class="p-8">
                                    <!-- Stepper -->
                                    <div class="flex justify-between items-center mb-8">
                                        <div class="flex-1 text-center cursor-pointer stepper-item active"
                                            onclick="showSection('section-1')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white">
                                                1
                                            </div>
                                            <p class="mt-2 stepper-label text-blue-500">Section 1</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('section-2')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                2
                                            </div>
                                            <p class="mt-2 stepper-label text-gray-500">Section 2</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('section-3')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                3
                                            </div>
                                            <p class="mt-2 stepper-label text-gray-500">Section 3</p>
                                        </div>
                                    </div>

                                    <!-- Form Sections -->
                                    <div class="bg-white rounded-xl shadow-sm p-6">
                                        <form action="submitBLI06.do" method="POST">
                                            <!-- Section 1 -->
                                            <div id="section-1" class="form-section">
                                                <h3 class="text-xl font-bold mb-4">BLI 06 - Industrial Training Visit
                                                    Evaluation Form</h3>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Student Name:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="name"
                                                        placeholder="Student Name" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Programme:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="programme" placeholder="Programme" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Matric Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="matricNum" placeholder="Matric Number" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Phone Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="phoneNum"
                                                        placeholder="Phone Number" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Start Date:</label>
                                                    <input type="date" class="w-full p-2 border rounded"
                                                        name="startDate" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">End Date:</label>
                                                    <input type="date" class="w-full p-2 border rounded" name="endDate"
                                                        required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Organization Supervisor
                                                        Name:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="svName"
                                                        placeholder="Supervisor's Name" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Organization Name and
                                                        Address:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="compNameAddress"
                                                        placeholder="Organization Name and Address" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Academic Supervisor Name:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="lectName"
                                                        placeholder="Academic Supervisor Name" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Visitation Date:</label>
                                                    <input type="date" class="w-full p-2 border rounded" name="date"
                                                        required>
                                                </div>
                                                <div class="mt-4 flex justify-end">
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-2')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Section 2 -->
                                            <div id="section-2" class="form-section hidden">
                                                <h3 class="text-xl font-bold mb-4">Section A: Student Evaluation</h3>
                                                <div class="mb-6">
                                                    <!-- q1 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Personality -
                                                            way of dressing</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="personality" id="p1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="p1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="personality" id="p2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="p2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="personality" id="p3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="p3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="personality" id="p4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="p4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="personality" id="p5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="p5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q2 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Obey the organization rules (Attendance, determination meet office hours etc.)</label>
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
                                                    <!-- q3 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Ability to take responsibility</label>
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
                                                    <!-- q4 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Implementation task / project given</label>
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
                                                    <!-- q5 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Intelligence and ability in receive and increase knowledge and skills</label>
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
                                                    <!-- q6 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">6. Ability to receive instructions</label>
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
                                                    <!-- q7 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">7. Ability to work in a team</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q7" id="q7_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q7_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q7" id="q7_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q7_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q7" id="q7_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q7_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q7" id="q7_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q7_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q7" id="q7_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q7_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q8 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">8. Adaptation on workplace</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q8" id="q8_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q8_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q8" id="q8_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q8_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q8" id="q8_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q8_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q8" id="q8_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q8_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q8" id="q8_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q8_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q9 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">9. Self-confidence</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q9" id="q9_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q9_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q9" id="q9_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q9_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q9" id="q9_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q9_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q9" id="q9_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q9_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q9" id="q9_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q9_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q10 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">10. Ability to translate task into logbook</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q10" id="q10_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q10_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q10" id="q10_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q10_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q10" id="q10_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q10_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q10" id="q10_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q10_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q10" id="q10_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q10_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    
                             
                                                </div>
                                                
                                                <!-- Add more fields as needed -->
                                                
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-1')">Previous</button>
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-3')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Section 3 -->
                                            <div id="section-3" class="form-section hidden">
                                                <h3 class="text-xl font-bold mb-4">Section B: Student Evaluation</h3>
                                                <div class="mb-6">
                                                    <!-- q11 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Suitability the assignment given</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q11" id="q11_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q11_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q11" id="q11_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q11_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q11" id="q11_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q11_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q11" id="q11_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q11_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q11" id="q11_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q11_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q12 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Guidance from organization supervisor</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q12" id="q12_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q12_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q12" id="q12_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q12_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q12" id="q12_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q12_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q12" id="q12_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q12_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q12" id="q12_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q12_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q13 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Cooperation from organization staff</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q13" id="q13_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q13_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q13" id="q13_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q13_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q13" id="q13_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q13_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q13" id="q13_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q13_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q13" id="q13_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q13_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q14 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Comfort of the working space</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q14" id="q14_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q14_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q14" id="q14_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q14_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q14" id="q14_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q14_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q14" id="q14_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q14_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q14" id="q14_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q14_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q15 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Provide computer hardware and software</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q15" id="q15_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q15_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q15" id="q15_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q15_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q15" id="q15_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q15_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q15" id="q15_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q15_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q15" id="q15_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q15_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q16 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">6. Organization location environment (public facility, safety and others)</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q16" id="q16_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q16_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q16" id="q16_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q16_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q16" id="q16_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q16_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q16" id="q16_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q16_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q16" id="q16_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q16_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- p17 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">7. Industrial training suitability</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q17" id="q17_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q17_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q17" id="q17_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q17_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q17" id="q17_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q17_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q17" id="q17_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q17_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q17" id="q17_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q17_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- q18 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">8. Responsibility level given by the organization</label>
                                                        <div class="flex gap-2">
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q18" id="q18_1" value="1"
                                                                    class="rating-input hidden">
                                                                <label for="q18_1"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">1</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q18" id="q18_2" value="2"
                                                                    class="rating-input hidden">
                                                                <label for="q18_2"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">2</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q18" id="q18_3" value="3"
                                                                    class="rating-input hidden">
                                                                <label for="q18_3"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">3</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q18" id="q18_4" value="4"
                                                                    class="rating-input hidden">
                                                                <label for="q18_4"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">4</label>
                                                            </div>
                                                            <div class="flex items-center">
                                                                <input type="radio" name="q18" id="q18_5" value="5"
                                                                    class="rating-input hidden">
                                                                <label for="q18_5"
                                                                    class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">5</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- Add more fields as needed -->
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Comment:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="comment"
                                                        placeholder="Comment" required>
                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-2')">Previous</button>
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
                            'section-1': 0,
                            'section-2': 1,
                            'section-3': 2
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
                    showSection('section-1');
                </script>
            </body>

            </html>