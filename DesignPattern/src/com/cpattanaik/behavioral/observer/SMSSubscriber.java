package com.cpattanaik.behavioral.observer;

public class SMSSubscriber implements Subscriber {

	public SMSSubscriber(NewsPublisher publisher) {
		publisher.register(this);
		
	}

	@Override
	public void subscribe(String msg) {
		System.out.println("Email Subscribed Message: " + msg);
		
	}

}
