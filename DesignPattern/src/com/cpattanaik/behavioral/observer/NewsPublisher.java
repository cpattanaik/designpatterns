package com.cpattanaik.behavioral.observer;

public interface NewsPublisher {

	void register(Subscriber smsSubscriber);

	void publish(String string);

}
