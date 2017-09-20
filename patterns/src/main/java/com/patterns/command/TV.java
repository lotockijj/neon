package com.patterns.command;

public class TV implements Command{
	
	public void on(){
		System.out.println("TV ON...");
	}
	
	public void off(){
		System.out.println("TV OFF...");
	}
}
