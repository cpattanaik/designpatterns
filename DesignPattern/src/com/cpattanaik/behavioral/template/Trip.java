package com.cpattanaik.behavioral.template;

public abstract class Trip {
	public void start(){
		DayOne();
		DayTwo();
		DayThree();
	}
	
	public abstract void DayOne();
	public abstract void DayTwo();
	public abstract void DayThree();
	
}
