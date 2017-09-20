package com.patterns.objectauthenticator;

public class Employee implements EleksDocumentation {

	@Override
	public String getData(String department, String kind) {
		return "Departmen: " + department + ". Kind: " + kind + ".";
	}

}
