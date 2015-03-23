/*
 * One more example could be based on log level, you can decide what are the logging option you can choose.
 * Here ATM Example would be fine one to conceptualize this pattern.
 */

package com.cpattanaik.behavioral.chainofresponsibility;

public class Client {
	public static void main(String[] args){
		CashDespacher desp = getCashDespacher();
		desp.despach(10000);
	}

	private static CashDespacher getCashDespacher() {
        ThousantDespacher th = new ThousantDespacher();
        FiveHundredDespacher fh = new FiveHundredDespacher();
        HundredDespacher h =  new HundredDespacher();
        
        th.setNext(fh);
        fh.setNext(h);
        
		return th;
	}
	
}
