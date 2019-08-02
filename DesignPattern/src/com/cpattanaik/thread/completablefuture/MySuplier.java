/**
 * 
 */
package com.cpattanaik.thread.completablefuture;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author c0p00fy
 *
 */
public class MySuplier implements Supplier<String> {
	private String value = "";
	public MySuplier(String value) {
		this.value = value;
	}

	@Override
	public String get() {
		 try {
	            TimeUnit.MILLISECONDS.sleep(1000);
	            if(Integer.valueOf(value) % 5 == 0){
	            	throw new Exception("Error");
	            }
	        } catch (Exception e) {
	            throw new IllegalStateException(e);
	        }
	        return "Result: "+ value;
	}
}
