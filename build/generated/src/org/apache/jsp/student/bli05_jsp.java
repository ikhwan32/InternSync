package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.internship.model.Student;
import com.internship.controller.DBConnection;
import java.sql.*;

public final class bli05_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/student/import.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/student/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/student/top.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
        int userID;
        Student student = null;
        try {
            Connection conn = DBConnection.dbConnect();
            userID = Integer.parseInt(session.getAttribute("userID").toString());
            String sql = "SELECT * FROM student WHERE userID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userID);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                student = new Student();
                student.setStudentName(rs.getString("studentName"));
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
                student.setGuardianAddress(rs.getString("guardianAddress"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        }
    
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>BLI05 Form - Internship Management System</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Inter', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.active .stepper-circle {\r\n");
      out.write("            background-color: #3b82f6; /* Blue background for active step */\r\n");
      out.write("            border-color: #3b82f6;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.completed .stepper-circle {\r\n");
      out.write("            background-color: #3b82f6; /* Blue background for completed steps */\r\n");
      out.write("            border-color: #3b82f6;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.active .stepper-label {\r\n");
      out.write("            color: #3b82f6; /* Blue text for active step */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.completed .stepper-label {\r\n");
      out.write("            color: #3b82f6; /* Blue text for completed steps */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-gray-50\">\r\n");
      out.write("    <div class=\"min-h-screen flex\">\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        ");
      out.write("<div class=\"w-64 bg-white shadow-sm border-r\">\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <div class=\"h-16 flex items-center px-6 border-b\">\r\n");
      out.write("        <span class=\"text-xl font-bold text-gray-800\">IMS Portal</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Profile Section -->\r\n");
      out.write("    <div class=\"p-4 border-b\">\r\n");
      out.write("        <div class=\"flex items-center gap-3\">\r\n");
      out.write("            <div class=\"w-10 h-10 rounded-full bg-gray-100 flex items-center justify-center\">\r\n");
      out.write("                <span class=\"text-sm font-medium text-gray-600\">MH</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"text-sm font-medium text-gray-900\">Muhammad Ikhwan</div>\r\n");
      out.write("                <div class=\"text-xs text-gray-500\">Student</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Navigation -->\r\n");
      out.write("    <nav class=\"p-4\">\r\n");
      out.write("        <div class=\"space-y-1\">\r\n");
      out.write("            <!-- Dashboard Link -->\r\n");
      out.write("            <a href=\"dashboard.jsp\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'dashboard' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M3 12l2-2m0 0l7-7 7 7M5 10v10a1 1 0 001 1h3m10-11l2 2m-2-2v10a1 1 0 01-1 1h-3m-6 0a1 1 0 001-1v-4a1 1 0 011-1h2a1 1 0 011 1v4a1 1 0 001 1m-6 0h6\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Dashboard\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- BLI Forms Link -->\r\n");
      out.write("            <a href=\"#\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'bliForms' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                BLI Forms\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Attendance Link -->\r\n");
      out.write("            <a href=\"#\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'attendance' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M8 7V3m8 4V3m-9 8h10M5 21h14a2 2 0 002-2V7a2 2 0 00-2-2H5a2 2 0 00-2 2v12a2 2 0 002 2z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Attendance\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Reports Link -->\r\n");
      out.write("            <a href=\"#\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'reports' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M9 5H7a2 2 0 00-2 2v12a2 2 0 002 2h10a2 2 0 002-2V7a2 2 0 00-2-2h-2M9 5a2 2 0 002 2h2a2 2 0 002-2M9 5a2 2 0 012-2h2a2 2 0 012 2\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Reports\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Settings Link -->\r\n");
      out.write("            <a href=\"settings.jsp\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'settings' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M15 12a3 3 0 11-6 0 3 3 0 016 0z\"></path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Settings\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Content -->\r\n");
      out.write("        <div class=\"flex-1\">\r\n");
      out.write("            <!-- Top bar -->\r\n");
      out.write("            ");
      out.write("<div class=\"h-16 bg-white shadow-sm border-b flex items-center justify-between px-8\">\r\n");
      out.write("    <!-- Page Title -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"text-lg font-medium\">\r\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty pageNames[page] ? pageNames[page] : 'Page Not Found'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("    <!-- Buttons -->\r\n");
      out.write("    <div class=\"flex items-center gap-4\">\r\n");
      out.write("        <button class=\"p-1.5 rounded-full text-gray-600 hover:bg-gray-100\">\r\n");
      out.write("            <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                    d=\"M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9\">\r\n");
      out.write("                </path>\r\n");
      out.write("            </svg>\r\n");
      out.write("        </button>\r\n");
      out.write("        <button class=\"p-1.5 rounded-full text-gray-600 hover:bg-gray-100\">\r\n");
      out.write("            <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                    d=\"M12 5v.01M12 12v.01M12 19v.01M12 6a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2zm0 7a1 1 0 110-2 1 1 0 010 2z\">\r\n");
      out.write("                </path>\r\n");
      out.write("            </svg>\r\n");
      out.write("        </button>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Content -->\r\n");
      out.write("            <div class=\"p-8\">\r\n");
      out.write("                <!-- Welcome Section -->\r\n");
      out.write("                <div class=\"mb-8\">\r\n");
      out.write("                    <h2 class=\"text-2xl font-bold text-gray-900\">Welcome back, Muhammad!</h2>\r\n");
      out.write("                    <p class=\"text-gray-600 mt-1\">Manage your account settings and set relevant preferences.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Stepper -->\r\n");
      out.write("                <div class=\"flex justify-between items-center mb-8\">\r\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item active\" onclick=\"showSection('section-b')\">\r\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white\">\r\n");
      out.write("                            1\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"mt-2 stepper-label text-blue-500\">Section B</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"w-full border-t-2 border-gray-300 mx-4\"></div>\r\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item\" onclick=\"showSection('section-c')\">\r\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500\">\r\n");
      out.write("                            2\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"mt-2 stepper-label text-gray-500\">Section C</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"w-full border-t-2 border-gray-300 mx-4\"></div>\r\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item\" onclick=\"showSection('section-d')\">\r\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500\">\r\n");
      out.write("                            3\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"mt-2 stepper-label text-gray-500\">Section D</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"w-full border-t-2 border-gray-300 mx-4\"></div>\r\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item\" onclick=\"showSection('section-e')\">\r\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500\">\r\n");
      out.write("                            4\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p class=\"mt-2 stepper-label text-gray-500\">Section E</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Form Sections -->\r\n");
      out.write("                <div class=\"bg-white rounded-xl shadow-sm p-6\">\r\n");
      out.write("                    <form action=\"../bli05Submit.do\" method=\"POST\">\r\n");
      out.write("                        <!-- Section B -->\r\n");
      out.write("                        <div id=\"section-b\" class=\"form-section\">\r\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section B: Company's Expectations</h3>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <label class=\"block text-gray-700\">1. Effectiveness in Communication</label>\r\n");
      out.write("                                <select class=\"w-full p-2 border rounded\">\r\n");
      out.write("                                    <option value=\"1\">1</option>\r\n");
      out.write("                                    <option value=\"2\">2</option>\r\n");
      out.write("                                    <option value=\"3\">3</option>\r\n");
      out.write("                                    <option value=\"4\">4</option>\r\n");
      out.write("                                    <option value=\"5\">5</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Add more fields as needed -->\r\n");
      out.write("                            <div class=\"mt-4 flex justify-end\">\r\n");
      out.write("                                <button type=\"button\" class=\"bg-green-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-c')\">Next</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Section C -->\r\n");
      out.write("                        <div id=\"section-c\" class=\"form-section hidden\">\r\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section C: Company's Observation</h3>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <label class=\"block text-gray-700\">1. Co-operation with co-workers, supervisors and subordinates</label>\r\n");
      out.write("                                <select class=\"w-full p-2 border rounded\">\r\n");
      out.write("                                    <option value=\"1\">1</option>\r\n");
      out.write("                                    <option value=\"2\">2</option>\r\n");
      out.write("                                    <option value=\"3\">3</option>\r\n");
      out.write("                                    <option value=\"4\">4</option>\r\n");
      out.write("                                    <option value=\"5\">5</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Add more fields as needed -->\r\n");
      out.write("                            <div class=\"mt-4 flex justify-between\">\r\n");
      out.write("                                <button type=\"button\" class=\"bg-blue-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-b')\">Previous</button>\r\n");
      out.write("                                <button type=\"button\" class=\"bg-green-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-d')\">Next</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Section D -->\r\n");
      out.write("                        <div id=\"section-d\" class=\"form-section hidden\">\r\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section D: Adequacy of University's Curriculum</h3>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <label class=\"block text-gray-700\">A. Intern is given task related to their area of education</label>\r\n");
      out.write("                                <select class=\"w-full p-2 border rounded\">\r\n");
      out.write("                                    <option value=\"1\">1</option>\r\n");
      out.write("                                    <option value=\"2\">2</option>\r\n");
      out.write("                                    <option value=\"3\">3</option>\r\n");
      out.write("                                    <option value=\"4\">4</option>\r\n");
      out.write("                                    <option value=\"5\">5</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Add more fields as needed -->\r\n");
      out.write("                            <div class=\"mt-4 flex justify-between\">\r\n");
      out.write("                                <button type=\"button\" class=\"bg-blue-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-c')\">Previous</button>\r\n");
      out.write("                                <button type=\"button\" class=\"bg-green-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-e')\">Next</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Section E -->\r\n");
      out.write("                        <div id=\"section-e\" class=\"form-section hidden\">\r\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section E: Final Evaluation</h3>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <label class=\"block text-gray-700\">State any weakness of the intern and suggest a way to improve intern's capability:</label>\r\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" placeholder=\"Enter weakness\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Add more fields as needed -->\r\n");
      out.write("                            <div class=\"mt-4 flex justify-between\">\r\n");
      out.write("                                <button type=\"button\" class=\"bg-blue-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-d')\">Previous</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"bg-green-500 text-white px-4 py-2 rounded\">Submit</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // Function to show a specific section and update the stepper\r\n");
      out.write("        function showSection(sectionId) {\r\n");
      out.write("            // Hide all sections\r\n");
      out.write("            document.querySelectorAll('.form-section').forEach(section => {\r\n");
      out.write("                section.classList.add('hidden');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // Show the selected section\r\n");
      out.write("            document.getElementById(sectionId).classList.remove('hidden');\r\n");
      out.write("\r\n");
      out.write("            // Update the stepper\r\n");
      out.write("            updateStepper(sectionId);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Function to update the stepper\r\n");
      out.write("        function updateStepper(sectionId) {\r\n");
      out.write("            const stepperItems = document.querySelectorAll('.stepper-item');\r\n");
      out.write("\r\n");
      out.write("            // Map section IDs to their step indexes\r\n");
      out.write("            const sectionToStepIndex = {\r\n");
      out.write("                'section-b': 0,\r\n");
      out.write("                'section-c': 1,\r\n");
      out.write("                'section-d': 2,\r\n");
      out.write("                'section-e': 3\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            // Get the current step index\r\n");
      out.write("            const currentStepIndex = sectionToStepIndex[sectionId];\r\n");
      out.write("\r\n");
      out.write("            stepperItems.forEach((item, index) => {\r\n");
      out.write("                item.classList.remove('active', 'completed');\r\n");
      out.write("\r\n");
      out.write("                if (index < currentStepIndex) {\r\n");
      out.write("                    item.classList.add('completed'); // Mark previous steps as completed\r\n");
      out.write("                } else if (index === currentStepIndex) {\r\n");
      out.write("                    item.classList.add('active'); // Mark the current step as active\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Initialize the form with the first section\r\n");
      out.write("        showSection('section-b');\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("pageNames");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${{\r\n    'dashboard': 'Dashboard',\r\n    'bliForms': 'BLI Forms',\r\n    'bli04': 'BLI 04 : Student Self-report Verification',\r\n    'bli07': 'BLI 07 : Student Evaluation',\r\n    'attendance': 'Attendance',\r\n    'reports': 'Reports',\r\n    'settings': 'Settings'\r\n}}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
