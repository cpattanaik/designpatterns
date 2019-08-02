package com.cpattanaik.thread.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class TreadPool {
	private BlockingQueue<Runnable> queue; 
	private Worker[] workers;

	TreadPool(int poolSize, int queueSize){
		queue = new LinkedBlockingQueue<Runnable>(queueSize);
		workers =  new Worker[poolSize];
		
		for(int i=0; i < poolSize; i++){
			workers[i] = new Worker(queue);
			new Thread(workers[i]).start();
		}
	}
	
	public void execute(Runnable r) throws Exception{
		queue.put(r);
	}
	
	
}
