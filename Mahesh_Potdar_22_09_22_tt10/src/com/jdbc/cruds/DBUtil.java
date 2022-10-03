package com.jdbc.cruds;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static Connection getDBConnection() {

		Connection conn = null;

		try {
			FileReader reader = new FileReader("database.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			String driverClass = prop.getProperty("driverClass");
		
			String url = prop.getProperty("url");
		
			String username = prop.getProperty("username");
		
			String password = prop.getProperty("password");
			
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url,username,password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
