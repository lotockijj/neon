package com.patterns.command;

public class SwitchOn implements CommandInterface {
	private Command command;
	
	public SwitchOn(Command command) {
		this.command = command;
	}

	@Override
	public void execute() {
		command.on();
	}

	@Override
	public void undo() {
		command.off();
	}

}
