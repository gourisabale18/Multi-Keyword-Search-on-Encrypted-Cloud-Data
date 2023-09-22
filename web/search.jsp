<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="cloudsystem.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.*" %>
<%@page import="cloudsystem.ProcessDataSet" %>
<%
    DataConnect cn=new DataConnect();
     String unm=(String)session.getAttribute("username");
     String query=request.getParameter("query");
     System.out.println("in search");
   if(request.getParameter("BtnSearch")!=null)
    {
        System.out.println("in search");
        searchquery.resultGenerate(unm,query);
        
        
         %>
                    <script language='javascript' type='text/javascript'>
                       alert("Process Completed");

                   </script>
                   <%
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
						<li>
                                                    <a href="weldatauser.jsp">Home </a></li>
                                                  
                                                    <li>
                                                    <a href="trapdoor.jsp">Trapdoor Generation </a></li>
                                          
                                                  <li>
                                                     <a href="downloadkey.jsp">Request Key </a></li>
                                                   <li>
                                                     <a href="downloaddata.jsp">Download Data </a></li>
                                                    <li>
                                                     <a href="search.jsp">Search</a></li> 
                                                
                                                <li>	<a href="login.jsp">Log Out</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="contents"> 
      <br><br> 
<form action=""  method="post" name="frm">



                       Welcome <%= (String)session.getAttribute("username") %>
                       
                       <table align="center" width="50%">
                           <tr><td><font face="verdana" size="5"><b>Enter query</b></font></td></tr>
                            <tr><td><input type="text" name="query"  required style="width: 250px;" /></td><td><input type="submit" style="font-size: 30px"  name="BtnSearch" value="Search" /></td></tr></table>
		   <br><br>  <br><br> 
                   
                   
                                                        
       

            

  

  <br />
 <br /> <br /> <br /> <br />





  <script type="text/javascript">
      $(document).ready(function () {
          $('#tblContact').dataTable({
              "iDisplayLength": 5,
              "lengthMenu": [5,10, 25, 50, 100]
          });
      });
  </script>



          </form>        <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
				
					
				
		  </div>
		</div>
		<div id="footer">
		  
	  </div><br><br><br><br>
	</div>
</body>
</html>
