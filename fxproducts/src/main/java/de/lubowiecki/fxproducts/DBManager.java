package de.lubowiecki.fxproducts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	private static final String URL = "jdbc:sqlite:data.db";
	
	public static Connection connect() throws SQLException {
		return DriverManager.getConnection(URL);
	}
}
