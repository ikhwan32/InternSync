package org.apache.jsp.lecturer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bli08_002d1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("<!--page1-->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Industrial Supervisor Dashboard - Internship Management System</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url('");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("'); \r\n");
      out.write("            background-size: cover;     \r\n");
      out.write("            background-repeat: no-repeat; \r\n");
      out.write("            background-attachment: fixed; \r\n");
      out.write("            background-position: center;  \r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("        }\r\n");
      out.write("        .dashboard-container {\r\n");
      out.write("            flex: 1; \r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("            margin-right: 100px;\r\n");
      out.write("        }\r\n");
      out.write("        .card {\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 25px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\r\n");
      out.write("            border: none;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .card-outer {\r\n");
      out.write("            background: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 20px;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            align-items: center; /* Align items vertically centered */\r\n");
      out.write("        }\r\n");
      out.write("        .card-outer .btn {\r\n");
      out.write("            background-color: #5D8BFF;\r\n");
      out.write("            flex-grow: 1; \r\n");
      out.write("            text-align: center; \r\n");
      out.write("        }\r\n");
      out.write("        .inner {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            border: none;\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            min-width: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("        }\r\n");
      out.write("        .form-control::placeholder {\r\n");
      out.write("            color: #D3D3D3 !important;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* Style for toggle switch */\r\n");
      out.write("        .switch {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 60px;\r\n");
      out.write("            height: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .switch input {\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            width: 0;\r\n");
      out.write("            height: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .slider {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            background-color: #ccc;\r\n");
      out.write("            transition: .4s;\r\n");
      out.write("            border-radius: 34px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .slider:before {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            content: \"\";\r\n");
      out.write("            height: 26px;\r\n");
      out.write("            width: 26px;\r\n");
      out.write("            left: 4px;\r\n");
      out.write("            bottom: 4px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            transition: .4s;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input:checked + .slider {\r\n");
      out.write("            background-color: #2196F3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input:checked + .slider:before {\r\n");
      out.write("            transform: translateX(26px);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Checkbox section styling */\r\n");
      out.write("        .checkbox-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 20px;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"dashboard-container\">\r\n");
      out.write("        \r\n");
      out.write("        <!-------------  Form Section ---------------->            \r\n");
      out.write("        <div class=\"card\" style=\"border-radius: 20px;\">\r\n");
      out.write("            <div class=\"inner\" style=\"padding-top: 20px;\">\r\n");
      out.write("                <div style=\"font-weight: 500; font-size: 25px;\">BLI 08</div>\r\n");
      out.write("                <div>Academic supervisor evaluation form for report,logbook and company feedback</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <form action=\"bli02\" method=\"POST\">\r\n");
      out.write("                <input type=\"hidden\" name=\"userType\" value=\"student\">\r\n");
      out.write("            \r\n");
      out.write("                <div>Student information</div><br>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Student Name :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Student Name\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Matric Number :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"matricNum\" placeholder=\"Matric Number\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Programme :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"programme\" placeholder=\"Programme\" required>\r\n");
      out.write("                </div>      \r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Phone Number :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"phoneNum\" placeholder=\"Phone Number\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Industrial Training Period :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"LiDuration\" placeholder=\"Phone Number\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Start Date :</label>\r\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"startDate\" placeholder=\"Supervisor's Name\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">End Date :</label>\r\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"endDate\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Organization Supervisor Name :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"svName\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Organization Name and Address :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"compNameAddress\" placeholder=\"Organization Name and Address\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Office Phone Number :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"compPhone\" placeholder=\"Academic Supervisor Name\" required>\r\n");
      out.write("                </div><br>\r\n");
      out.write("                \r\n");
      out.write("                <div>Academic Supervisor information</div>\r\n");
      out.write("                <br>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Academic supervisor name :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"lectName\" placeholder=\"Academic Supervisor Name\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label class=\"form-label\">Office Phone Number :</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"lectPhone\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-------------  button Section ----------------> \r\n");
      out.write("            <div class=\"card-outer\" style=\"margin-bottom: 0px;\">\r\n");
      out.write("                <a href=\"evaluation.jsp\" class=\"btn btn-primary\" style='background-color: #5D8BFF; border: none; flex-grow: 1;'>Back</a>\r\n");
      out.write("                <a href=\"bli08-2.jsp\" type=\"submit\" class=\"btn btn-primary\" style='background-color: #00D072; border: none; flex-grow: 1;'>Next</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div class=\"container my-5\">\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"pagination d-flex justify-content-center\">\r\n");
      out.write("                        <li class=\"page-item\">\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"bli08-1.jsp\" style=\"background-color: #5D8BFF; color: white; border: none; border-radius: 10px;\">1</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"bli08-2.jsp\" style=\"border: none;\">2</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"bli08-3.jsp\" style=\"border: none;\">3</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"bli08-4.jsp\" style=\"border: none;\">4</a></li>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/assets/images/background.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
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
    _jspx_th_c_set_0.setValue(new String("dashboard"));
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
