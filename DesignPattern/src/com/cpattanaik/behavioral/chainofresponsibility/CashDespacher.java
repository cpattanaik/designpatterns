package com.cpattanaik.behavioral.chainofresponsibility;

public abstract class CashDespacher {
	protected int CashMarker;
	protected CashDespacher next = null ;
	public void setNext(CashDespacher next){
		this.next = next;
	}
	
	public void despach(int amount){
		if(amount % 100 != 0){
			System.out.println("Allowed amount should be multiple of 100");
		}
		
		if(amount >= CashMarker){
			amount = processCash(amount);
		}
		
		if(next != null){
			next.despach(amount);
		}	
	}
	
	public abstract int processCash(int amount);
		
	
}
