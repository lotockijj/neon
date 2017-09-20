package com.patterns.command;

import org.junit.Test;

public class CommandInterfaceTest {

	@Test
	public void test() {
		Command light = new Light();
		Command tv = new TV();
		Command dvd = new Dvd();
		CommandInterface command = new SwitchOn(light);
		CommandInterface command2 = new SwitchOff(light);
		CommandInterface command3 = new SwitchOn(tv);
		CommandInterface command4 = new SwitchOff(tv);
		CommandInterface command5 = new SwitchOn(dvd);
		CommandInterface command6 = new SwitchOff(dvd);
		ActionManager action = new ActionManager();
		action.addCommand(command);
		action.addCommand(command2);
		action.addCommand(command3);
		action.addCommand(command4);
		action.addCommand(command5);
		action.addCommand(command6);
		action.process();
	}

}
