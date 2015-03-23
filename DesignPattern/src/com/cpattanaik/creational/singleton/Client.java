package com.cpattanaik.creational.singleton;

public class Client {
	public static void main(String[] args){
		SingletonNew sObject = SingletonNew.getInstance();
		sObject.logEvent();
		
		SingletonNew sObject1 = SingletonNew.getInstance();
		sObject.logEvent();
		
		//Proof both the objects are same
		System.out.println(sObject == sObject1);
		
	}
}
				