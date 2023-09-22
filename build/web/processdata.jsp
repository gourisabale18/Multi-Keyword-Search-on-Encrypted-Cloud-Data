<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="cloudsystem.*" %>
<!DOCTYPE html>
<%

    if(request.getParameter("BtnStartProcess")!=null)
    {
        String unm=(String)session.getAttribute("username");
        ProcessDataSet.keywordExtraction(unm);
        
        
         %>
                    <script language='javascript' type='text/javascript'>
                       alert("Process Completed");

                   </script>
                   <%
    }
%>
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
						<li>
                                                    <a href="weldataowner.jsp">Home </a></li>
                                                  <li><a href="#" onclick="window.open('DownloadFile1');
   ">Generate Keys</a>
                                                    </li>
                                                <li>

                                                                                             
                                                        <a href="Uploadpage1.jsp">Upload Data</a></li><li>
                                                
                                                        <a href="processdata.jsp">Pre-Process DataSet</a></li>
                                                  <li>
                                                     <a href="uploadkey.jsp">Upload Key </a></li>
                                                
                                                <li>	<a href="login.jsp">Log Out</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="contents"> 
      <br><br> 
<form action=""  method="post" name="frm">
    <br><br>  <br><br> <br><br>
    <p align="center">   
        <input style="font-size: 20px;font-style: italic" type="submit" name="BtnStartProcess" value="Pre-Process DataSet" />
    </p>
   

</form>       <br><br>  <br><br>  <br><br>
				
		<br><br><br><br><br>			
				
		  </div>
		</div>
             <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
		<div id="footer">
		 
	  </div><br><br><br><br><br><br><br>
	</div>
</body>
</html>