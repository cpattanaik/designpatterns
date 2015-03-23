package com.cpattanaik.creational.singleton;

public class Singleton {
	private static Singleton sInst = null;
	private Singleton(){}

	public static Singleton getInstance() {
		if(sInst == null)
			synchronized(Singleton.class){
			if(sInst == null)
				sInst =  new Singleton();
			}
		return sInst;
	}

	public void logEvent() {
		System.out.println("Logger");
		
	}
}
