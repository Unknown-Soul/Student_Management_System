package snippet;

import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usr="root";
		String pwd="ashu";
		String url="jdbc:mysql://localhost:3306/PMKVY";
		String sql="select * from Receptionist";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,usr,pwd);
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch(Exception e) {}

	}

}