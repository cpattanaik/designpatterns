/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEventOdd {
	public static void main(String[] args) {
		ExecutorService executer = Executors.newFixedThreadPool(2);
		EvenOdd evenOdd =  new EvenOdd();
		Runnable even =  new PrintEven(evenOdd);
		Runnable odd =  new PrintOdd(evenOdd);
		executer.execute(even);
		executer.execute(odd);
	}
}
