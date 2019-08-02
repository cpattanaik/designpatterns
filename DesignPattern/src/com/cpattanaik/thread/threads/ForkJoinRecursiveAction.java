/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.ForkJoinPool;

/**
 * @author c0p00fy
 *
 */
public class ForkJoinRecursiveAction {
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		MyRecursiveAction myRecursiveAction = new MyRecursiveAction(128);
		forkJoinPool.invoke(myRecursiveAction);
	}
}
