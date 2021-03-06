package com.patterns.command;

public class SwitchOff implements CommandInterface {
	private Command command;
	
	public SwitchOff(Command command) {
		this.command = command;
	}

	@Override
	public void execute() {
		command.off();
	}

	@Override
	public void undo() {
		command.on();
	}

}
