package com.patterns.objectauthenticator;

public class Authenticator implements EleksDocumentation {
	private String accessCode;
	private String clientCode;
	
	public Authenticator(String accessCode, String clientCode) {
		this.accessCode = accessCode;
		this.clientCode = clientCode;
	}

	@Override
	public String getData(String department, String kind) {
		if(clientCode.equals(accessCode)){
			Employee employee = new Employee();
			return employee.getData(department, kind);
		} else {
			try {
				throw new UnAuthorizedUserException("Bad password.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
