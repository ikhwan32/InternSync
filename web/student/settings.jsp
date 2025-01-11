<%-- Document : settings Created on : Jan 3, 2025, 4:02:23 AM Author : myPC --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ page import="com.internship.model.Student" %>
                <%@ page import="com.internship.controller.DBConnection" %>
                    <%@ page import="java.sql.*" %>
                        <% Student student=null; try { Connection conn=DBConnection.dbConnect(); int
                            userID=Integer.parseInt(session.getAttribute("userID").toString()); String
                            sql="SELECT * FROM student WHERE userID = ?" ; PreparedStatement
                            stmt=conn.prepareStatement(sql); stmt.setInt(1, userID); ResultSet rs=stmt.executeQuery();
                            if(rs.next()) { student=new Student(); student.setStudentName(rs.getString("studentName"));
                            student.setStudentIC(rs.getString("studentIC"));
                            student.setStudentMatric(rs.getString("studentMatric"));
                            student.setStudentAddress(rs.getString("studentAddress"));
                            student.setStudentProgramme(rs.getString("studentCourse"));
                            student.setStudentSemester(rs.getString("studentPart"));
                            student.setAcademicAdvisor(rs.getString("academicAdvisor"));
                            student.setStudentCGPA(rs.getFloat("studentCGPA"));
                            student.setStudentEmail(rs.getString("studentEmail"));
                            student.setLetterAddress(rs.getString("studentHomeAddress"));
                            student.setGuardianName(rs.getString("guardianName"));
                            student.setGuardianRelation(rs.getString("guardianRelation"));
                            student.setGuardianPhone(rs.getString("guardianPhone"));
                            student.setGuardianAddress(rs.getString("guardianAddress")); } rs.close(); stmt.close();
                            conn.close(); } catch(Exception e) { out.println("Error: " + e.getMessage());
        }
    %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv=" Content-Type" content="text/html; charset=UTF-8">
                            <title>Student Settings - Internship Management System</title>
                            <script src="https://cdn.tailwindcss.com"></script>
                            <link
                                href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap"
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
        <c:set var="page" value="settings" scope="request" />
        <%@ include file="/WEB-INF/jspf/student/sidebar.jspf" %>

        <!-- Main Content -->
        <div class="flex-1">
            <!-- Top bar -->
            <c:set var="pageName" value="settings" scope="request" />
            <%@ include file="/WEB-INF/jspf/student/top.jspf" %>

                                        <!-- Page Content -->
                                        <div class="p-8">

                                            <!-- Welcome Section -->
                                            <div class="mb-8">
                                                <h2 class="text-2xl font-bold text-gray-900">Welcome back, Muhammad!
                                                </h2>
                                                <p class="text-gray-600 mt-1">Manage your account settings and update
                                                    relevant informations .</p>
                                            </div>

                                            <div class="bg-white rounded-xl shadow-sm p-6">
                                                <!-- Tabs Navigation -->
                                                <div class="border-b">
                                                    <div class="flex space-x-8 px-8">
                                                        <button type="button" onclick="switchTab('personal')"
                                                            class="tab-button py-4 text-sm font-medium border-b-2 border-blue-500 text-blue-600"
                                                            id="personal-tab">
                                                            Personal Information
                                                        </button>
                                                        <button type="button" onclick="switchTab('academic')"
                                                            class="tab-button py-4 text-sm font-medium border-b-2 border-transparent text-gray-500 hover:text-gray-700"
                                                            id="academic-tab">
                                                            Academic Information
                                                        </button>
                                                        <button type="button" onclick="switchTab('guardian')"
                                                            class="tab-button py-4 text-sm font-medium border-b-2 border-transparent text-gray-500 hover:text-gray-700"
                                                            id="guardian-tab">
                                                            Guardian Information
                                                        </button>
                                                    </div>
                                                </div>

                                                <form action="../saveProfileServlet.do" method="POST"
                                                    class="space-y-6 p-8">
                                                    <!-- Personal Information Tab -->
                                                    <div id="personal-content" class="tab-content">
                                                        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Full
                                                                    Name</label>
                                                                <input type="text" name="studentName"
                                                                    value="<%= student != null ? student.getStudentName() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">IC
                                                                    Number</label>
                                                                <input type="text" name="studentIC"
                                                                    value="<%= student != null ? student.getStudentIC() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                        </div>
                                                        <div class="mt-6">
                                                            <label
                                                                class="block text-sm font-medium text-gray-700 mb-2">Address</label>
                                                            <textarea name="studentAddress"
                                                                class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500 h-24"><%= student != null ? student.getStudentAddress() : "" %></textarea>
                                                        </div>
                                                        <div class="mt-6">
                                                            <label
                                                                class="block text-sm font-medium text-gray-700 mb-2">Letter
                                                                Address</label>
                                                            <textarea name="letterAddress"
                                                                class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500 h-24"><%= student != null ? student.getLetterAddress() : "" %></textarea>
                                                        </div>
                                                    </div>

                                                    <!-- Academic Information Tab -->
                                                    <div id="academic-content" class="tab-content hidden">
                                                        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Student
                                                                    Email</label>
                                                                <input type="email" name="studentEmail"
                                                                    value="<%= student != null ? student.getStudentEmail() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Academic
                                                                    Advisor</label>
                                                                <input type="text" name="academicAdvisor"
                                                                    value="<%= student != null ? student.getAcademicAdvisor() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                        </div>
                                                        <div class="grid grid-cols-1 md:grid-cols-2 gap-6 mt-6">
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Matric
                                                                    Number</label>
                                                                <input type="text" name="studentMatric"
                                                                    value="<%= student != null ? student.getStudentMatric() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Latest
                                                                    CGPA</label>
                                                                <input type="text" name="studentCGPA"
                                                                    value="<%= student != null ? student.getStudentCGPA() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                        </div>
                                                        <div class="grid grid-cols-1 md:grid-cols-2 gap-6 mt-6">
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Semester</label>
                                                                <input type="text" name="studentSemester"
                                                                    value="<%= student != null ? student.getStudentSemester() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Course
                                                                    Code</label>
                                                                <input type="text" name="studentProgramme"
                                                                    value="<%= student != null ? student.getStudentProgramme() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <!-- Guardian Information Tab -->
                                                    <div id="guardian-content" class="tab-content hidden">
                                                        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Guardian
                                                                    Name</label>
                                                                <input type="text" name="guardianName"
                                                                    value="<%= student != null ? student.getGuardianName() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                            <div>
                                                                <label
                                                                    class="block text-sm font-medium text-gray-700 mb-2">Guardian
                                                                    Phone</label>
                                                                <input type="text" name="guardianPhone"
                                                                    value="<%= student != null ? student.getGuardianPhone() : "" %>"
                                                                    class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                            </div>
                                                        </div>
                                                        <div class="mt-6">
                                                            <label
                                                                class="block text-sm font-medium text-gray-700 mb-2">Guardian
                                                                Relationship</label>
                                                            <select name="guardianRelationship"
                                                                class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500">
                                                                <option value="Parent" <%=student !=null &&
                                                                    student.getGuardianRelation().equals("Parent")
                                                                    ? "selected" : "" %>>Parent</option>
                                                                <option value="Guardian" <%=student !=null &&
                                                                    student.getGuardianRelation().equals("Guardian")
                                                                    ? "selected" : "" %>>Guardian</option>
                                                            </select>
                                                        </div>
                                                        <div class="mt-6">
                                                            <label
                                                                class="block text-sm font-medium text-gray-700 mb-2">Guardian
                                                                Address</label>
                                                            <textarea name="guardianAddress"
                                                                class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-indigo-500 h-24"><%= student != null ? student.getGuardianAddress() : "" %></textarea>
                                                        </div>
                                                    </div>

                                                    <!-- Action Buttons -->
                                                    <div class="border-t pt-6 mt-6 space-y-4">
                                                        <div class="grid grid-cols-2 gap-4">
                                                            <a href="dashboard.jsp"
                                                                class="px-6 py-2 bg-blue-500 text-white rounded-lg hover:bg-blue-600 text-center">Back</a>
                                                            <button type="submit"
                                                                class="px-6 py-2 bg-green-500 text-white rounded-lg hover:bg-green-600">Save
                                                                Changes</button>
                                                        </div>
                                                        <div class="grid grid-cols-2 gap-4">
                                                            <a href="../Logout.do"
                                                                class="px-6 py-2 bg-red-500 text-white rounded-lg hover:bg-red-600 text-center">Log
                                                                Out</a>
                                                            <button type="button"
                                                                class="px-6 py-2 bg-green-500 text-white rounded-lg hover:bg-green-600">Upload
                                                                Image</button>
                                                        </div>
                                                    </div>
                                                </form>

                                            </div>

                                            <!-- Rest of your content... -->
                                        </div>
                                    </div>
                                </div>
                                <script>
                                    document.addEventListener('DOMContentLoaded', function () {
                                        // Initial setup
                                        switchTab('personal');
                                    });

                                    function switchTab(tabName) {
                                        // Hide all tab contents
                                        document.querySelectorAll('.tab-content').forEach(function (content) {
                                            content.classList.add('hidden');
                                        });

                                        // Show the selected tab content
                                        document.getElementById(tabName + '-content').classList.remove('hidden');

                                        // Update tab button styles
                                        document.querySelectorAll('.tab-button').forEach(function (button) {
                                            button.classList.remove('border-blue-500', 'text-blue-600');
                                            button.classList.add('border-transparent', 'text-gray-500');
                                        });

                                        // Highlight active tab
                                        document.getElementById(tabName + '-tab').classList.remove('border-transparent', 'text-gray-500');
                                        document.getElementById(tabName + '-tab').classList.add('border-blue-500', 'text-blue-600');
                                    }
                                </script>
                            </body>

                            </html>