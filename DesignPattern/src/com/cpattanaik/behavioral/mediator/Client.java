package com.cpattanaik.behavioral.mediator;

public class Client {
	public static void main(String[] args){
		Mediator mediator = new Mediator();
		
		User user1 = new User(mediator, "Gopal");
		User user2 = new User(mediator, "Alok");
		
		user1.sendMessage(user2, "hi");
		user2.sendMessage(user1, "Hello");
	}

}
