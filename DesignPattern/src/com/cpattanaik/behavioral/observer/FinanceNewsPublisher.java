package com.cpattanaik.behavioral.observer;

import java.util.ArrayList;

public class FinanceNewsPublisher implements NewsPublisher {
    private ArrayList<Subscriber> subscriberList =  new ArrayList<Subscriber>();
	
	@Override
	public void register(Subscriber subscriber) {
		subscriberList.add(subscriber);
		
	}

	@Override
	public void publish(String msg) {
		System.out.println("Finace News Published: " + msg);
		for(Subscriber subscriber: subscriberList){
			subscriber.subscribe(msg);
		}
	}
	
	

}
