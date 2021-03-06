package com.patterns.objectauthenticator;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AuthManager {

	private Connection myConn;

	public AuthManager() throws Exception{
		Properties props = new Properties();
		props.load(new FileInputStream("mysql.properties"));
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		//connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
	}

	public String getCode(){
		int result = -1;
		try(Statement stmt = myConn.createStatement();
				ResultSet myRs = stmt.executeQuery("select code from employee where id=1;")){
			myRs.next();
			result = myRs.getInt("code");
		} catch (SQLException e){
			System.out.println(e);
		}
		return Integer.toString(result);
	}
	
	public EleksDocumentation getAccessAuthenticator(String clientCode){
		return new Authenticator(getCode(), clientCode);
	}
	
	
}
