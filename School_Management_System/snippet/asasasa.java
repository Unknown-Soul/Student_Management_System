package snippet;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class asasasa

{
	public static void main(String args[])
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PMKVY","root","ashu");
    }
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}