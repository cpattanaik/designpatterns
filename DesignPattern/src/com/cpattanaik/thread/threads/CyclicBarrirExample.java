/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.CyclicBarrier;


public class CyclicBarrirExample {
	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			@Override
			public void run() {
				System.out.println("All parties are arrived at barrier, lets play");
			}
		});

		Thread t1 = new Thread(new BarrierTask(cb), "Thread 1");
		Thread t2 = new Thread(new BarrierTask(cb), "Thread 2");
		Thread t3 = new Thread(new BarrierTask(cb), "Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}
}
