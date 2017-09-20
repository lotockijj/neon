package com.patterns.objectauthenticator;

public class EmployeeManager {

	public String getData(String department, String kind) throws Exception{
		AuthManager manager = new AuthManager();
		EleksDocumentation authenticator = manager.getAccessAuthenticator("1111");
		return authenticator.getData(department, kind);
	}
}
