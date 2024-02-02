package Java.FileProgram.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	static Connection con=null;
	public static Connection getConnection()
	{
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
		System.out.println("Connection Established");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		catch (SQLException ae) {
			System.out.println("Exception"+ae.getMessage());
		}
		
		return con;
	
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
		
	}
}
