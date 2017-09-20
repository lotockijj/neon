package com.patterns.command.second;

public class WingsControls implements CommandController {
	private Wings wings;
	public final static String MOVE_UP = "MOVE_UP";
	public final static String SLOW_DOWN = "SLOW_DOWN";
	
	public WingsControls(){
		wings = new Wings();
	}
	
	@Override
	public String execute(String command) {
		switch(command) {
		case MOVE_UP :
			wings.moveUp();
			break;
		case SLOW_DOWN :
			wings.moveDown();
		}
		return null;
	}

	@Override
	public boolean canHandle(String command) {
		if(command.equals(MOVE_UP)||
			command.equals(SLOW_DOWN)){
			return true;
		}
		return false;
	}

}
