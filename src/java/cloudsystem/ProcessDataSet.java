/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudsystem;

/**
 *
 * @author Admin
 */
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class ProcessDataSet 
{
    
    public static void keywordExtraction(String unm)
    {
        DataConnect cn=new DataConnect();
        
      //  cn.updateRecord("delete from filekeywords where unm='"+unm+"'");
  
        CommonVariables.wordlist=new ArrayList<>();
        try
        {
            //long []file_size;
            CommonVariables.stopwordlist=new ArrayList<String>();
            File sf=new File("c:\\stopword.txt");
            BufferedReader reader1=new BufferedReader(new FileReader(sf));
            String line=null;
            while ((line=reader1.readLine())!=null)
            {
                
                CommonVariables.stopwordlist.add(line);
                System.out.println(line);

            }
            
          
            
            String fnm="";
            ResultSet rs=cn.getRecords("select distinct filename from userwise_files where username='"+unm+"'");
            int count=0;
            double N=0;
            
            while(rs.next())
            {
                fnm=rs.getString("filename");
                count++;//toget the userwise filecount
                String name=fnm.substring(0, fnm.indexOf("."));
                CommonVariables.C.add(name);
                if(fnm.endsWith(".pdf"))
                {
                    PdfReader reader = new PdfReader((new File(fnm)).getAbsolutePath());
                    int n = reader.getNumberOfPages();
                  String pdfdata="";
                    for(int j=1;j<=n;j++)
                    {
                        String str=PdfTextExtractor.getTextFromPage(reader, j); //Extracting the content from a particular page.
                        StringTokenizer st=new StringTokenizer(str,",.!\"'-_:/? ");
                        while (st.hasMoreElements()) 
                        {
                            String nextElement = (String)st.nextElement();
                            if((!CommonVariables.wordlist.contains(nextElement.toLowerCase())))
                            {
                                CommonVariables.wordlist.add(nextElement.toLowerCase());
                            }

                        }

                    }
                    reader.close();
                }
                else
                {
                    BufferedReader bin=new BufferedReader(new FileReader(fnm));
                    String line1="";
                    while((line1=bin.readLine())!=null)
                    {

                        StringTokenizer st=new StringTokenizer(line1,",.!\"'-_:/? ");
                        while (st.hasMoreElements()) 
                        {
                            String nextElement = (String)st.nextElement();
                            if((!CommonVariables.wordlist.contains(nextElement.toLowerCase())))
                            {
                                CommonVariables.wordlist.add(nextElement.toLowerCase());
                            }

                        }
                    }
                    bin.close();
                }   
       
      //call function  

        //this is for removing stopwords from file words to generate keywords in wordlist at last
        for(int i=0;i<CommonVariables.stopwordlist.size();i++)
        {
            String str=CommonVariables.stopwordlist.get(i);
            str=str.toLowerCase();
            if(CommonVariables.wordlist.contains(str))
            {
                int j=0;
                while(j<CommonVariables.wordlist.size())
                {
                    if(CommonVariables.wordlist.get(j).equals(str))
                        CommonVariables.wordlist.remove(j);
                    else
                        ++j;

                }

            }

        }
        
        int i=0;
        while(i<CommonVariables.wordlist.size())
        {
            boolean flag=true;
            String word=CommonVariables.wordlist.get(i);
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                if(!Character.isLetter(ch))
                {
                    flag=false;
                    break;
                }

            }
            if(!flag)
            {
                    CommonVariables.wordlist.remove(i);
            }
            else
            {
                ++i;
            }
        }
        
        for(String s:CommonVariables.wordlist)
        {
            System.out.println("filewise wordlist"+s);
        }
          int count1;//for tf of each keyword  
          int tf_false=0,idf_false=0,score_false=0;
         for(String s:CommonVariables.wordlist)
    {
      
       // cn.updateRecord(sql3);
       count1=0;
     BufferedReader bin=new BufferedReader(new FileReader(fnm));
                    String line2="";
                    while((line2=bin.readLine())!=null)
                    {

                        StringTokenizer st=new StringTokenizer(line2,",.!\"'-_:/? ");
                        
                        while (st.hasMoreElements()) 
                        {
                            String nextElement = (String)st.nextElement();
                          
                            if((s.equalsIgnoreCase(nextElement)))
                            {
                               count1++; //tf
                             
                              
                            }

                        }
                       
                    }
                    tf_false=count1;
                    
                    //idf calculation
                    //System.out.println("count 1 is:"+count1);
                  bin.close();
                        String sql3="insert into score_board values('"+unm+"','"+fnm+"','"+s+"',"+tf_false+","+idf_false+","+score_false+","+1+")";
                        cn.updateRecord(sql3);
                      ArrayList<Integer> index=new ArrayList<Integer>();
                     
                             
    }
            }//end outer while
            N=count;//files uploaded by user
            

            String filenm1="";
           ArrayList<String> filenm2=new ArrayList<String>();
           ResultSet rs7=cn.getRecords("select distinct filename from userwise_files where username='"+unm+"'");
            
            while(rs7.next())
            {
                filenm1=rs7.getString("filename");
                filenm2.add(filenm1);
            }
            System.out.println(filenm2);
           
            int count2=0;
    int flag=0;
    int flag1=0;
    int count3=0;
    System.out.println(CommonVariables.wordlist);
    for(String a:CommonVariables.wordlist)
    {
       
        count3=0; 
        
    for(String s:filenm2)
    {
        flag1=0;
       
       //count2=0;
     //String sql2="insert into fn values('"+s+"')";
     //stmt.executeUpdate(sql2);
     BufferedReader bin=new BufferedReader(new FileReader(s));
                    String line8="";
                    while((line8=bin.readLine())!=null)
                    {

                        StringTokenizer st=new StringTokenizer(line8,",.!\"'-_:/? ");
                        while (st.hasMoreElements()) 
                        {
                            String nextElement = (String)st.nextElement();
                            // System.out.println("a"+a);
                             //System.out.println("ne"+nextElement);
                            if((a.equalsIgnoreCase(nextElement)))
                            {
                               count3++;
                              
                               break;
                               //it is to check wheather the given file contains keyword or not
                             
                               //System.out.println(unm+a+s+count1);
                              
                            }
                            
                                    
                            

                        }
                        if(count3==1)
                        {
                          
                            break;
                        }
                        
                       
                       
                    }
                  bin.close();
                  if(flag1==1)
                  {
                      count2++;
                      
                  }
                      
                      //stmt.executeUpdate(sql3);
    }
  String sql9="update score_board set idf="+count3+" where keywords='"+a+"' ";//where username='"+unm+"'
                      cn.updateRecord(sql9);
    
                     
//ystem.out.println("count2 is"+count2);
     
    }
      
            
    double score;
    double file_size;
          //score calculation
      String sql12="select * from score_board where username='"+unm+"'";
      ResultSet rs10=cn.getRecords(sql12);
      
      String sql20="select distinct filename from score_board";   
      ResultSet rs20=cn.getRecords(sql20);
      while(rs20.next())
      {
          N++;
      }
      while(rs10.next())
      {
          double tf=rs10.getDouble("tf");
          double idf=rs10.getDouble("idf");
          String filename3=rs10.getString("filename");
          String keyword3=rs10.getString("keywords");
          File f=new File(filename3);
          file_size=(double)f.length();
          
          
          score=((Math.log(tf)+1)*(Math.log(N+(1/idf))))/file_size;
          System.out.println(score);
          System.out.println(file_size);
        
       
          String sql11="update score_board set score="+score+" where keywords='"+keyword3+"' and filename='"+filename3+"'";
                      cn.updateRecord(sql11);
          
      }
    
    //next code.
      //index buid
    ArrayList<String> all_keywords=new ArrayList<String>();
    ArrayList<String> for_each_file;
    ArrayList<Character> index1;
    ArrayList<ArrayList<Character>> main_index=new ArrayList<ArrayList<Character>>();
 
    ArrayList<Character> binary_new=new ArrayList<Character>();
     String sql16="select distinct keywords from score_board";
     ResultSet rs16=cn.getRecords(sql16);
            while(rs16.next())
            {
                all_keywords.add(rs16.getString("keywords"));
            }
            //SECRET KEY GENERATION
            int size=all_keywords.size();
            size=size+1;
            Random rg=new Random();
            ArrayList<String> S=new ArrayList<String>();
           long value=rg.nextLong()>>> -size;
           value |=1L << size;
           S.add(Long.toBinaryString(value).substring(1));
          String key1="";
         for(String s:S)
        {
        key1=key1+s;
        } 
        System.out.print("key1"+key1);
        System.out.print("key1"+S);
        String sql19="update score_board set user_key='"+key1+"' where username='"+unm+"'";
        cn.updateRecord(sql19);    
            
            
            
            String sql17="select distinct filename from score_board where username='"+unm+"'";
            ResultSet rs17=cn.getRecords(sql17);
            while(rs17.next())
            {    
                ArrayList<Character> Pa=new ArrayList<Character>();
                ArrayList<Character> Pb=new ArrayList<Character>();
                System.out.println("filename is"+rs17.getString("filename"));
                index1=new ArrayList<Character>();
                String str2=rs17.getString("filename");
                String sql18="select distinct keywords from score_board where filename='"+str2+"'"; 
                ResultSet rs18=cn.getRecords(sql18);
                for_each_file=new ArrayList<String>();
                while(rs18.next())
                {
                    for_each_file.add(rs18.getString("keywords"));
                }
                int flag11=0;
                for(String a:all_keywords)
               {
                   flag11=0;
                   for(String b:for_each_file)
                   {
                   if(a.equals(b))
                   {
                       flag11=1;
                    
                       break;
                       //index1.add(1);
                       
                   }
                   
                   
                   }
            if(flag11==1)
             {
                 index1.add('1');
             }
             else
             {
                 index1.add('0');
             }
               }
            index1.add('1');
            System.out.println(index1);
            main_index.add(index1);
           
            for(String s:all_keywords)
            {
                System.out.println("all keywords"+s);
            }
            for(String s:for_each_file)
            {
                System.out.println("for each file"+s);
            }
           
        
            
            
           System.out.print("key1 pppppppppppp"+S);
           for(int i=0;i<key1.length();i++)
           {
               System.out.println("hello");
           }
 
    for(int k=0;k<key1.length();k++)
    {
        if(key1.charAt(k)=='0')
        {
            Pa.add(index1.get(k));
            Pb.add(index1.get(k));
        }
        else
        {
             Random rg1=new Random();
             ArrayList<String> temp=new ArrayList<String>();
             long value1=rg.nextLong()>>> -1;
             value1 |=1L << 1;
             String str10=Long.toBinaryString(value1).substring(1);
            
             if(str10.charAt(0)=='0')
             {
                 str10=str10+'1';
             }
             else
             {
                 str10=str10+'0';
             }
             Pa.add(str10.charAt(0));
             Pb.add(str10.charAt(1));
        }
        
    }
    System.out.println("Pa"+Pa);
    System.out.println("Pb"+Pb);
    
    
            index1.clear();
            for_each_file.clear();
            }
            
            
        
    }
        
        catch(Exception ex)
        {
        ex.printStackTrace();
        }

       
         
   
    
}
}
    
    

