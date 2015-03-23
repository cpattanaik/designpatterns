package com.cpattanaik.behavioral.mediator;

public class Mediator {
	public void send(User user, User user2, String msg) {
		user2.recieveMessage(user, msg);
	}
	
}
