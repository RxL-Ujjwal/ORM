import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
	private static Connection con = null;
	
	//Using SQL Databases
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin123");
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	return con;
	}
}
