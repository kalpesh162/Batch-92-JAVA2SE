package com.utilty;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	private String url;
	private String driverClass;
	private String username;
	private String password;

	@SuppressWarnings("unused")
	private DBUtility() {

		try {
			FileInputStream fileInputStream = new FileInputStream("db.properties");

			if (fileInputStream == null) {
				System.err.println("FILE NOT FOUND  " + "db.properties");
				throw new RuntimeException("File Not Found");
			}

			Properties properties = new Properties();
			properties.load(fileInputStream);
			url = properties.getProperty("db.url");
			driverClass = properties.getProperty("db.driver_class");
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");

		} catch (Exception e) {
			System.out.println("---->  " + e);
		}

	}

	public static Connection getDBConnection() {
		Connection con = null;
		DBUtility instance = new DBUtility();
		try {
			Class.forName(instance.driverClass);
			con = DriverManager.getConnection(instance.url, instance.username, instance.password);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("--->" + e);
		}
		return con;
	}

}
