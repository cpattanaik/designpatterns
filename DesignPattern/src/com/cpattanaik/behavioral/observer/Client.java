package com.cpattanaik.behavioral.observer;
/*
 * Model View Controller Pattern - The observer pattern is used in the model view controller (MVC) architectural pattern. 
 * In MVC the this pattern is used to decouple the model from the view. View represents the Observer and the model is the 
 * Observable object.
 * Event management - This is one of the domains where the Observer patterns is extensively used. Swing and .Net are 
 * extensively using the Observer pattern for implementing the events mechanism.
 *
 */
public class Client {
	public static void main(String[] args){
		NewsPublisher publisher = new FinanceNewsPublisher();
		
		@SuppressWarnings("unused")
		Subscriber esubscriber =  new EmailSubscriber(publisher);
		@SuppressWarnings("unused")
		Subscriber psubscriber = new SMSSubscriber(publisher);
		
		publisher.publish("JPMorgan Stock Increased 5%");
		
		publisher.publish("JPMorgan Selling IPO on 12th Mar 2015");
	}

}
