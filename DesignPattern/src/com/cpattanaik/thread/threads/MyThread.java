/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.TimeUnit;

/**
 * @author c0p00fy
 *
 */
public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		Thread t =  new WorkerThread();
		t.start();
		t.join();
		System.out.println("Main");
	}
	
	public static class WorkerThread extends Thread {
        public void run() {
        	try {
				TimeUnit.MILLISECONDS.sleep(5000);
				System.out.println("Worker");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}
