

import crypttool.RSAProcess;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.swing.JFileChooser;


public class DownloadFile1 extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
try
{
            HttpSession session = request.getSession();
        
        
      
        KeyPair pair= RSAProcess.generateKey();
        PublicKey k1= pair.getPublic();
        PrivateKey k2= pair.getPrivate();
        String s1=RSAProcess.getKeyAsString(k1);
        String s2=RSAProcess.getKeyAsString(k2);
     //   String s2=request.getParameter("data");


//////        
//////           String filename = "private.key";
//////            ServletOutputStream out = response.getOutputStream();
//////        //FileOutputStream fout = new FileOutputStream(filename);
//////        //fout.write((algo.getN()).toByteArray());
//////        //fout.close();
//////        response.setContentType("application/octet-stream");
//////        response.addHeader("content-disposition",
//////                "attachment; filename=" + filename);
//////
//////        //int octet;
//////        //while((octet = in.read()) != -1)
//////            out.write(s2.getBytes());
//////            out.close();
            
          BufferedWriter out=new  BufferedWriter(new FileWriter( "e:\\private.key"));
            out.write(s2);
            out.close();  
            
     out=new  BufferedWriter(new FileWriter( "e:\\public.key"));
            out.write(s1);
            out.close();  
            response.sendRedirect("/KBSOED/weldataowner.jsp");
      
        //}
}
catch(Exception ex){}
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}
