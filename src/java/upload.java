/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import com.oreilly.servlet.MultipartRequest;

import java.io.IOException;
import javax.servlet.ServletException;
//import ars.Connect;
import java.io.PrintWriter;

import java.sql.Statement;
import java.util.Enumeration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author 
 */
public class upload extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
        cloudsystem.DataConnect cn=new cloudsystem.DataConnect();
        String uploadPath ="",filename="",uploadPath1="";
     
        try
        {
            out=response.getWriter();
            HttpSession session = request.getSession();

            String contentType = request.getContentType();
            if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0))
            {

                 String relativeWebPath = "/upload";
                String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
                //String loxel=(String)session.getAttribute("loxel");
                //absoluteDiskPath=absoluteDiskPath+"\\"+loxel;
                //out.println(absoluteDiskPath);

                ////uploadPath=absoluteDiskPath;
               // uploadPath="/root/NetBeansProjects/School On Cloud/web/food";
                String unm=(String)session.getAttribute("username");
                uploadPath="C://upload/"+unm;
                java.io.File fobj=new java.io.File(uploadPath);
               // fobj.delete();
                
               // ProcessDataSet.deleteAll();
                    if(!fobj.exists())
                        fobj.mkdir();
           
                String img1,img2,img3,chk;
                MultipartRequest mpreq = new MultipartRequest(request,uploadPath,104857600);
                Enumeration<String> ipath1 = mpreq.getFileNames();
               //  Connection cn1=Class.forName(unm, true, null);
               //  Statement stmt=cn1.createStatement();

                 while (ipath1.hasMoreElements())
             {
               String  name = ipath1.nextElement();
              
              
               // String type = mpreq.getContentType(name);
                 filename = mpreq.getFilesystemName(name);
                  //String query2="select filename from userwise_files where username='"+unm+"' and filename="+uploadPath+"/"+filename+"";
                  //ResultSet rs=stmt.executeQuery(query2);
            
                 if(filename!=null && filename!="")
                 {
                   //int filecode=cn.getNextNo("uploaddata","filecode");
                   //String  query = "insert into uploaddata values("+filecode+",'"+uploadPath+"/"+filename+"','"+unm+"','n','n','n','n','n','n','n')";
                   String query="insert into userwise_files values('"+unm+"','"+uploadPath+"/"+filename+"')";
                //  stmt.executeQuery(query);
                   //System.out.println("query executed");
                 cn.updateRecord(query);
                  
                    
                 }

                 }
               
cn.Close();


                  
                   

               
                }
             response.sendRedirect("Uploadpage1.jsp");
        }
        catch(Exception ex){
        System.out.println("error occured");
        ex.printStackTrace();
        response.sendRedirect("weldataowner.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
