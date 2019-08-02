package com.cpattanaik.thread.threads;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMyRecursiveTask {
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		MyRecursiveTask myRecursiveTask = new MyRecursiveTask(128);
		long mergedResult = forkJoinPool.invoke(myRecursiveTask);
		System.out.println("mergedResult = " + mergedResult);    
	}
}
