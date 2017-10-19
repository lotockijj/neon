package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class ActionManager {
	private List<CommandInterface> commands;

	public ActionManager() {
		commands = new ArrayList<>();
	}
	
	public void addCommand(CommandInterface command){
		commands.add(command);
	}
	
	public void process(){
		for (int i = 0; i < commands.size(); i++) {
			commands.get(i).execute();
		}
	}
	
	public void undo(){
		for(int i = 0; i < commands.size(); i++){
			commands.get(i).undo();
		}
	}
	
}
