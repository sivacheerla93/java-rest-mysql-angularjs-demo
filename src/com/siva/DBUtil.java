package com.siva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	// note: need to download mysql-connector jar file and put it in jre/lib/ext
	// folder
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// for mysql connector 5.1, Class is com.mysql.jdbc.Driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "9866850403");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
