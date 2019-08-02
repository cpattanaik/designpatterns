package com.cpattanaik.thread.threads;

import java.util.concurrent.BlockingQueue;


public class Worker implements Runnable {
	private BlockingQueue<Runnable> queue; 	
	public Worker(BlockingQueue<Runnable> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {	
		while(true){
			try {
				Runnable run =  queue.take();
				run.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
