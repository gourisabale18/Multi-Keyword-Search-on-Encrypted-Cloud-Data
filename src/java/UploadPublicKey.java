/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.oreilly.servlet.MultipartRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
//import ars.Connect;
import java.io.PrintWriter;
import java.security.PublicKey;
import java.util.Enumeration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class UploadPublicKey extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
       
        String uploadPath ="",uploadPath1 ="";
     
        try
        {
            out=response.getWriter();
            HttpSession session = request.getSession();

            String contentType = request.getContentType();
            if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0))
            {

                 
           
                String img1,img2,img3,chk;
                MultipartRequest mpreq = new MultipartRequest(request,uploadPath,1048576000);
               
                
                
                
                 /////////////////////////////
                //////////////////////////
//////                String uploadPath2="E://upload/"+unm+"/PrivateKey/";
//////                java.io.File fobj2=new java.io.File(uploadPath2);
//////                    if(!fobj2.exists())
//////                        fobj2.mkdir();
//////                    /////////////////////////////////////////////////////
//////                    InputStream inStream = null;
//////	OutputStream outStream = null;		
//////    	try{    		
//////    	    File afile =new File("E://upload/"+unm+"/PublicKey/private.key");
//////    	    File bfile =new File(uploadPath2+"/private.key");    		
//////    	    inStream = new FileInputStream(afile);
//////    	    outStream = new FileOutputStream(bfile);        	
//////    	    byte[] buffer = new byte[1024];    		
//////    	    int length;
//////    	    //copy the file content in bytes 
//////    	    while ((length = inStream.read(buffer)) > 0){    	  
//////    	    	outStream.write(buffer, 0, length);    	 
//////    	    }    	 
//////    	    inStream.close();
//////    	    outStream.close();    	    
//////    	    //delete the original file
//////    	    afile.delete();  }catch(Exception e){   	   
//////    	}
                
                
                
                
                
                
                
                
                
                String unm=(String)session.getAttribute("username");
               uploadPath1="C://upload_key/"+unm+"/Enc/";
                java.io.File fobj1=new java.io.File(uploadPath1);
                    if(!fobj1.exists())
                        fobj1.mkdir();
////////////////////////////encryption code
                
////            Enumeration<String> ipath1 = mpreq.getFileNames();
////                 while (ipath1.hasMoreElements())
////             {
                 try{
////               String  name = ipath1.nextElement();
               
////               String  filename = mpreq.getFilesystemName(name);
////                 if(filename!=null && filename!="")
////                 {
          BufferedReader reader=new BufferedReader(new FileReader("C://upload_key/"+unm+"/PublicKey/public.key"));//uploadPath+filename));
            String strkey="";
            String line;
            while ((line = reader.readLine()) != null) 
            {
                strkey+=line;
            }
            PublicKey key1=RSAProcess1.getPublicKeyFromString(strkey);

            String folder="C://upload_key/"+unm;
            File f=new File(folder);
            File [] filelist=f.listFiles();
            for(int i=0;i<filelist.length;i++)
            {
                String srcfile=filelist[i].getAbsolutePath();
                String destpath=uploadPath1+"/"+filelist[i].getName();
                RSAProcess1.encryptFile(srcfile, destpath, key1);
            }
           
//            String savefile=(obj.getSelectedFile().getAbsolutePath());
//            PublicKey key= RSAEncrypt.readPublicKey(jTextField2.getText());
//            RSAEncrypt obj1=new RSAEncrypt(jTextField1.getText(), savefile,key);
            //obj1.
//        }
                 }catch(Exception ex){}
//             }
                 
        }
        
          /////////////////

                  
                   

               
                
             response.sendRedirect("uploadkey.jsp");
        }
        catch(Exception ex){

        response.sendRedirect("uploadkey.jsp");
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
