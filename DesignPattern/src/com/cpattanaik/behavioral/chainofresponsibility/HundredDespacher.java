package com.cpattanaik.behavioral.chainofresponsibility;

public class HundredDespacher extends CashDespacher{

    private static final int HUNDRED = 100;
	public HundredDespacher() {
		CashMarker = HUNDRED;
	}
	
	@Override
	public int processCash(int amount) {
		int temp = amount % 100;
		amount = amount  / 100;
		System.out.println("Despached: " + amount + " Number of  100 rupees");
		return temp;
	}

}
