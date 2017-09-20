package com.patterns.command.second;

public class Pilot {
	private CockPit cockPit;
	String[] commands = {
			CockPit.TAKE_OFF, 
			CockPit.REACH_ALTITUDE,
			WingsControls.MOVE_UP,
			WingsControls.SLOW_DOWN,
			CockPit.LAND,
			CockPit.EXIT
	};
	
	public Pilot(CockPit cockPit) {
		this.cockPit = cockPit;
	}
	
	public void fly(){
		do{
			String command = getCommand();
			cockPit.execute(command);
		}while(Thread.currentThread().isInterrupted());
	}

	private String getCommand() {
		return "TAKE_OFF";
	}
	
	
}
