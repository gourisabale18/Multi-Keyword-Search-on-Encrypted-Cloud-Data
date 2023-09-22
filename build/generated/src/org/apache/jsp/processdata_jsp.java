package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cloudsystem.*;

public final class processdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


    if(request.getParameter("BtnStartProcess")!=null)
    {
        String unm=(String)session.getAttribute("username");
        ProcessDataSet.keywordExtraction(unm);
        
        
         
      out.write("\n");
      out.write("                    <script language='javascript' type='text/javascript'>\n");
      out.write("                       alert(\"Process Completed\");\n");
      out.write("\n");
      out.write("                   </script>\n");
      out.write("                   ");

    }

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Keyword Base Search On Encrypted Document </title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"background\">\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("                                    <h1><strong>Keyword Base Search On Encrypted Document </strong>!</h1>\n");
      out.write("                                  \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("                                                    <a href=\"weldataowner.jsp\">Home </a></li>\n");
      out.write("                                                  <li><a href=\"#\" onclick=\"window.open('DownloadFile1');\n");
      out.write("   \">Generate Keys</a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                <li>\n");
      out.write("\n");
      out.write("                                                                                             \n");
      out.write("                                                        <a href=\"Uploadpage1.jsp\">Upload Data</a></li><li>\n");
      out.write("                                                \n");
      out.write("                                                        <a href=\"processdata.jsp\">Pre-Process DataSet</a></li>\n");
      out.write("                                                  <li>\n");
      out.write("                                                     <a href=\"uploadkey.jsp\">Upload Key </a></li>\n");
      out.write("                                                \n");
      out.write("                                                <li>\t<a href=\"login.jsp\">Log Out</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"contents\"> \n");
      out.write("      <br><br> \n");
      out.write("<form action=\"\"  method=\"post\" name=\"frm\">\n");
      out.write("    <br><br>  <br><br> <br><br>\n");
      out.write("    <p align=\"center\">   \n");
      out.write("        <input style=\"font-size: 20px;font-style: italic\" type=\"submit\" name=\"BtnStartProcess\" value=\"Pre-Process DataSet\" />\n");
      out.write("    </p>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</form>       <br><br>  <br><br>  <br><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<br><br><br><br><br>\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t \n");
      out.write("\t  </div><br><br><br><br><br><br><br>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
