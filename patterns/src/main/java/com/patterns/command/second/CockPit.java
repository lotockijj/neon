package com.patterns.command.second;

import java.util.Iterator;
import java.util.List;

public class CockPit implements CommandController {
	private List<CommandController> commandCotrols;
	
	public final static String TAKE_OFF = "TAKE_OFF";
	public final static String LAND = "LAND";
	public final static String REACH_ALTITUDE = "REACH_ALTITUDE";
	public final static String EXIT = "EXIT";
	
	public CockPit(List<CommandController> commandCotrols) {
		commandCotrols.add(this);
		this.commandCotrols = commandCotrols;
	}

	@Override
	public String execute(String command) {
		Iterator<CommandController> commandIterator = this.commandCotrols.iterator();
		while(commandIterator.hasNext()){
			CommandController commandController = commandIterator.next();
			if(commandController instanceof CockPit){
				switch(command){
				case CockPit.TAKE_OFF :
					this.takeOf();
					break;
				case CockPit.REACH_ALTITUDE :
					this.reachAltitude();
					break;
				case CockPit.LAND :
					this.land();
					break;
				case CockPit.EXIT :
					System.exit(1);
					break;
				}
			} else if(commandController.canHandle(command)){
				commandController.execute(command);
			}
		}
		return null;
	}
	
	@Override
	public boolean canHandle(String command) {
		if(TAKE_OFF.equals(command) || LAND.equals(command)
				|| REACH_ALTITUDE.equals(command) || EXIT.equals(command)){
			return true;
		}
		return false;
	}

	private String land() {
		return "Land...";
	}

	private String reachAltitude() {
		return "Reach altitude...";
	}

	private String  takeOf() {
		return "Take of...";
	}


}
