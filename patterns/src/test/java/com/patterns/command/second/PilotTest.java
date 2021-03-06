package com.patterns.command.second;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PilotTest {

	@Test
	public void test() {
		WingsControls wingsControls = new WingsControls();
		
		List<CommandController> commandControllers = new ArrayList<>();
		commandControllers.add(wingsControls);
		CockPit cockPit = new CockPit(commandControllers);
		
		Pilot pilot = new Pilot(cockPit);
		pilot.fly();
		
	}

}
