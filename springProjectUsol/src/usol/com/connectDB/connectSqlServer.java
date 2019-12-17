package usol.com.connectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectSqlServer {
	public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String URL = "jdbc:sqlserver://DESKTOP-61F69KA;databaseName=newsManagement";
	public static final String USER = "sa";
	public static final String PASS = "Dungvn@@030398";

	public static Connection getConnectionSqlServer() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
