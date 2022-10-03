package com.jdbc.demo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;



public class JDBC_Demo {

	public static void main(String[] args) {
				
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
			Connection conn =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","Welcome@2022" );
			
			Statement statement =   conn.createStatement();
			String query = "insert into Employees values(100, 'Pooja', 10000, 'Pune') "; 
			int count = statement.executeUpdate(query);
			System.out.println(count  + "inserted one record.");
		
			
//			String updateQuery = "update Employees set empname= 'Ajay' where empid= 102 ";
//			int count = statement.executeUpdate();
//			System.out.println(updateQuery);
			
			
//			String deleteQuery = "delete from Employees where empid = 204";
//			int count = statement.executeUpdate(deleteQuery);
//			System.out.println(count + "deleted one record by empid.");
//			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
