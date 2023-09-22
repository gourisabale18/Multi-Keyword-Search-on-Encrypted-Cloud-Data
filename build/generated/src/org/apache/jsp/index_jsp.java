package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cloudsystem.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Keyword Base Search On Encrypted Document </title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\">\r\n");
      out.write("\t   <script type=\"text/javascript\" src=\"js/jssor.slider.min.js\"></script>\r\n");
      out.write("    <!-- use jssor.slider.debug.js instead for debug -->\r\n");
      out.write("   <script type=\"text/javascript\" src=\"js/jssor.slider.min.js\"></script>\r\n");
      out.write("    <!-- use jssor.slider.debug.js instead for debug -->\r\n");
      out.write("    <script>\r\n");
      out.write("        jssor_1_slider_init = function() {\r\n");
      out.write("            \r\n");
      out.write("            var jssor_1_SlideshowTransitions = [\r\n");
      out.write("              {$Duration:1200,$Opacity:2}\r\n");
      out.write("            ];\r\n");
      out.write("            \r\n");
      out.write("            var jssor_1_options = {\r\n");
      out.write("              $AutoPlay: true,\r\n");
      out.write("              $SlideshowOptions: {\r\n");
      out.write("                $Class: $JssorSlideshowRunner$,\r\n");
      out.write("                $Transitions: jssor_1_SlideshowTransitions,\r\n");
      out.write("                $TransitionsOrder: 1\r\n");
      out.write("              },\r\n");
      out.write("              $ArrowNavigatorOptions: {\r\n");
      out.write("                $Class: $JssorArrowNavigator$\r\n");
      out.write("              },\r\n");
      out.write("              $BulletNavigatorOptions: {\r\n");
      out.write("                $Class: $JssorBulletNavigator$\r\n");
      out.write("              }\r\n");
      out.write("            };\r\n");
      out.write("            \r\n");
      out.write("            var jssor_1_slider = new $JssorSlider$(\"jssor_1\", jssor_1_options);\r\n");
      out.write("            \r\n");
      out.write("            //responsive code begin\r\n");
      out.write("            //you can remove responsive code if you don't want the slider scales while window resizing\r\n");
      out.write("            function ScaleSlider() {\r\n");
      out.write("                var refSize = jssor_1_slider.$Elmt.parentNode.clientWidth;\r\n");
      out.write("                if (refSize) {\r\n");
      out.write("                    refSize = Math.min(refSize, 600);\r\n");
      out.write("                    jssor_1_slider.$ScaleWidth(refSize);\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    window.setTimeout(ScaleSlider, 30);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            ScaleSlider();\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"load\", ScaleSlider);\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"resize\", $Jssor$.$WindowResizeFilter(window, ScaleSlider));\r\n");
      out.write("            $Jssor$.$AddEvent(window, \"orientationchange\", ScaleSlider);\r\n");
      out.write("            //responsive code end\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        \r\n");
      out.write("        /* jssor slider bullet navigator skin 05 css */\r\n");
      out.write("        /*\r\n");
      out.write("        .jssorb05 div           (normal)\r\n");
      out.write("        .jssorb05 div:hover     (normal mouseover)\r\n");
      out.write("        .jssorb05 .av           (active)\r\n");
      out.write("        .jssorb05 .av:hover     (active mouseover)\r\n");
      out.write("        .jssorb05 .dn           (mousedown)\r\n");
      out.write("        */\r\n");
      out.write("        .jssorb05 {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("        }\r\n");
      out.write("        .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            /* size of bullet elment */\r\n");
      out.write("            width: 16px;\r\n");
      out.write("            height: 16px;\r\n");
      out.write("            background: url('images/cloud_image.jpg') no-repeat;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        .jssorb05 div { background-position: -7px -7px; }\r\n");
      out.write("        .jssorb05 div:hover, .jssorb05 .av:hover { background-position: -37px -7px; }\r\n");
      out.write("        .jssorb05 .av { background-position: -67px -7px; }\r\n");
      out.write("        .jssorb05 .dn, .jssorb05 .dn:hover { background-position: -97px -7px; }\r\n");
      out.write("\r\n");
      out.write("        /* jssor slider arrow navigator skin 12 css */\r\n");
      out.write("        /*\r\n");
      out.write("        .jssora12l                  (normal)\r\n");
      out.write("        .jssora12r                  (normal)\r\n");
      out.write("        .jssora12l:hover            (normal mouseover)\r\n");
      out.write("        .jssora12r:hover            (normal mouseover)\r\n");
      out.write("        .jssora12l.jssora12ldn      (mousedown)\r\n");
      out.write("        .jssora12r.jssora12rdn      (mousedown)\r\n");
      out.write("        */\r\n");
      out.write("        .jssora12l, .jssora12r {\r\n");
      out.write("            display: block;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            /* size of arrow element */\r\n");
      out.write("            width: 30px;\r\n");
      out.write("            height: 46px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            background: url('img/a12.png') no-repeat;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("        .jssora12l { background-position: -16px -37px; }\r\n");
      out.write("        .jssora12r { background-position: -75px -37px; }\r\n");
      out.write("        .jssora12l:hover { background-position: -136px -37px; }\r\n");
      out.write("        .jssora12r:hover { background-position: -195px -37px; }\r\n");
      out.write("        .jssora12l.jssora12ldn { background-position: -256px -37px; }\r\n");
      out.write("        .jssora12r.jssora12rdn { background-position: -315px -37px; }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"background\">\r\n");
      out.write("\t\t<div id=\"page\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("                                    <h1><strong>Keyword Base Search On Encrypted Document </strong>!</h1>\r\n");
      out.write("                                   \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"navigation\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t        <li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"registerowner.jsp\">Owner Register</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("                                                 <li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"UserRegister.jsp\">User Register</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("                                                <li >\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t <br />  <br />  <br />\r\n");
      out.write("  \r\n");
      out.write("   <div id=\"jssor_1\" style=\"position: relative; margin: 0 auto; top: 0px; left: 0px; width: 600px; height: 350px; overflow: hidden; visibility: hidden;\">\r\n");
      out.write("        <!-- Loading Screen -->\r\n");
      out.write("        <div data-u=\"loading\" style=\"position: absolute; top: 0px; left: 0px;\">\r\n");
      out.write("            <div style=\"filter: alpha(opacity=70); opacity: 0.7; position: absolute; display: block; top: 0px; left: 0px; width: 100%; height: 100%;\"></div>\r\n");
      out.write("            <div style=\"position:absolute;display:block;background:url('img/loading.gif') no-repeat center center;top:0px;left:0px;width:100%;height:100%;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div data-u=\"slides\" style=\"cursor: default; position: relative; top: 0px; left: 0px; width: 600px; height: 300px; overflow: hidden;\">\r\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\r\n");
      out.write("                <img data-u=\"image\" src=\"images/cloud1.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\r\n");
      out.write("                <img data-u=\"image\" src=\"images/cloud2.png\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\r\n");
      out.write("                <img data-u=\"image\" src=\"images/cloud3.jpg\" />\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Bullet Navigator -->\r\n");
      out.write("        <div data-u=\"navigator\" class=\"jssorb05\" style=\"bottom:16px;right:16px;\" data-autocenter=\"1\">\r\n");
      out.write("            <!-- bullet navigator item prototype -->\r\n");
      out.write("            <div data-u=\"prototype\" style=\"width:16px;height:16px;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Arrow Navigator -->\r\n");
      out.write("        <span data-u=\"arrowleft\" class=\"jssora12l\" style=\"top:0px;left:0px;width:30px;height:46px;\" data-autocenter=\"2\"></span>\r\n");
      out.write("        <span data-u=\"arrowright\" class=\"jssora12r\" style=\"top:0px;right:0px;width:30px;height:46px;\" data-autocenter=\"2\"></span>\r\n");
      out.write("        <a href=\"http://www.jssor.com\" style=\"display:none\">Bootstrap Carousel</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        jssor_1_slider_init();\r\n");
      out.write("    </script>\r\n");
      out.write("\t <br />  <br />  <br /> <br />\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h1><strong>Cloud computing</strong>!</h1>\r\n");
      out.write("\t\t\t\t\t<p><strong>Cloud computing</strong>, also known as on-demand computing, is a kind of   Internet-based computing, where shared resources, data and information   are provided to computers and other devices on-demand. </p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("             <br> <br> <br>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  </div>\r\n");
      out.write("\t<br></div>\r\n");
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
}
