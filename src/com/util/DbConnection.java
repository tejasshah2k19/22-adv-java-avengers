package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

	public static Connection getConnection() {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjavaavengers";
		String userName = "root";
		String password = "root";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password);
			// users -- userid firstname email password

			// insert into users (firstname,email,password) values ('a','a','a');
			// Statement
			// PreparedStatement
			// CallableStatement***

			System.out.println("done...");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
