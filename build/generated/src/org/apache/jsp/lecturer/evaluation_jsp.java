package org.apache.jsp.lecturer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class evaluation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/lecturer/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/lecturer/top.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Industrial Supervisor Dashboard - Internship Management System</title>\r\n");
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
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                <div class=\"text-sm font-medium text-gray-900\">Muhammad</div>\r\n");
      out.write("                <div class=\"text-xs text-gray-500\">Lecturer</div>\r\n");
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
      out.write("            <a href=\"evaluation.jsp\"\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Content -->\r\n");
      out.write("        <div class=\"flex-1\">\r\n");
      out.write("            <!-- Top bar -->\r\n");
      out.write("            ");
      out.write("<div class=\"h-16 bg-white shadow-sm border-b flex items-center justify-between px-8\">\r\n");
      out.write("    <!-- Page Title -->\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
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
      out.write("                <!-- Success Message -->\r\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.success}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"bg-green-100 border border-green-400 text-green-700 px-4 py-3 rounded relative mb-4\" role=\"alert\">\r\n");
          out.write("                        <span class=\"block sm:inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                        <button type=\"button\" class=\"absolute top-0 bottom-0 right-0 px-4 py-3\" onclick=\"this.parentElement.remove()\">\r\n");
          out.write("                            <span class=\"text-green-700\">&times;</span>\r\n");
          out.write("                        </button>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    ");
 session.removeAttribute("success"); 
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Error Message -->\r\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded relative mb-4\" role=\"alert\">\r\n");
          out.write("                        <span class=\"block sm:inline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                        <button type=\"button\" class=\"absolute top-0 bottom-0 right-0 px-4 py-3\" onclick=\"this.parentElement.remove()\">\r\n");
          out.write("                            <span class=\"text-red-700\">&times;</span>\r\n");
          out.write("                        </button>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    ");
 session.removeAttribute("error"); 
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Task Section -->\r\n");
      out.write("                <div class=\"bg-white rounded-xl shadow-sm p-6\">\r\n");
      out.write("                    <div class=\"flex justify-between items-center mb-6\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h2 class=\"text-xl font-bold text-gray-900\">Supervisor Tasks</h2>\r\n");
      out.write("                            <p class=\"text-gray-600\">Forms</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form method=\"GET\" action=\"TaskServlet\" class=\"flex items-center gap-4\">\r\n");
      out.write("                            <div class=\"relative\">\r\n");
      out.write("                                <button type=\"button\" class=\"bg-white border border-blue-500 text-gray-700 px-4 py-2 rounded-md flex items-center\" id=\"dropdownMenuButton\">\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.studentName != null ? param.studentName : 'Select Student'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                    <svg class=\"w-4 h-4 ml-2\" fill=\"none\" stroke=\"currentColor\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                                        <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M19 9l-7 7-7-7\"></path>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <ul class=\"absolute hidden bg-white border border-gray-200 rounded-md shadow-lg mt-1 w-full z-10\" id=\"dropdownMenu\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"hidden\" name=\"studentName\" id=\"selectedStudentInput\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.studentName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"bg-blue-500 text-white px-4 py-2 rounded-md\">Search</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Task Cards -->\r\n");
      out.write("                    <div class=\"grid grid-cols-1 md:grid-cols-2 gap-6\">\r\n");
      out.write("                        <div class=\"bg-white border border-gray-200 rounded-lg p-6 shadow-sm\">\r\n");
      out.write("                            <div class=\"flex items-center gap-4\">\r\n");
      out.write("                                <img src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" alt=\"thumbnail\" class=\"w-20 h-20 rounded-lg object-cover\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h3 class=\"text-lg font-semibold text-gray-900\">BLI 06</h3>\r\n");
      out.write("                                    <p class=\"text-sm text-gray-600\">Industrial training visit evaluation form</p>\r\n");
      out.write("                                    <a href=\"BLI06.jsp\" class=\"mt-2 inline-block w-full bg-blue-500 text-white px-4 py-2 rounded-md text-center\">Open</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-white border border-gray-200 rounded-lg p-6 shadow-sm\">\r\n");
      out.write("                            <div class=\"flex items-center gap-4\">\r\n");
      out.write("                                <img src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" alt=\"thumbnail\" class=\"w-20 h-20 rounded-lg object-cover\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h3 class=\"text-lg font-semibold text-gray-900\">BLI 08</h3>\r\n");
      out.write("                                    <p class=\"text-sm text-gray-600\">Academic supervisor evaluation form</p>\r\n");
      out.write("                                    <a href=\"BLI08.jsp\" class=\"mt-2 inline-block w-full bg-blue-500 text-white px-4 py-2 rounded-md text-center\">Open</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // Function to handle student selection from dropdown\r\n");
      out.write("        function selectStudent(name) {\r\n");
      out.write("            document.getElementById('dropdownMenuButton').textContent = name;\r\n");
      out.write("            document.getElementById('selectedStudentInput').value = name;\r\n");
      out.write("            // Submit the form when a student is selected\r\n");
      out.write("            document.forms[0].submit();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Toggle dropdown menu\r\n");
      out.write("        document.getElementById('dropdownMenuButton').addEventListener('click', function() {\r\n");
      out.write("            const dropdownMenu = document.getElementById('dropdownMenu');\r\n");
      out.write("            dropdownMenu.classList.toggle('hidden');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // Close dropdown when clicking outside\r\n");
      out.write("        document.addEventListener('click', function(event) {\r\n");
      out.write("            const dropdownMenu = document.getElementById('dropdownMenu');\r\n");
      out.write("            const dropdownButton = document.getElementById('dropdownMenuButton');\r\n");
      out.write("            if (!dropdownButton.contains(event.target) && !dropdownMenu.contains(event.target)) {\r\n");
      out.write("                dropdownMenu.classList.add('hidden');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // Run when page loads\r\n");
      out.write("        window.onload = function() {\r\n");
      out.write("            // Get selected student from parameter\r\n");
      out.write("            const urlParams = new URLSearchParams(window.location.search);\r\n");
      out.write("            const selectedStudent = urlParams.get('studentName');\r\n");
      out.write("\r\n");
      out.write("            if (selectedStudent) {\r\n");
      out.write("                // Update dropdown text\r\n");
      out.write("                document.getElementById('dropdownMenuButton').textContent = selectedStudent;\r\n");
      out.write("                // Update hidden input\r\n");
      out.write("                document.getElementById('selectedStudentInput').value = selectedStudent;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
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
    _jspx_th_c_set_1.setVar("pageNames");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${{\r\n    'dashboard': 'Dashboard',\r\n    'task': 'Task',\r\n    'bli02': 'BLI 02 : Organization Approval Response Form',\r\n    'bli05': 'BLI 05 : Student Evaluation',\r\n    'attendance': 'Attendance',\r\n    'reports': 'Reports',\r\n    'settings': 'Settings'\r\n}}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("student");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <li>\r\n");
          out.write("                                            <a href=\"#\" class=\"block px-4 py-2 text-sm text-gray-700 hover:bg-blue-500 hover:text-white\" onclick=\"selectStudent('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.studentName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.studentName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </li>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/assets/images/thumbnail1.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/assets/images/thumbnail1.png");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
