package br.com.imikropdv.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {
	
	public static Connection conector() {
		java.sql.Connection connection = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db_imikropdv";
		String user = "root";
		String password = "";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch(Exception e) {
			 return null;
		}
	}

}
