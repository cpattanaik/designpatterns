package com.cpattanaik.creational.singleton;

import java.io.Serializable;

public class SingletonNew implements Serializable{

	private static final long serialVersionUID = 7732393153962125567L;

	private SingletonNew(){}
    
    private static class SingletonHelper{
        private static final SingletonNew instance = new SingletonNew();
    }
     
    public static SingletonNew getInstance(){
        return SingletonHelper.instance;
    }

	public void logEvent() {
		System.out.println("Logger");
		
	}

}
