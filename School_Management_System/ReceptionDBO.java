import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ReceptionDBO 
{
	static Boolean Validate(String name, String password)
	{
		String usr="root";
		String pwd="ashu";
		String url="jdbc:mysql://localhost:3306/PMKVY";
		String sql="select * from Receptionist";
		boolean status=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,usr,pwd);
			java.sql.PreparedStatement ps=con.prepareStatement("Select * from Receptionist where NAME=? and PASSWORD=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
			
		}
			catch(Exception e)
		{      
		   System.out.println(e);
		}
			return true;
	}

}
