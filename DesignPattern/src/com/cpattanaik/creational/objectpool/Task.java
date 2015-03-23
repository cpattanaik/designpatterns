package com.cpattanaik.creational.objectpool;


public class Task implements Runnable{

	private ObjectPool<ObjectTest> pool = null;
	private int threadId;
	
	public Task(ObjectPool<ObjectTest> pool, int threadId){
		this.pool = pool;
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		ObjectTest objTest = pool.checkOut();
		System.out.println("Thread " + threadId + ": Object with no. " + objTest.getX() + " was borrowed");

		//just to simulate long work...
		for (int i = 0; i < 100000; i++) {
	    }
		
		pool.checkIn(objTest);
		System.out.println("Thread " + threadId + ": Object with no. " + objTest.getX() + " was returned");
	}
}
