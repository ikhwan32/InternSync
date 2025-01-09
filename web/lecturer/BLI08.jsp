<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="/WEB-INF/jspf/lecturer/import.jspf" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>BLI08 Form - Internship Management System</title>
                <script src="https://cdn.tailwindcss.com"></script>
                <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap"
                    rel="stylesheet">
                <style>
                    body {
                        font-family: 'Inter', sans-serif;
                    }

                    .stepper-item.active .stepper-circle {
                        background-color: #3b82f6;
                        border-color: #3b82f6;
                        color: white;
                    }

                    .stepper-item.completed .stepper-circle {
                        background-color: #3b82f6;
                        border-color: #3b82f6;
                        color: white;
                    }

                    .stepper-item.active .stepper-label {
                        color: #3b82f6;
                    }

                    .stepper-item.completed .stepper-label {
                        color: #3b82f6;
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
                    <%@ include file="/WEB-INF/jspf/lecturer/sidebar.jspf" %>

                        <!-- Main Content -->
                        <div class="flex-1">
                            <!-- Top bar -->
                            <c:set var="page" value="bli08" scope="request" />
                            <%@ include file="/WEB-INF/jspf/lecturer/top.jspf" %>

                                <!-- Page Content -->
                                <div class="p-8">
                                    <!-- Stepper -->
                                    <div class="flex justify-between items-center mb-8">
                                        <div class="flex-1 text-center cursor-pointer stepper-item active"
                                            onclick="showSection('section-1')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white">
                                                1</div>
                                            <p class="mt-2 stepper-label text-blue-500">Student Info</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('section-2')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                2</div>
                                            <p class="mt-2 stepper-label text-gray-500">Logbook</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('section-3')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                3</div>
                                            <p class="mt-2 stepper-label text-gray-500">Report</p>
                                        </div>
                                        <div class="w-full border-t-2 border-gray-300 mx-4"></div>
                                        <div class="flex-1 text-center cursor-pointer stepper-item"
                                            onclick="showSection('section-4')">
                                            <div
                                                class="stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500">
                                                4</div>
                                            <p class="mt-2 stepper-label text-gray-500">Feedback</p>
                                        </div>
                                    </div>

                                    <!-- Form Sections -->
                                    <div class="bg-white rounded-xl shadow-sm p-6">
                                        <form action="submitBLI08.do" method="POST">
                                            <!-- Section 1: Student Information -->
                                            <div id="section-1" class="form-section">
                                                <h3 class="text-xl font-bold mb-4">BLI 08 - Academic Supervisor
                                                    Evaluation Form</h3>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Student Name:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="name"
                                                        placeholder="Student Name" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Matric Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="matricNum" placeholder="Matric Number" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Programme:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="programme" placeholder="Programme" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Phone Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="phoneNum"
                                                        placeholder="Phone Number" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Industrial Training
                                                        Period:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="LiDuration" placeholder="Industrial Training Period"
                                                        required>
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
                                                    <label class="block text-gray-700">Office Phone Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="compPhone" placeholder="Office Phone Number" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Academic Supervisor Name:</label>
                                                    <input type="text" class="w-full p-2 border rounded" name="lectName"
                                                        placeholder="Academic Supervisor Name" required>
                                                </div>
                                                <div class="mb-4">
                                                    <label class="block text-gray-700">Office Phone Number:</label>
                                                    <input type="text" class="w-full p-2 border rounded"
                                                        name="lectPhone" placeholder="Office Phone Number" required>
                                                </div>
                                                <div class="mt-4 flex justify-end">
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-2')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Section 2: Logbook Evaluation -->
                                            <div id="section-2" class="form-section hidden">
                                                <h3 class="text-xl font-bold mb-4">Section A: Logbook Evaluation</h3>
                                                <div class="mb-6">
                                                    <!-- Question 1 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Logbook
                                                            internal notes tidiness</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q1" id="q1_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q1_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 2 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Student
                                                            ability to translate daily/weekly assignment into
                                                            logbook</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q2" id="q2_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q2_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 3 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Writing and
                                                            grammar</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q3" id="q3_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q3_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 4 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Overall
                                                            logbook content</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q4" id="q4_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q4_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 5 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Checked by
                                                            industrial supervisor from time to time</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q5" id="q5_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q5_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 6 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">6. Ability to
                                                            understand and explain the work scope concept</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q6" id="q6_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q6_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 7 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">7. Ability to
                                                            deliver the task concept clear and appropriate</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q7" id="q7_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q7_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 8 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">8. Ability to
                                                            use self-skills to deliver conclusion in the task
                                                            given</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q8" id="q8_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q8_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-1')">Previous</button>
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-3')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Section 3: Report Evaluation -->
                                            <div id="section-3" class="form-section hidden">
                                                <h3 class="text-xl font-bold mb-4">Section B: Report Evaluation</h3>
                                                <div class="mb-6">
                                                    <!-- Question 1 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Ability to
                                                            independently learn and get new information</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q9" id="q9_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q9_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 2 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Ability to
                                                            find relevant information from different sources</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q10" id="q10_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q10_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 3 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Ability to
                                                            manage and access information</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q11" id="q11_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q11_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 4 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Open to new
                                                            ideas and ability to self-learn or autonomy</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q12" id="q12_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q12_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 5 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Ability to
                                                            produce tasks that benefit the organization and
                                                            community</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q13" id="q13_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q13_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 6 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">6. Generate
                                                            report complies with format, consistent content, and clear
                                                            language</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q14" id="q14_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q14_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-2')">Previous</button>
                                                    <button type="button"
                                                        class="bg-green-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-4')">Next</button>
                                                </div>
                                            </div>

                                            <!-- Section 4: Feedback -->
                                            <div id="section-4" class="form-section hidden">
                                                <h3 class="text-xl font-bold mb-4">Section C: Feedback</h3>
                                                <div class="mb-6">
                                                    <!-- Question 1 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">1. Shows
                                                            commitment for the task given</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q15" id="q15_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q15_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 2 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">2. Understands
                                                            their character to solve issues and problems within the task
                                                            scope</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q16" id="q16_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q16_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 3 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">3. Analyzes and
                                                            makes decisions to solve problems involving ethical
                                                            issues</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q17" id="q17_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q17_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 4 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">4. Ability to
                                                            independently learn and get new information</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q18" id="q18_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q18_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>

                                                    <!-- Question 5 -->
                                                    <div class="flex flex-col md:flex-row md:items-center gap-4 mb-2">
                                                        <label class="text-gray-700 font-medium flex-1">5. Ability to
                                                            find relevant information from different sources</label>
                                                        <div class="flex gap-2">
                                                            <c:forEach var="i" begin="1" end="5">
                                                                <div class="flex items-center">
                                                                    <input type="radio" name="q19" id="q19_${i}"
                                                                        value="${i}" class="rating-input hidden">
                                                                    <label for="q19_${i}"
                                                                        class="w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors">${i}</label>
                                                                </div>
                                                            </c:forEach>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="mt-4 flex justify-between">
                                                    <button type="button"
                                                        class="bg-blue-500 text-white px-4 py-2 rounded"
                                                        onclick="showSection('section-3')">Previous</button>
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
                            'section-3': 2,
                            'section-4': 3
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