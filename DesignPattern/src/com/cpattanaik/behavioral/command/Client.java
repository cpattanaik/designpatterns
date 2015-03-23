package com.cpattanaik.behavioral.command;
/*
 * command pattern is a behavioral design pattern in which an object is used to represent and encapsulate 
 * all the information needed to call an action method of a class at a later time. This information includes 
 * the method name, the object that owns the method and values for the method parameters.
 *  
 */
public class Client {
	
	public static void main(String[] args){
		Light light = new Light();
		
		LightUpCommand up = new LightUpCommand(light);
		LightDownCommand down =  new LightDownCommand(light);
		
		Operator operator =  new Operator();
		operator.add(up);
		operator.add(down);
		operator.operate();
	}
}
