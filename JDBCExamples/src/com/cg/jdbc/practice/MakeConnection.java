package com.cg.jdbc.practice;

import java.sql.*;

public class MakeConnection {

	public static Connection getConnection() {
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
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return conn;
	}

}