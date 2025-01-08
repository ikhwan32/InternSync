<%-- 
    Document   : bli04
    Created on : Dec 14, 2024, 10:52:03 PM
    Author     : myPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jspf/student/import.jspf" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BLI04 - Internship Management System</title>
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
        <c:set var="page" value="bliForms" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="page" value="bli04" scope="request" />
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

            <!-- Page Content -->
            <div class="p-8">


                <!-- BLI04 Form -->
                <div class="bg-white rounded-xl shadow-sm p-6">
          

                    <!-- Date Section -->
                    <div class="mb-3">
                        <p class="text-gray-700">Tarikh: <%= new SimpleDateFormat("dd/MM/yyyy").format(new Date()) %></p>
                    </div>

                    <!-- Address Section -->
                    <div class="mb-4">
                        <p class="text-gray-700">
                            Penyelia Latihan Industri (Program CS230/CS244),<br>
                            Fakulti Sains Komputer dan Matematik,<br>
                            Universiti Teknologi MARA (Terengganu) Kampus Kuala Terengganu,<br>
                            21080 Kuala Terengganu,<br>
                            Terengganu
                        </p>
                    </div>

                    <!-- Greeting Section -->
                    <div class="mb-3">
                        <p class="text-gray-700">(u.p.: Pn. Norizan Mohamad)</p>
                        <p class="text-gray-700">Puan,</p>
                    </div>

                    <!-- Main Content Section -->
                    <div class="mb-4">
                        <h5 class="text-uppercase font-bold mb-3">Pengesahan Melapor Diri Pelajar Latihan Industri Di Organisasi</h5>
                        <p class="text-gray-700">Perkara di atas adalah dirujuk.</p>
                    </div>

                    <!-- Form Section -->
                    <form action="../bli04Submit.do" method="POST">
                        <div class="mb-4">
                            <p class="text-gray-700">2. Sukacita dimaklumkan dengan ini kami mengesahkan bahawa pelajar di bawah</p>
                            
                            <!-- Student Details -->
                            <div class="space-y-4 ml-8">
                                <div class="grid grid-cols-2 gap-4">
                                    <label for="name" class="text-gray-700">Nama Pelajar</label>
                                    <input type="text" class="w-full p-2 border rounded" id="name" value="<%= student.getStudentName() %>">
                                </div>
                                <div class="grid grid-cols-2 gap-4">
                                    <label for="program" class="text-gray-700">Program</label>
                                    <input type="text" class="w-full p-2 border rounded" id="program" value="<%= student.getStudentProgramme() %>">
                                </div>
                                <div class="grid grid-cols-2 gap-4">
                                    <label for="studentID" class="text-gray-700">No. Pelajar</label>
                                    <input type="text" class="w-full p-2 border rounded" id="studentID" value="<%= student.getStudentMatric() %>">
                                </div>
                                <div class="grid grid-cols-2 gap-4">
                                    <label for="IC" class="text-gray-700">No. K/P</label>
                                    <input type="text" class="w-full p-2 border rounded" id="IC" value="<%= student.getStudentIC() %>">
                                </div>
                                <div class="grid grid-cols-2 gap-4">
                                    <label for="duration" class="text-gray-700">Tempoh Latihan</label>
                                    <input type="text" class="w-full p-2 border rounded" id="duration" value="6 Bulan">
                                </div>
                            </div>
                        </div>

                        <!-- Confirmation Section -->
                        <div class="mb-4">
                            <p class="text-gray-700">telah hadir melapor diri bagi maksud menjalani latihan industri pada tarikh</p>
                            <p class="text-gray-700">3. Sehubungan itu sebagaimana dikehendaki, dikemukakan maklumat ini untuk simpanan pihak tuan.</p>
                        </div>

                        <!-- Closing Section -->
                        <div class="mb-4">
                            <p class="text-gray-700">Sekian, terima kasih</p>
                            <p class="text-gray-700">Yang benar</p>
                        </div>

                        <!-- Signature Section -->
                        <div class="mb-4">
                            <div class="border p-4 mb-3 h-24"></div>
                            <div class="grid grid-cols-2 gap-4">
                                <p class="text-gray-700">Nama penyelia:</p>
                                <p class="text-gray-700">Cop Jawatan dan organisasi:</p>
                            </div>
                        </div>

                        <!-- Buttons -->
                        <div class="grid grid-cols-2 gap-4 mt-4">
                            <button class="bg-blue-500 text-white p-2 rounded">Back</button>
                            <button type="submit" class="bg-green-500 text-white p-2 rounded">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>