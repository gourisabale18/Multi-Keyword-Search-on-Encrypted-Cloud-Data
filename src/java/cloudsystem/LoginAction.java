apackage cloudsystem;


import java.io.File;
import java.sql.ResultSet;
import java.util.Map;
public class LoginAction {
	String username,password,usertype;
        
        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String execute(){
		//System.out.println("In execute()...");
                String sql="select * from userlog where username='"+username+"' and password='"+password+"'";
                DataConnect dao=new DataConnect();
                try
                {
                    ResultSet rs=dao.getRecords(sql);
                    if(rs.next())
                    {
                        
                        usertype=rs.getString("usertype");
                        //Map session = ActionContext.getContext().getSession();
                        //session.put("username",username);
                        
                        return usertype;
                    }
                    else
                        return "error";
                }
                catch(Exception ex){return "error";}
	}

	/*@Override
	public void validate() {
		if(username.length()==0)
				addFieldError("username","Username is Empty");
	    if(password.length()==0)
	    	    addFieldError("password", "Password is Empty");
				
		
	}*/

	 
}
