package com.cpattanaik.behavioral.command;

public class LightUpCommand implements Command{

	Light light = null;
	
	public LightUpCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
		
	}
	

}
