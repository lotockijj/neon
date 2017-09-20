package com.patterns.command;

public class Light implements Command{
	
	public void on(){
		System.out.println("Light ON...");
	}
	
	public void off(){
		System.out.println("Light OFF...");
	}
}
