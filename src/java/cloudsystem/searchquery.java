/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudsystem;

import java.sql.ResultSet;
import java.util.StringTokenizer;
import java.util.*;

/**
 *
 * @author prajakta
 */
public class searchquery {
    public static void resultGenerate(String unm,String query)
    {
        try
        {
        DataConnect cn=new DataConnect();
        ArrayList<Character> trapd=new ArrayList<Character>();
        //System.out.println("in search1");
        ArrayList<String> searchlist=new ArrayList<String>();//user query words
          StringTokenizer st=new StringTokenizer(query,",.!\"'-_:/? ");
          //System.out.println("in search2");
                        while (st.hasMoreElements()) 
                        {
                             //System.out.println("in search3");
                            String nextElement = (String)st.nextElement();
                             //System.out.println("in search4");
                            if((!searchlist.contains(nextElement.toLowerCase())))
                            {
                                searchlist.add(nextElement.toLowerCase());
                            }
                        

                        }
                        System.out.println(searchlist);
                        
                        //trapdoor gneration
                         ArrayList<Character> Qa;
                          ArrayList<Character>Qb;
                        ArrayList<ArrayList<Character>> trapdoor_final=new ArrayList<ArrayList<Character>>();
                          String sql16="select distinct username from score_board";
                          ResultSet rs16=cn.getRecords(sql16);
                          while(rs16.next())
                          {
                              Qa=new ArrayList<Character>();
                              Qb=new ArrayList<Character>();
                              String username=rs16.getString("username");
                              String sql17="select distinct keywords from score_board";
                              int flag=0;
                              ResultSet rs17=cn.getRecords(sql17);
                              while(rs17.next())
                              {
                                  String fkeyword=rs17.getString("keywords");//m diamensional
                                  for(String s:searchlist)
                                  {
                                      if(s.equals(fkeyword))
                                      {
                                          flag=1;
                                          break;
                                      }
                                  }
                                  if(flag==1)
                                  {
                                      trapd.add('1');
                                  }
                                  else
                                  {
                                      trapd.add('0');
                                  }
                              }
                              trapd.add('1');//m+1 
                              trapdoor_final.add(trapd);
                              System.out.println("trapdoor"+trapd);
                              System.out.println(username);
                              String sql19="select distinct user_key from score_board where username='"+username+"'";
                              ResultSet rs19=cn.getRecords(sql19);
                               //System.out.println(rs19.getString("user_key"));
                              String user_key="";
                              while(rs19.next())
                              {
                                   user_key=rs19.getString("user_key");
                              }
                              
                              //qa qb
                                 for(int k=0;k<user_key.length()-1;k++)
                                {
                                     if(user_key.charAt(k)=='0')
                                    {
                                        Qa.add(trapd.get(k));
                                        Qb.add(trapd.get(k));
                                   }
                                    else
                                    {
                                        Random rg1=new Random();
                                       // ArrayList<String> temp=new ArrayList<String>();
                                        long value1=rg1.nextLong()>>> -1;
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
                                        Qa.add(str10.charAt(0));
                                        Qb.add(str10.charAt(1));
        }
        
    }
    System.out.println("Qa"+Qa);
    System.out.println("Qb"+Qb);
                              
                              
                              
                             
                             
                              
                              
                          
                              
                          }

                          
                          //splitting trapdoor q
                           
                           
                          
                          
                          
            
    }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }
    }
    
}
