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
   
            %>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Keyword Base Search On Encrypted Document </title>
	<link rel="stylesheet" href="css/style1.css" type="text/css">
          <script>
function myFunction() {
    alert("File Upload!");
}
</script>
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
                                                  <li><a href="#" onclick="window.open('DownloadFile');
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
<form name="frm" id="formID" action="UploadPublicKey" method="POST" enctype="multipart/form-data" onSubmit="return validateUploadForm()">


 <table align="center" cellspacing="20px">

                                                                  <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Select Public File :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg1" value=""    /></td>
                                                                 </tr>
                                                                  <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Select Private File :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg2" value=""    /></td>
                                                                 </tr>

                                                                  <tr>
                                                                      <td height="20px">
                                                                          <input type="hidden" name="ipath1" value="" />
                                                                         <input type="hidden" name="ipath2" value="" />
                                                                          
                                                                      </td>
                               <td colspan="2" align="center">
<input type="submit" name="BtnSub" value="Upload & Encrypt" onclick="myFunction()"/>&nbsp;&nbsp;&nbsp;&nbsp; </td>
                                                                 </tr>
                                                             </table>





  <script type="text/javascript">
      $(document).ready(function () {
          $('#tblContact').dataTable({
              "iDisplayLength": 5,
              "lengthMenu": [5,10, 25, 50, 100]
          });
      });
  </script>



          </form>        <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br>
				
					
				
		  </div>
		</div>
             <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
		<div id="footer">
		  
	  </div><br><br><br><br>
	</div>
</body>
</html>