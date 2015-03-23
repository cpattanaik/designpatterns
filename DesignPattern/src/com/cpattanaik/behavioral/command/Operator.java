package com.cpattanaik.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	List<Command> commands = new ArrayList<Command>();
	
	public void add(Command command){
		commands.add(command);
	}
	
	public void operate(){
		for(Command c:  commands){
			c.execute();
		}
	}

}
