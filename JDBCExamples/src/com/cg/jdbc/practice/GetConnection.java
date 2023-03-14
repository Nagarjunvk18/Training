package com.cg.jdbc.practice;

import java.sql.*;

public class GetConnection {

	public static void main(String[] args) throws Exception{
		Connection conn = null;
		Statement stmt = null;
		String DB_URL;
		String USER;
		String PASS;
		DB_URL = "jdbc:mysql://localhost/country";
		USER = "root";
		PASS = "Nag@2001";
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "insert into stateslist values(1,'AndhraPradesh','Amaravathi'),(2,'TamilNadu','Chennai'),(3,'Karnataka','Bangalore')";
			int rs = stmt.executeUpdate(sql);
			// STEP 5: Extract data from result set
//			while (rs.next()) {
//				// Retrieve by column name
//				int id = rs.getInt("id");
//				int age = rs.getInt("age");
//				String first = rs.getString("first");
//			}
			if (rs > 0) {
				System.out.println(rs + " row/s inserted successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) { 

					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}
}
