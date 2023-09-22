/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudsystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author GAURI
 */
public class RegisterAction {
    String username,password;
    String name,addr,ph,email,occupation;
    int code;
    String utype;

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
    List<RegisterAction>  tableRows=new ArrayList<RegisterAction> ();
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    public List<RegisterAction>  gettableRows() {
        return tableRows;
    }
    public void setTableRows(List<RegisterAction>  tableRows) {
        this.tableRows = tableRows;
    }
   /* public String getNewReg()
    {
        //List<RegisterAction> tableInfo=new ArrayList<RegisterAction>();
        String dbQuery = "SELECT * FROM reg where username not in(select username from userlog)";
        DataConnect dao=new DataConnect();
        try
        {
        ResultSet result=dao.getRecords(dbQuery);
        while(result.next()){
                RegisterAction obj=new RegisterAction();
                obj.setCode(result.getInt("code"));
                obj.setName(result.getString("name"));
                obj.setAddr(result.getString("addr"));
                obj.setPh(result.getString("ph"));
                
                obj.setEmail(result.getString("email"));
                
               
                obj.setOccupation(result.getString("occupation"));
                obj.setUsername(result.getString("username"));
                obj.setPassword(result.getString("password"));
                tableRows.add(obj);
                
            }
        return "success";
        }
        catch(Exception ex){return "error";}
    }*/
 /*public String getEmailByunm()
    {
    String dbQuery = "SELECT * FROM reg where username='"+username+"' and password='"+password+"'";
        DataConnect dao=new DataConnect();
        try
        {
        ResultSet result=dao.getRecords(dbQuery);
        while(result.next()){
                RegisterAction obj=new RegisterAction();
               

           return     result.getString("email");

             
                

            }
        return "success";
        }
        catch(Exception ex){return "error";}
 }*/
   /* public String getSelectedReg()
    {
        //List<RegisterAction> tableInfo=new ArrayList<RegisterAction>();
        String dbQuery = "SELECT * FROM reg where code="+code;
        DataConnect dao=new DataConnect();
        try
        {
        ResultSet result=dao.getRecords(dbQuery);
        while(result.next()){
                RegisterAction obj=new RegisterAction();
                obj.setCode(result.getInt("code"));
                obj.setName(result.getString("name"));
                obj.setAddr(result.getString("addr"));
                obj.setPh(result.getString("ph"));
                
                obj.setEmail(result.getString("email"));
                
                obj.setOccupation(result.getString("occupation"));
                obj.setUsername(result.getString("username"));
                obj.setPassword(result.getString("password"));
                tableRows.add(obj);

            }
        return "success";
        }
        catch(Exception ex){return "error";}
    }*/
    
	public String execute(){
		//System.out.println("In execute()...");
                DataConnect dao=new DataConnect();
                code= dao.getNextNo("reg", "code");
                String sql="insert into reg values("+code+",'"+name+"','"+addr+"','"+ph+"','"+email+"','"+occupation+"','"+username+"','"+password+"','"+utype+"')";
                int cnt=dao.updateRecord(sql);
		if(cnt>0)
                {
                    String sql1="insert into userlog values('"+username+"','"+password+"','"+utype+"')";
                       dao.updateRecord(sql1);
                    return "success";
                }
		else
			return "error";



	}
      /*  public String RejectReg(){
		//System.out.println("In execute()...");
                DataConnect dao=new DataConnect();
                
                String sql="delete from reg where code="+code;
                int cnt=dao.updateRecord(sql);
		if(cnt>0)
                {

                    return "success";
                }
		else
			return "error";



	}*/
        
        public String confirmReg(){
		//System.out.println("In execute()...");
                DataConnect dao=new DataConnect();
                String sql="select username,password from reg where code="+code;
                try
                {
                    ResultSet rs=dao.getRecords(sql);
                    if(rs.next())
                    {
                        username=rs.getString("username");
                        password=rs.getString("password");
                        sql="insert into userlog values('"+username+"','"+password+"','user')";
                        int cnt=dao.updateRecord(sql);
                        if(cnt>0)
                                return "success";
                        else
                                return "error";
                    }
                    else
                        return "error";
                }
                catch(Exception ex){return "error";}



	}
}
