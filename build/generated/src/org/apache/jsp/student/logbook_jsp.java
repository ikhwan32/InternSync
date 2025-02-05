package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.internship.model.Student;
import com.internship.controller.DBConnection;
import java.sql.*;

public final class logbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/auth/auth.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/student/import.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/student/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/student/top.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write('\r');
      out.write('\n');

    // Check if user is logged in
    if (session.getAttribute("username") == null) {
        session.setAttribute("error", "Please login to access this page");
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }
    
    // Check if user type matches the required type
    String userType = (String) session.getAttribute("userType");
    String currentPage = request.getRequestURI();
    
    boolean isAuthorized = false;
    
    if (currentPage.contains("/student/") && "student".equalsIgnoreCase(userType)) {
        isAuthorized = true;
    } else if (currentPage.contains("/admin/") && "admin".equalsIgnoreCase(userType)) {
        isAuthorized = true;
    } else if (currentPage.contains("/company/") && "company".equalsIgnoreCase(userType)) {
        isAuthorized = true;
    } else if (currentPage.contains("/university/") && "university".equalsIgnoreCase(userType)) {
        isAuthorized = true;
    }
    
    if (!isAuthorized) {
        session.setAttribute("error", "You are not authorized to access this page");
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
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
      out.write('\r');
      out.write('\n');
 
    userID = Integer.parseInt(session.getAttribute("userID").toString());
    request.setAttribute("userID", userID); // Make userID available to JSTL

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Attendance - Student Dashboard</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Inter', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-gray-50\">\r\n");
      out.write("<div class=\"min-h-screen flex\">\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
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
      out.write("            <!-- Attendance Link -->\r\n");
      out.write("            <a href=\"attendance.jsp\"\r\n");
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
      out.write("    <div class=\"flex-1\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      out.write("<div class=\"h-16 bg-white shadow-sm border-b flex items-center justify-between px-8\">\r\n");
      out.write("    <!-- Page Title -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
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
      out.write("        <div class=\"p-8\">\r\n");
      out.write("            <div class=\"bg-white rounded-xl shadow-sm p-6\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <form id=\"attendanceForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isUpdate ? 'updateLog.do' : '../submitLog.do'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"userID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-6\">\r\n");
      out.write("                        <label class=\"block text-sm font-medium text-gray-700 mb-2\">Date</label>\r\n");
      out.write("                        <input type=\"text\" name=\"attendanceDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Attendance Status -->\r\n");
      out.write("                    <div class=\"mb-6\">\r\n");
      out.write("                        <label class=\"block text-sm font-medium text-gray-700 mb-2\">Attendance Status</label>\r\n");
      out.write("                        <select name=\"attendanceStatus\" id=\"attendanceStatus\" class=\"w-full p-2 border border-gray-300 rounded-lg\">\r\n");
      out.write("                            <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${attendanceStatus == 1 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Present</option>\r\n");
      out.write("                            <option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${attendanceStatus == 0 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Absent</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Supporting Document -->\r\n");
      out.write("                    <div class=\"mb-6\">\r\n");
      out.write("                        <label class=\"block text-sm font-medium text-gray-700 mb-2\">Supporting Document For Being Absent</label>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <input type=\"file\" name=\"supportingDocument\" id=\"supportingDocument\"\r\n");
      out.write("                               class=\"w-full p-2 border border-gray-300 rounded-lg\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty attendFile ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Logbook Entry -->\r\n");
      out.write("                    <div class=\"mb-8\">\r\n");
      out.write("                        <h3 class=\"text-xl font-semibold text-gray-900 mb-4\">Logbook Entries</h3>\r\n");
      out.write("                        <div class=\"space-y-4\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <label class=\"block text-sm font-medium text-gray-700\">Logbook Entry</label>\r\n");
      out.write("                                <textarea name=\"logbookEntry\" id=\"logbookEntry\"\r\n");
      out.write("                                          class=\"mt-1 block w-full p-2 border border-gray-300 rounded-md\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logbookEntry}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <label class=\"block text-sm font-medium text-gray-700\">Supporting Document</label>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <input type=\"file\" name=\"logbookFile\" id=\"logbookFile\"\r\n");
      out.write("                                       class=\"mt-1 block w-full p-2 border border-gray-300 rounded-md\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty logbookFile ? 'disabled' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Submit Button -->\r\n");
      out.write("                    <button type=\"submit\" id=\"submitButton\"\r\n");
      out.write("                            class=\"w-full bg-blue-600 text-white py-2 px-4 rounded-lg hover:bg-blue-700 transition duration-200\">\r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isUpdate ? 'Update Attendance' : 'Submit Attendance'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // JavaScript to enable/disable file input based on checkbox (Optional)\r\n");
      out.write("    const replaceAttendFileCheckbox = document.querySelector('input[name=\"replaceAttendFile\"]');\r\n");
      out.write("    const supportingDocumentInput = document.getElementById('supportingDocument');\r\n");
      out.write("    if (replaceAttendFileCheckbox) {\r\n");
      out.write("        replaceAttendFileCheckbox.addEventListener('change', () => {\r\n");
      out.write("            supportingDocumentInput.disabled = !replaceAttendFileCheckbox.checked;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    const replaceLogbookFileCheckbox = document.querySelector('input[name=\"replaceLogbookFile\"]');\r\n");
      out.write("    const logbookFileInput = document.getElementById('logbookFile');\r\n");
      out.write("    if (replaceLogbookFileCheckbox) {\r\n");
      out.write("        replaceLogbookFileCheckbox.addEventListener('change', () => {\r\n");
      out.write("            logbookFileInput.disabled = !replaceLogbookFileCheckbox.checked;\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_c_set_0.setVar("page");
    _jspx_th_c_set_0.setValue(new String("attendance"));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("pageName");
    _jspx_th_c_set_1.setValue(new String("attendance"));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("pageNames");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${{\r\n    'dashboard': 'Dashboard',\r\n    'bliForms': 'BLI Forms',\r\n    'bli04': 'BLI 04 : Student Self-report Verification',\r\n    'bli07': 'BLI 07 : Student Evaluation',\r\n    'attendance': 'Attendance',\r\n    'reports': 'Reports',\r\n    'settings': 'Settings'\r\n}}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("request");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param.date}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (true) {
          _jspx_page_context.forward("checkLogbookServlet" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("date", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.date}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("userID", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()));
          return true;
        }
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isUpdate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <input type=\"hidden\" name=\"operation\" value=\"update\">\r\n");
        out.write("                        <input type=\"hidden\" name=\"logBookID\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logBookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty attendFile}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <div id=\"existingAttendFile\" class=\"mb-2\">\r\n");
        out.write("                                <p class=\"text-sm text-gray-600\">Current file: <span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${attendFile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\r\n");
        out.write("                                <label>\r\n");
        out.write("                                    <input type=\"checkbox\" name=\"replaceAttendFile\" value=\"true\"> Replace file?\r\n");
        out.write("                                </label>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty logbookFile}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div id=\"existingLogbookFile\" class=\"mb-2\">\r\n");
        out.write("                                        <p class=\"text-sm text-gray-600\">Current file: <span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logbookFile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\r\n");
        out.write("                                        <label>\r\n");
        out.write("                                            <input type=\"checkbox\" name=\"replaceLogbookFile\" value=\"true\"> Replace file?\r\n");
        out.write("                                        </label>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
