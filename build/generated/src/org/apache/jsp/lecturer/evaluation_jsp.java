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
    _jspx_dependants.add("/WEB-INF/jspf/supervisor/sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/supervisor/top.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("    <title>Academic Supervisor Dashboard - Internship Management System</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Inter', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.active .stepper-circle {\r\n");
      out.write("            background-color: #3b82f6;\r\n");
      out.write("            border-color: #3b82f6;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.completed .stepper-circle {\r\n");
      out.write("            background-color: #3b82f6;\r\n");
      out.write("            border-color: #3b82f6;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.active .stepper-label {\r\n");
      out.write("            color: #3b82f6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .stepper-item.completed .stepper-label {\r\n");
      out.write("            color: #3b82f6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .rating-input:checked+label {\r\n");
      out.write("            background-color: #3b82f6;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-task {\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 25px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\r\n");
      out.write("            border: 2px solid lightgrey;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            height: 280px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cardforlogo {\r\n");
      out.write("            background: none;\r\n");
      out.write("            padding: 0px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 20px;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            gap: 10px;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cardforlogo img {\r\n");
      out.write("            max-width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            right: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-secondary.dropdown-toggle {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            border-color: #5D8BFF;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-secondary.dropdown-toggle:hover {\r\n");
      out.write("            background-color: #5D8BFF;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border-color: #5D8BFF;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dropdown-item:hover {\r\n");
      out.write("            background-color: #5D8BFF;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-gray-50\">\r\n");
      out.write("    <div class=\"min-h-screen flex\">\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Content -->\r\n");
      out.write("        <div class=\"flex-1\">\r\n");
      out.write("            <!-- Top bar -->\r\n");
      out.write("            ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Page Content -->\r\n");
      out.write("            <div class=\"p-8\">\r\n");
      out.write("                <!-- Evaluation Section -->\r\n");
      out.write("                <div class=\"bg-white rounded-xl shadow-sm p-6\">\r\n");
      out.write("                    <div class=\"flex justify-between items-center mb-4\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h3 class=\"text-xl font-bold\">Evaluation</h3>\r\n");
      out.write("                            <p class=\"text-gray-600\">Forms</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form action=\"submitDropdownSelection.jsp\" method=\"POST\">\r\n");
      out.write("                            <div class=\"flex gap-4\">\r\n");
      out.write("                                <div class=\"dropdown\">\r\n");
      out.write("                                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"width: 250px; border-radius: 10px;\">\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.selectedStudent != null ? param.selectedStudent : 'Select Student'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("                                        <li><a class=\"dropdown-item\" href=\"#\" onclick=\"selectStudent('studentName1')\">studentName1</a></li>\r\n");
      out.write("                                        <li><a class=\"dropdown-item\" href=\"#\" onclick=\"selectStudent('studentName2')\">studentName2</a></li>\r\n");
      out.write("                                        <li><a class=\"dropdown-item\" href=\"#\" onclick=\"selectStudent('studentName3')\">studentName3</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" name=\"selectedStudent\" id=\"selectedStudentInput\">\r\n");
      out.write("                                <button type=\"submit\" class=\"bg-blue-500 text-white px-4 py-2 rounded\">Search</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- BLI 06 Card -->\r\n");
      out.write("                    <div class=\"card-task\">\r\n");
      out.write("                        <div class=\"cardforlogo\">\r\n");
      out.write("                            <img src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" alt=\"thumbnail\" style=\"border-radius: 20px; width: 200px; height: 200px\">\r\n");
      out.write("                            <div class=\"flex flex-col\">\r\n");
      out.write("                                <h3 class=\"text-2xl font-bold\">BLI 06</h3>\r\n");
      out.write("                                <p class=\"text-gray-600\">Industrial training visit evaluation form</p>\r\n");
      out.write("                                <a href=\"BLI06-1.jsp\" class=\"bg-blue-500 text-white px-4 py-2 rounded mt-2 text-center\">Open</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- BLI 08 Card -->\r\n");
      out.write("                    <div class=\"card-task\">\r\n");
      out.write("                        <div class=\"cardforlogo\">\r\n");
      out.write("                            <img src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" alt=\"thumbnail\" style=\"border-radius: 20px; width: 200px; height: 200px\">\r\n");
      out.write("                            <div class=\"flex flex-col\">\r\n");
      out.write("                                <h3 class=\"text-2xl font-bold\">BLI 08</h3>\r\n");
      out.write("                                <p class=\"text-gray-600\">Academic supervisor evaluation form</p>\r\n");
      out.write("                                <a href=\"bli08-1.jsp\" class=\"bg-blue-500 text-white px-4 py-2 rounded mt-2 text-center\">Open</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function selectStudent(name) {\r\n");
      out.write("            document.getElementById('dropdownMenuButton').textContent = name;\r\n");
      out.write("            document.getElementById('selectedStudentInput').value = name;\r\n");
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
    _jspx_th_c_set_1.setVar("page");
    _jspx_th_c_set_1.setValue(new String("evaluation"));
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
