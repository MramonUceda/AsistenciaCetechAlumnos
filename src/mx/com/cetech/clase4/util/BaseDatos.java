package mx.com.cetech.clase4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {

	private final String DB_DRIVER = "com.mysql.jdbc.Driver";// MYSQL
	private final String DB_CONNECTION = "jdbc:mysql://localhost:3306/cetech"; //jdbc:TIPOBD://IPBD:PUERTO/NOMBREBD
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "12345678";
	
	public Connection getDBConnection()
	{
		Connection dbConnection = null;
		try
		{
		Class.forName(DB_DRIVER);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Error al cargar el Driver");
			e.printStackTrace();
		}//fin catch
		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD... Intente mas tarde");
			e.printStackTrace();
		}
		
		return dbConnection;
	}//fin get
	
}//fin clase
