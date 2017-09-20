package com.patterns.objectauthenticator;

public class UnAuthorizedUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnAuthorizedUserException(String message){
		super(message);
	}
}
