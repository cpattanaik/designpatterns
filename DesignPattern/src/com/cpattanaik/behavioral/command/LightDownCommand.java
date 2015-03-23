package com.cpattanaik.behavioral.command;

public class LightDownCommand implements Command {
	Light light = null;
	
	public LightDownCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.off();
		
	}

}
