package com.cpattanaik.behavioral.observer;

public class EmailSubscriber implements Subscriber {

	public EmailSubscriber(NewsPublisher publisher) {
		publisher.register(this);
	}

	@Override
	public void subscribe(String msg) {
		System.out.println("Email Subscribed Message: " + msg);

	}

}
