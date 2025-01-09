package org.apache.jsp.lecturer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.internship.model.User;
import com.internship.controller.DBConnection;
import java.sql.*;

public final class BLI08_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/lecturer/import.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/supervisor/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/supervisor/top.jspf");
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

      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>BLI08 Form - Internship Management System</title>\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Inter', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .stepper-item.active .stepper-circle {\n");
      out.write("            background-color: #3b82f6;\n");
      out.write("            border-color: #3b82f6;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .stepper-item.completed .stepper-circle {\n");
      out.write("            background-color: #3b82f6;\n");
      out.write("            border-color: #3b82f6;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .stepper-item.active .stepper-label {\n");
      out.write("            color: #3b82f6;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .stepper-item.completed .stepper-label {\n");
      out.write("            color: #3b82f6;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .rating-input:checked+label {\n");
      out.write("            background-color: #3b82f6;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-gray-50\">\n");
      out.write("    <div class=\"min-h-screen flex\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                <div class=\"text-sm font-medium text-gray-900\">Muhammad</div>\r\n");
      out.write("                <div class=\"text-xs text-gray-500\">Supervisor</div>\r\n");
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
      out.write("            <a href=\"task.jsp\"\r\n");
      out.write("                class=\"flex items-center gap-3 px-3 py-2 text-sm font-medium rounded-md \r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page == 'task' ? 'text-white bg-indigo-600' : 'text-gray-600 hover:bg-gray-50'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <svg class=\"w-5 h-5\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\"\r\n");
      out.write("                        d=\"M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z\">\r\n");
      out.write("                    </path>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Task\r\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"flex-1\">\n");
      out.write("            <!-- Top bar -->\n");
      out.write("            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
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
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div class=\"p-8\">\n");
      out.write("                <!-- Stepper -->\n");
      out.write("                <div class=\"flex justify-between items-center mb-8\">\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item active\" onclick=\"showSection('section-1')\">\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-blue-500 bg-blue-500 text-white\">1</div>\n");
      out.write("                        <p class=\"mt-2 stepper-label text-blue-500\">Section 1</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w-full border-t-2 border-gray-300 mx-4\"></div>\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item\" onclick=\"showSection('section-2')\">\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500\">2</div>\n");
      out.write("                        <p class=\"mt-2 stepper-label text-gray-500\">Section 2</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w-full border-t-2 border-gray-300 mx-4\"></div>\n");
      out.write("                    <div class=\"flex-1 text-center cursor-pointer stepper-item\" onclick=\"showSection('section-3')\">\n");
      out.write("                        <div class=\"stepper-circle flex items-center justify-center w-10 h-10 mx-auto rounded-full border-2 border-gray-300 bg-white text-gray-500\">3</div>\n");
      out.write("                        <p class=\"mt-2 stepper-label text-gray-500\">Section 3</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Form Sections -->\n");
      out.write("                <div class=\"bg-white rounded-xl shadow-sm p-6\">\n");
      out.write("                    <form action=\"submitBLI08.do\" method=\"POST\">\n");
      out.write("                        <!-- Section 1 -->\n");
      out.write("                        <div id=\"section-1\" class=\"form-section\">\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">BLI 08 - Academic Supervisor Evaluation Form</h3>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Student Name:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"name\" placeholder=\"Student Name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Matric Number:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"matricNum\" placeholder=\"Matric Number\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Programme:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"programme\" placeholder=\"Programme\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Phone Number:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"phoneNum\" placeholder=\"Phone Number\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Industrial Training Period:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"LiDuration\" placeholder=\"Industrial Training Period\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Start Date:</label>\n");
      out.write("                                <input type=\"date\" class=\"w-full p-2 border rounded\" name=\"startDate\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">End Date:</label>\n");
      out.write("                                <input type=\"date\" class=\"w-full p-2 border rounded\" name=\"endDate\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Organization Supervisor Name:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"svName\" placeholder=\"Supervisor's Name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Organization Name and Address:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"compNameAddress\" placeholder=\"Organization Name and Address\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Office Phone Number:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"compPhone\" placeholder=\"Office Phone Number\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Academic Supervisor Name:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"lectName\" placeholder=\"Academic Supervisor Name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <label class=\"block text-gray-700\">Office Phone Number:</label>\n");
      out.write("                                <input type=\"text\" class=\"w-full p-2 border rounded\" name=\"lectPhone\" placeholder=\"Office Phone Number\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mt-4 flex justify-end\">\n");
      out.write("                                <button type=\"button\" class=\"bg-green-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-2')\">Next</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Section 2 -->\n");
      out.write("                        <div id=\"section-2\" class=\"form-section hidden\">\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section A: Logbook Evaluation</h3>\n");
      out.write("                            <div class=\"mb-6\">\n");
      out.write("                                <!-- Logbook Evaluation Questions -->\n");
      out.write("                                <div class=\"flex flex-col md:flex-row md:items-center gap-4 mb-2\">\n");
      out.write("                                    <label class=\"text-gray-700 font-medium flex-1\">1. Logbook internal notes tidiness</label>\n");
      out.write("                                    <div class=\"flex gap-2\">\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q1\" id=\"q1_1\" value=\"1\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q1_1\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">1</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q1\" id=\"q1_2\" value=\"2\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q1_2\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">2</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q1\" id=\"q1_3\" value=\"3\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q1_3\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">3</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q1\" id=\"q1_4\" value=\"4\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q1_4\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">4</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q1\" id=\"q1_5\" value=\"5\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q1_5\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">5</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Repeat for other questions -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mt-4 flex justify-between\">\n");
      out.write("                                <button type=\"button\" class=\"bg-blue-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-1')\">Previous</button>\n");
      out.write("                                <button type=\"button\" class=\"bg-green-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-3')\">Next</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Section 3 -->\n");
      out.write("                        <div id=\"section-3\" class=\"form-section hidden\">\n");
      out.write("                            <h3 class=\"text-xl font-bold mb-4\">Section B: Report Evaluation</h3>\n");
      out.write("                            <div class=\"mb-6\">\n");
      out.write("                                <!-- Report Evaluation Questions -->\n");
      out.write("                                <div class=\"flex flex-col md:flex-row md:items-center gap-4 mb-2\">\n");
      out.write("                                    <label class=\"text-gray-700 font-medium flex-1\">1. Ability to independently learn and get new information</label>\n");
      out.write("                                    <div class=\"flex gap-2\">\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q11\" id=\"q11_1\" value=\"1\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q11_1\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">1</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q11\" id=\"q11_2\" value=\"2\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q11_2\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">2</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q11\" id=\"q11_3\" value=\"3\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q11_3\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">3</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q11\" id=\"q11_4\" value=\"4\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q11_4\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">4</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex items-center\">\n");
      out.write("                                            <input type=\"radio\" name=\"q11\" id=\"q11_5\" value=\"5\" class=\"rating-input hidden\">\n");
      out.write("                                            <label for=\"q11_5\" class=\"w-10 h-10 flex items-center justify-center rounded-full border-2 border-gray-300 cursor-pointer hover:bg-blue-50 transition-colors\">5</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Repeat for other questions -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mt-4 flex justify-between\">\n");
      out.write("                                <button type=\"button\" class=\"bg-blue-500 text-white px-4 py-2 rounded\" onclick=\"showSection('section-2')\">Previous</button>\n");
      out.write("                                <button type=\"submit\" class=\"bg-green-500 text-white px-4 py-2 rounded\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Function to show a specific section and update the stepper\n");
      out.write("        function showSection(sectionId) {\n");
      out.write("            // Hide all sections\n");
      out.write("            document.querySelectorAll('.form-section').forEach(section => {\n");
      out.write("                section.classList.add('hidden');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Show the selected section\n");
      out.write("            document.getElementById(sectionId).classList.remove('hidden');\n");
      out.write("\n");
      out.write("            // Update the stepper\n");
      out.write("            updateStepper(sectionId);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Function to update the stepper\n");
      out.write("        function updateStepper(sectionId) {\n");
      out.write("            const stepperItems = document.querySelectorAll('.stepper-item');\n");
      out.write("\n");
      out.write("            // Map section IDs to their step indexes\n");
      out.write("            const sectionToStepIndex = {\n");
      out.write("                'section-1': 0,\n");
      out.write("                'section-2': 1,\n");
      out.write("                'section-3': 2\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            // Get the current step index\n");
      out.write("            const currentStepIndex = sectionToStepIndex[sectionId];\n");
      out.write("\n");
      out.write("            stepperItems.forEach((item, index) => {\n");
      out.write("                item.classList.remove('active', 'completed');\n");
      out.write("\n");
      out.write("                if (index < currentStepIndex) {\n");
      out.write("                    item.classList.add('completed'); // Mark previous steps as completed\n");
      out.write("                } else if (index === currentStepIndex) {\n");
      out.write("                    item.classList.add('active'); // Mark the current step as active\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Initialize the form with the first section\n");
      out.write("        showSection('section-1');\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
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
    _jspx_th_c_set_0.setValue(new String("task"));
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
    _jspx_th_c_set_1.setVar("page");
    _jspx_th_c_set_1.setValue(new String("bli08"));
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
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${{\r\n    'dashboard': 'Dashboard',\r\n    'task': 'Task',\r\n    'bli02': 'BLI 02 : Organization Approval Response Form',\r\n    'bli05': 'BLI 05 : Student Evaluation',\r\n    'attendance': 'Attendance',\r\n    'reports': 'Reports',\r\n    'settings': 'Settings'\r\n}}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("request");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
