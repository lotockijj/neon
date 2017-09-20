package com.patterns.command.second;

public interface CommandController {
	public String execute(String command);
	public boolean canHandle(String command);
}
