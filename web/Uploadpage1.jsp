<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

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
                                                 <a href="#" onclick="window.open('DownloadFile1');
   ">Generate Keys</a>
                                                    </li>
                                                <li>
                                                        <a href="Uploadpage1.jsp">Upload Data</a></li>
                                                 <li>
                                                     <a href="uploadkey.jsp">Upload Key </a></li>
                                               
                                                 <li>
                                                     <a href="processdata.jsp">Preprocess Data </a></li>
                                                <li>	<a href="login.jsp">Log Out</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="contents"> 
      <br><br> 
 <form name="frm" id="formID" action="upload" method="POST" enctype="multipart/form-data" onSubmit="return validateUploadForm()">

     <table align="center" cellspacing="20px">

                                                                  <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 1 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg1" value=""    /></td>
                                                                 </tr>
                                                                  <tr>



                                                                     <td height="20px" style="color: #000000;"> <b>  Document 2 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg2" value=""   /></td>
                                                                 </tr>
                                                                  <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 3 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg3" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 4 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg4" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 5 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg5" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 6 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg6" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 7 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg7" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 8 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg8" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 9 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg9" value=""   /></td>
                                                                 </tr>
                                                                 <tr>


                                                                     <td height="20px" style="color: #000000;"> <b>  Document 10 :-</b> </td>
                                                                     <td > <input  type="file"  id="textbox"  name="txtimg10" value=""   /></td>
                                                                 </tr>


                                                                  <tr>
                                                                      <td height="20px">
                                                                          <input type="hidden" name="ipath1" value="" />
                                                                          <input type="hidden" name="ipath2" value="" />
                                                                          <input type="hidden" name="ipath3" value="" />
                                                                           <input type="hidden" name="ipath4" value="" />
                                                                          <input type="hidden" name="ipath5" value="" />
                                                                          <input type="hidden" name="ipath6" value="" />
                                                                           <input type="hidden" name="ipath7" value="" />
                                                                          <input type="hidden" name="ipath8" value="" />
                                                                          <input type="hidden" name="ipath9" value="" />
                                                                           <input type="hidden" name="ipath10" value="" />
                                                                          
                                                                      </td><td></td>
                               <td colspan="2" align="center">
<input type="submit" name="BtnSub" value="Submit" onclick="myFunction()"/>&nbsp;&nbsp;&nbsp;&nbsp; </td>
                                                                 </tr>
                                                             </table>
         </form>     <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br>  <br><br>
				
					
				
		  </div>
		</div>
		
	</div>
</body>
</html>