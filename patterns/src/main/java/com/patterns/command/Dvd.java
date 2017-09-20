package com.patterns.command;

public class Dvd implements Command {

	@Override
	public void on() {
		System.out.println("Dvd ON...");
	}

	@Override
	public void off() {
		System.out.println("Dvd OFF...");
	}


}
