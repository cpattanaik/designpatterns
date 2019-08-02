/**
 * 
 */
package com.cpattanaik.thread.threads;

/**
 * @author c0p00fy
 *
 */
public class TreadPoolClient {
	public static void main(String[] args) throws Exception {
		TreadPool pool = new TreadPool(5, 5); 
		
		for(int i=0; i< 100000; i++){
			pool.execute(new Runnable(){
	
				@Override
				public void run() {
				   System.out.println(Thread.currentThread().getName());
				}
			});
		}
	}
}
