package org.apache.jsp.lecturer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Academic Supervisor Dashboard - Internship Management System</title>\r\n");
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
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .card {\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            padding: 25px;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\r\n");
      out.write("            border: none;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .header {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        .header .title {\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .header .menu {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .menu a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #555;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("        .menu a:hover {\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("        .content {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .important {\r\n");
      out.write("            background-color: #fdfdfd;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .student-status {\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: repeat(4, 1fr);\r\n");
      out.write("            gap: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .phase {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .phase .progress {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            background: white;\r\n");
      out.write("            border: 8px solid #007bff;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .card-inner{\r\n");
      out.write("            background: white;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            padding: 25px;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            box-shadow: 0 1px 3px rgba(0,0,0,0.1);\r\n");
      out.write("            border: none;\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            min-width: 200px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        .announcement-section {\r\n");
      out.write("            background-color: #F8F9FA;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .announcement-title {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("        .announcement-text {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            color: #666;\r\n");
      out.write("        }\r\n");
      out.write("        .dashboard-container {\r\n");
      out.write("            flex: 1; \r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("            margin-right: 100px;\r\n");
      out.write("        }\r\n");
      out.write("        .status{\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            height: 160px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .outer1{\r\n");
      out.write("            height: 160px;\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            box-shadow: 6px 6px 10px -1px rgba(0, 0, 0, 0.15),\r\n");
      out.write("                        -6px -6px 10px -1px rgba(755, 755, 755, 0.7);\r\n");
      out.write("        }\r\n");
      out.write("        .inner1{\r\n");
      out.write("            height: 120px;\r\n");
      out.write("            width: 120px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            box-shadow: inset 4px 4px 6px -1px rgba(0, 0, 0, 0.2),\r\n");
      out.write("                        inset -4px -4px 6px -1px rgba(755, 755, 755, 0.7),\r\n");
      out.write("                        -0.5px -0.5px 0px rgba(255, 255, 255, 1),\r\n");
      out.write("                        0.5px 0.5px 0px rgba(0, 0, 0, 0.15),\r\n");
      out.write("                        0px 12px 10px -10px rgba(0, 0, 0, 0.05);\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #number1, #number2, #number3, #number4{\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("        circle {\r\n");
      out.write("            fill: none;\r\n");
      out.write("            stroke-width: 20px;\r\n");
      out.write("            stroke-dasharray: 472;\r\n");
      out.write("            stroke-dashoffset: 472;\r\n");
      out.write("            animation: anim 2s linear forwards;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        svg{\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-outer{\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;  \r\n");
      out.write("            align-items: center;      \r\n");
      out.write("            gap: 80px;                \r\n");
      out.write("            flex-wrap: wrap;          \r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <div class=\"dashboard-container\">\r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("            <!------------- Announcement Section ---------------->\r\n");
      out.write("            <div class=\"card\" style=\"border-radius: 20px;\">\r\n");
      out.write("                <div class=\"announcement-section\">\r\n");
      out.write("                    <h3 class=\"announcement-title\">Announcement</h3>\r\n");
      out.write("                    <div class=\"announcement-text\" style=\"text-align: center;\">\r\n");
      out.write("                        IMMPORTANT: Please alert about incoming due date!.\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!------------- student status Section ---------------->\r\n");
      out.write("            <div class=\"card\" style=\"border-radius: 20px;\">\r\n");
      out.write("                <div style=\"text-align: center; color: #212529; font-size: 20px; font-weight: 500\">Student Status</div>\r\n");
      out.write("                    <div class=\"card-outer\">\r\n");
      out.write("                        <!-- Phase 1 Progress -->\r\n");
      out.write("                        <div class=\"status\">\r\n");
      out.write("                            <div class=\"outer1\">\r\n");
      out.write("                                <div class=\"inner1\">\r\n");
      out.write("                                    <div id=\"number1\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"160px\" height=\"160px\">\r\n");
      out.write("                                <defs>\r\n");
      out.write("                                    <linearGradient id=\"GradientColor1\">\r\n");
      out.write("                                        <stop offset=\"0%\" stop-color=\"#e91e63\" />\r\n");
      out.write("                                        <stop offset=\"100%\" stop-color=\"#673ab7\" />\r\n");
      out.write("                                    </linearGradient>\r\n");
      out.write("                                </defs>\r\n");
      out.write("                                <circle cx=\"80\" cy=\"80\" r=\"70\" stroke-linecap=\"round\" style=\"stroke: url(#GradientColor1);\"></circle>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <div style=\"text-align: center;\">Phase 1</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Phase 2 Progress -->\r\n");
      out.write("                        <div class=\"status\">\r\n");
      out.write("                            <div class=\"outer1\">\r\n");
      out.write("                                <div class=\"inner1\">\r\n");
      out.write("                                    <div id=\"number2\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"160px\" height=\"160px\">\r\n");
      out.write("                                <defs>\r\n");
      out.write("                                    <linearGradient id=\"GradientColor2\">\r\n");
      out.write("                                        <stop offset=\"0%\" stop-color=\"#e91e63\" />\r\n");
      out.write("                                        <stop offset=\"100%\" stop-color=\"#673ab7\" />\r\n");
      out.write("                                    </linearGradient>\r\n");
      out.write("                                </defs>\r\n");
      out.write("                                <circle cx=\"80\" cy=\"80\" r=\"70\" stroke-linecap=\"round\" style=\"stroke: url(#GradientColor2);\"></circle>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <div style=\"text-align: center;\">Phase 2</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Phase 3 Progress -->\r\n");
      out.write("                        <div class=\"status\">\r\n");
      out.write("                            <div class=\"outer1\">\r\n");
      out.write("                                <div class=\"inner1\">\r\n");
      out.write("                                    <div id=\"number3\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"160px\" height=\"160px\">\r\n");
      out.write("                                <defs>\r\n");
      out.write("                                    <linearGradient id=\"GradientColor3\">\r\n");
      out.write("                                        <stop offset=\"0%\" stop-color=\"#e91e63\" />\r\n");
      out.write("                                        <stop offset=\"100%\" stop-color=\"#673ab7\" />\r\n");
      out.write("                                    </linearGradient>\r\n");
      out.write("                                </defs>\r\n");
      out.write("                                <circle cx=\"80\" cy=\"80\" r=\"70\" stroke-linecap=\"round\" style=\"stroke: url(#GradientColor3);\"></circle>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <div style=\"text-align: center;\">Phase 3</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Phase 4 Progress -->\r\n");
      out.write("                        <div class=\"status\">\r\n");
      out.write("                            <div class=\"outer1\">\r\n");
      out.write("                                <div class=\"inner1\">\r\n");
      out.write("                                    <div id=\"number4\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"160px\" height=\"160px\">\r\n");
      out.write("                                <defs>\r\n");
      out.write("                                    <linearGradient id=\"GradientColor4\">\r\n");
      out.write("                                        <stop offset=\"0%\" stop-color=\"#e91e63\" />\r\n");
      out.write("                                        <stop offset=\"100%\" stop-color=\"#673ab7\" />\r\n");
      out.write("                                    </linearGradient>\r\n");
      out.write("                                </defs>\r\n");
      out.write("                                <circle cx=\"80\" cy=\"80\" r=\"70\" stroke-linecap=\"round\" style=\"stroke: url(#GradientColor4);\"></circle>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <div style=\"text-align: center;\">Phase 4</div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("            <!------------- script for circle progress bar Section ---------------->\r\n");
      out.write("    <script>\r\n");
      out.write("function animateProgress(numberId, targetPercentage, circleElement) {\r\n");
      out.write("    const radius = 70; // Radius of the circle\r\n");
      out.write("    const circumference = 2 * Math.PI * radius;\r\n");
      out.write("\r\n");
      out.write("    // Set the stroke-dasharray for the circle\r\n");
      out.write("    circleElement.style.strokeDasharray = circumference;\r\n");
      out.write("    circleElement.style.strokeDashoffset = circumference;\r\n");
      out.write("\r\n");
      out.write("    let numberElement = document.getElementById(numberId);\r\n");
      out.write("    let counter = 0;\r\n");
      out.write("\r\n");
      out.write("    // Animate the counter\r\n");
      out.write("    let interval = setInterval(() => {\r\n");
      out.write("        if (counter >= targetPercentage) {\r\n");
      out.write("            clearInterval(interval);\r\n");
      out.write("        } else {\r\n");
      out.write("            counter += 1;\r\n");
      out.write("            numberElement.innerHTML = counter + \"%\";\r\n");
      out.write("        }\r\n");
      out.write("    }, 30);\r\n");
      out.write("\r\n");
      out.write("    // Add a delay to ensure the transition applies\r\n");
      out.write("    setTimeout(() => {\r\n");
      out.write("        circleElement.style.transition = \"stroke-dashoffset 2s ease\";\r\n");
      out.write("        circleElement.style.strokeDashoffset = circumference * (1 - targetPercentage / 100);\r\n");
      out.write("    }, 100);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Call the function for each progress bar\r\n");
      out.write("animateProgress(\"number1\", 50, document.querySelector('#number1').closest('.status').querySelector('circle'));\r\n");
      out.write("animateProgress(\"number2\", 75, document.querySelector('#number2').closest('.status').querySelector('circle'));\r\n");
      out.write("animateProgress(\"number3\", 15, document.querySelector('#number3').closest('.status').querySelector('circle'));\r\n");
      out.write("animateProgress(\"number4\", 30, document.querySelector('#number4').closest('.status').querySelector('circle'));\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
