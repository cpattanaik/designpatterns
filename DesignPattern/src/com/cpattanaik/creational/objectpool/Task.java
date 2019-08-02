package com.cpattanaik.creational.objectpool;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	private ObjectPool<ObjectTest> pool = null;
	private int threadId;
	
	public Task(ObjectPool<ObjectTest> pool, int threadId){
		this.pool = pool;
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		try{
			while(true){
			ObjectTest objTest = pool.checkOut();
			System.out.println("Thread " + threadId + ": Object with no. " + objTest.getX() + " was borrowed");

			//TimeUnit.SECONDS.sleep(1);
		
			pool.checkIn(objTest);
			System.out.println("Thread " + threadId + ": Object with no. " + objTest.getX() + " was returned");
			}
		}catch(Exception e){
			//Handle Exception
		}
	}
}
