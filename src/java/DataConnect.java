



import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataConnect {
        Connection cn;
	Statement stmt;
        PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	int cnt=0;
        String url ="jdbc:mysql://localhost:3306/be_project";
        
	public DataConnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
                        cn=DriverManager.getConnection(url,"root","");

		}
		catch(Exception ex)
		{}
	}
	public int updateRecord(String qry)
	{
		try
		{
			stmt=cn.createStatement();
			cnt=stmt.executeUpdate(qry);
                        //cn.close();
		}
		catch(Exception ex)
		{
                    cnt=0;
                }
		return cnt;
	}
        public int updatePrepRecord(String qry)
	{
		try
		{
			stmt=cn.prepareStatement(qry);
			cnt=pstmt.executeUpdate();
                        //cn.close();
		}
		catch(Exception ex)
		{
                    cnt=0;
                }
		return cnt;
	}
        public void Close()
	{
		try
		{
			cn.close();
		}
		catch(Exception ex)
		{System.out.println("error   : "+ex);}

	}
	public ResultSet getRecords(String qry)
	{
		try
		{
			stmt=cn.createStatement();
			rs=stmt.executeQuery(qry);
		}
		catch(Exception ex)
		{}
		return rs;
	}
        public int getNextNo(String tblnm,String colnm)
	{
            int maxno=0;
		try
		{

                    sql="select "+colnm+" from "+tblnm;
                    stmt=cn.createStatement();
                    rs=stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        int id=rs.getInt(1);
                        if(id>maxno)
                        {
                            maxno=id;
                        }
                    }

		}
		catch(Exception ex)
		{}
            ++maxno;
		return maxno;
	}

        public int getRecordCount(String sql)
	{
            int cnt=0;
		try
		{

                    
                    stmt=cn.createStatement();
                    rs=stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        ++cnt;
                    }

		}
		catch(Exception ex)
		{}
           
		return cnt;
	}
}
