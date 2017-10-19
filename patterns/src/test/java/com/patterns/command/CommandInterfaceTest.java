package com.patterns.command;

import org.junit.Test;

public class CommandInterfaceTest {

	@Test
	public void test() {
		Command light = new Light();
		Command tv = new TV();
		Command dvd = new Dvd();
		CommandInterface command1 = new SwitchOn(light);
		CommandInterface command3 = new SwitchOn(tv);
		CommandInterface command5 = new SwitchOn(dvd);
		System.out.println("Command 5 execute: ");
		command5.execute();
		System.out.println("Command 5 undo");
		command5.undo();
		ActionManager action = new ActionManager();
		action.addCommand(command1);
		action.addCommand(command3);
		action.addCommand(command5);
		action.process();
		System.out.println("============================");
		action.undo();
	}

}
