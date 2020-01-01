package snippet;
import java.sql.*;


public class LoginDb
{
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost:3306/PMKVY";
	 
	 
	 static final String USER = "root";
	 static final String PASS = "ashu";
	   
     public static void main(String[] args) 
  {
     Connection conn = null;
     Statement stmt = null;
     try
       {
    	//STEP 2: Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         //STEP 3: Open a connection
         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         //STEP 4: Execute a query
         System.out.println("Creating statement...");
         stmt = conn.createStatement();
      
       
       }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
  }
}