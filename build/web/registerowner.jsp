<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="cloudsystem.*" %>
<%
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
			<div id="contents"><br><br><br>
 <form id="formID">
                                                             <table align="center" width="50%">
                            <tr><td align="center" colspan="2" style="color: gray"><font face="verdana" size="8"><b>Owner Register</b></font></h1></td></tr>
                            <tr><td align="center" height="20px" colspan="2" style="color: #33be40"><font face="verdana" size="8"><b></b></font></h1></td></tr>
                            <tr><td style="color: black">
                                    <font face="verdana" size="5"><b>  Name : </b></font> </td><td><input type="text" name="name"  required style="width: 250px;" /></td></tr>
<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> Address : </b></font> </td><td><input type="text" name="addr" required style="width: 250px;"/></td></tr>
<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> Ph : </b></font> </td><td>
        <input type="text" name="ph" required pattern="^\d{10}$" maxlength="10" style="width: 250px;"/></td></tr>

<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> Email : </b></font> </td><td>
        <input type="text" name="email" required pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$"  style="width: 250px;"/></td></tr>

<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> Occupation:</b></font> </td><td><input type="text" name="occupation" required style="width: 250px;"/></td></tr>
<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> UserName : </b></font> </td><td><input type="text" name="username" required style="width: 250px;"/></td></tr>
<tr><td style="color: black">
                                    <font face="verdana" size="5"><b> Password :</b></font> </td><td><input type="password" name="password" required style="width: 250px;"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" style="font-size: 30px"  name="BtnSub" value="Submit" /></td></tr></table>
</form>
      <br><br><br><br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
					
				
		  </div>
		</div>
		<div id="footer">
		  
	  </div>
            <br><br><br>
	</div>
</body>
</html>