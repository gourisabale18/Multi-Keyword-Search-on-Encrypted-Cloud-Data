<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="cloudsystem.*" %>
<%
    String msg="";
    LoginAction obj=new LoginAction();
    RegisterAction reg=new RegisterAction();
    if(request.getParameter("BtnSub")!=null)
        {
          //  CommonVariables.processtime=0;
            obj.setUsername(request.getParameter("username"));
            obj.setPassword(request.getParameter("password"));
            msg=obj.execute();
            if(msg.equals("dataowner"))
                {
                    session.setAttribute("username", request.getParameter("username"));
                    response.sendRedirect("weldataowner.jsp");
                    
                }
           if(msg.equals("datauser"))
                {
                    session.setAttribute("username", request.getParameter("username"));
                    response.sendRedirect("weldatauser.jsp");
                    
                }
            
        }

%>
     <!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Keyword Base Search On Encrypted Document </title>
	<link rel="stylesheet" href="css/style1.css" type="text/css">
</head>
<body>
	<div id="background">
		<div id="page">
			<div id="header">
				<div id="logo">
                                    <h1><strong>Keyword Base Search On Encrypted Document </strong>!</h1>
                                    
				</div>
				<div id="navigation">
					<ul>
						<li >
							<a href="index.jsp">Home</a>
						</li>
						
					        <li>
							<a href="registerowner.jsp">Owner Register</a>
						</li>
                                                <li >
							<a href="login.jsp">Login</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="contents">              
                            <br><br><br><br><br>
                    <form id="formID">
                        <table align="center">
                            <tr><td align="center" style="color: gray"><font face="verdana" size="8"><b>Log In</b></font></h1></td></tr>
                            <tr><td style="color: black"></td></tr>
                             <tr><td style="color: black"></td></tr>
                              <tr><td style="color: black"></td></tr>
                               <tr><td style="color: black"></td></tr>
                               <tr><td height="20px" style="color: black"></td></tr> <tr><td style="color: black"></td></tr>
                            
                            <tr><td style="color: black">
                                    <font face="verdana" size="5"><b> UserName </b></font>: <input type="text" style="width: 250px;" name="username" required/></td>
                                <tr><td height="20px" style="color: black"></td></tr>
                                
                                <tr><td style="color: black">
                                        <font face="verdana" size="5"><b> Password</b></font> &nbsp;&nbsp;&nbsp;:&nbsp;<input style="width: 250px;" type="password" name="password" required/></td></tr>
                                <tr><td height="20px" style="color: black"></td></tr>
                                <tr><td align="center"><b><font face="verdana" size="6"><input style="font-size: 20px;font-style: italic" type="submit" name="BtnSub" value="Submit" /></font></b></td></tr>
</table>
                       
     </form> 

                            <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

					
				
		  </div>
		</div>
		<div id="footer">
		 
	  </div>
            <br><br><br><br><br><br>
	</div>
</body>
</html>