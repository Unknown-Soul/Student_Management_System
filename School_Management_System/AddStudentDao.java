import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.omg.CORBA.portable.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;


import com.mysql.jdbc.Connection;

public class AddStudentDao
{

	static int Save(String name, String fathername, String gender, String date, String Qualification,String Email,String Address,String Pincode,String Phone_1,String Phone_2,FileInputStream fistream,File pics,FileInputStream fistream_1, File docs_1,FileInputStream fistream_2,File docs_2,String Course)
	{    

		int status=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PMKVY","root","ashu");
			
			PreparedStatement ps=con.prepareStatement("insert into StudentInfo(Name,Father_Name,Gender,date,Qualification,Email,Address,Pincode,Mobile,Mobile_1,Image,Document,Document_1,Course) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,fathername);
			ps.setString(3,gender);
			ps.setString(4,date);
			ps.setString(5,Qualification);
			ps.setString(6,Email);
			ps.setString(7,Address);
			ps.setString(8,Pincode);
			ps.setString(9,Phone_1);
			ps.setString(10,Phone_2);
			ps.setBinaryStream(11,fistream, (int)(pics.length()));
			ps.setAsciiStream(12,fistream_1, (int)(docs_1.length()));
		    ps.setAsciiStream(13,fistream_2, (int)(docs_2.length()));
		    ps.setString(14, Course);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);
		}
		return status;
		
	}

	
	


}
