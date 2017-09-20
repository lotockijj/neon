package com.patterns.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseData implements Data{

	private static String dbURL2 = "jdbc:derby:data6;create=true;";
	private static String tableName = "data6";
	// jdbc Connection
	private static Connection conn = null;
	private static Statement stmt = null;

	public boolean writeData(String str){
		boolean result = false;
		createConnection();
		insertMessage(1, str);
		shutdown();
		return result;
	}

	public void insertMessage( int id, String str) {
		try(PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO " + tableName + " VALUES (?, ?)")){
			ps.setInt(1, id);
			ps.setString(2, str);
			ps.executeUpdate();
		}
		catch (SQLException sqlExcept){
			sqlExcept.printStackTrace();
		}
	}

	private void createConnection() {
		try{
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			//Get a connection
			conn = DriverManager.getConnection(dbURL2); 
		}
		catch (Exception except){
			except.printStackTrace();
		}
	}

	private void shutdown() {
		try{
			if (stmt != null){
				stmt.close();
			}
			if (conn != null){
				DriverManager.getConnection(dbURL2 + ";shutdown=true");
				conn.close();
			}           
		}
		catch (SQLException sqlExcept) {
			sqlExcept.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private void createTable(){
		try{
			stmt = conn.createStatement();
			stmt.execute("create table data6 ("
					+ "id int not null generated by default as identity "
					+ "(start with 1, increment by 1), "
					+ "str varchar(255))");
			stmt.close();
		}
		catch (SQLException sqlExcept)
		{
			sqlExcept.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		DataBaseData start = new DataBaseData();
//		start.createConnection();
//		start.createTable();
//		start.insertMessage(1, "Hello World Roman :) ");
//		System.out.println("Syccessfully inserted.");
//	}
}
