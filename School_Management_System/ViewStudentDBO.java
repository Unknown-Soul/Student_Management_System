

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ViewStudentDBO
{    
      static ResultSet status;
	static ResultSet getdata(String name)
	{
         

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/PMKVY","root","ashu");  
			java.sql.PreparedStatement ps=con.prepareStatement("select * from StudentInfo where NAME = ?");
			ps.setString(1,name);
			status =ps.executeQuery();	
			
         
		}
		 catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	    
	    }
		
		return status;
	}			
}
