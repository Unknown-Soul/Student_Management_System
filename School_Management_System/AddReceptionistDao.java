import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AddReceptionistDao 
{
	int status=0;
	public static int Save(String name,String Password)
	{
		String usr="root";
		String pwd="ashu";
		String url="jdbc:mysql://localhost:3306/PMKVY";
		String sql="select * from Receptionist";
		int  Status = 0;
		try 
		{

			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/PMKVY","root","ashu");  
			PreparedStatement ps=con.prepareStatement("insert into Receptionist(NAME,PASSWORD) values(?,?)");
			ps.setString(1,name);
			ps.setString(2,Password); 
			Status=ps.executeUpdate();
			
			
		
		}
		catch(Exception e)
		{      
		   System.out.println(e);
		}
		return Status;
	}
	

}
