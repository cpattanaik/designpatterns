package com.cpattanaik.behavioral.state;

import java.util.concurrent.TimeUnit;

public class Client {
	public static void main(String[] args) throws InterruptedException  
    { 
		Context context = new Context();
		while(true){
			context.changeState();
			TimeUnit.SECONDS.sleep(1);
		}
    }
}
