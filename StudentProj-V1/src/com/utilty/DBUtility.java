package com.utilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	private final static String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/jap92";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("--->" + e);
		}
		return con;
	}

}
