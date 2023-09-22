package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cloudsystem.*;

public final class registerowner_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String msg="";
    RegisterAction obj=new RegisterAction();
    if(request.getParameter("BtnSub")!=null)
        {
            String unm=request.getParameter("username");
            obj.setName(request.getParameter("name"));
            obj.setAddr(request.getParameter("addr"));
            obj.setPh(request.getParameter("ph"));
            obj.setEmail(request.getParameter("email"));
            obj.setOccupation(request.getParameter("occupation"));
            obj.setUsername(unm);
            obj.setPassword(request.getParameter("password"));
            obj.setUtype("dataowner");
            msg=obj.execute();
            if(msg.equals("success"))
                {
                  String uploadPath="d://upload/"+unm;
                java.io.File fobj=new java.io.File(uploadPath);
                    if(!fobj.exists())
                        fobj.mkdir();
                    response.sendRedirect("login.jsp");
                }
        }


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Keyword Base Search On Encrypted Document </title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
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
      out.write("                                                <li >\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"contents\"><br><br><br>\r\n");
      out.write(" <form id=\"formID\">\r\n");
      out.write("                                                             <table align=\"center\" width=\"50%\">\r\n");
      out.write("                            <tr><td align=\"center\" colspan=\"2\" style=\"color: #660000\"><font face=\"verdana\" size=\"8\"><b>Owner Register</b></font></h1></td></tr>\r\n");
      out.write("                            <tr><td align=\"center\" height=\"20px\" colspan=\"2\" style=\"color: #33be40\"><font face=\"verdana\" size=\"8\"><b></b></font></h1></td></tr>\r\n");
      out.write("                            <tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b>  Name : </b></font> </td><td><input type=\"text\" name=\"name\"  required style=\"width: 250px;\" /></td></tr>\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> Address : </b></font> </td><td><input type=\"text\" name=\"addr\" required style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> Ph : </b></font> </td><td>\r\n");
      out.write("        <input type=\"text\" name=\"ph\" required pattern=\"^\\d{10}$\" maxlength=\"10\" style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> Email : </b></font> </td><td>\r\n");
      out.write("        <input type=\"text\" name=\"email\" required pattern=\"^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$\"  style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> Occupation:</b></font> </td><td><input type=\"text\" name=\"occupation\" required style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> UserName : </b></font> </td><td><input type=\"text\" name=\"username\" required style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("<tr><td style=\"color: black\">\r\n");
      out.write("                                    <font face=\"verdana\" size=\"5\"><b> Password :</b></font> </td><td><input type=\"password\" name=\"password\" required style=\"width: 250px;\"/></td></tr>\r\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" style=\"font-size: 30px\"  name=\"BtnSub\" value=\"Submit\" /></td></tr></table>\r\n");
      out.write("</form>\r\n");
      out.write("      <br><br><br><br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  </div>\r\n");
      out.write("            <br><br><br>\r\n");
      out.write("\t</div>\r\n");
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
