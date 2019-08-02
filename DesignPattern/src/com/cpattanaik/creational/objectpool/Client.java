package com.cpattanaik.creational.objectpool;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
	Random rn = new Random();
	ExecutorService executor = Executors.newFixedThreadPool(7);    //Five treads will be created
	
	ObjectPool<ObjectTest> pool = new ObjectPool<ObjectTest>(10){
		@Override
		public ObjectTest create() {
			return new ObjectTest(rn.nextInt(100));
		}  
	};
	
	public static void main(String[] args){
        Client c = new Client();
		c.executor.execute(new Task(c.pool,1));
		c.executor.execute(new Task(c.pool,2));
		c.executor.execute(new Task(c.pool,3));
		c.executor.execute(new Task(c.pool,4));
		c.executor.execute(new Task(c.pool,5));
		c.executor.execute(new Task(c.pool,6));
		c.executor.execute(new Task(c.pool,7));
		c.executor.shutdown();
		try {
		     c.executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		     e.printStackTrace();
		}
	}
}
