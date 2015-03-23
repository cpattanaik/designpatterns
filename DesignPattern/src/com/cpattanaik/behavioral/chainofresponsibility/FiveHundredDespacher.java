package com.cpattanaik.behavioral.chainofresponsibility;

public class FiveHundredDespacher extends CashDespacher{

    private static final int FIVEHUNDRED = 500;
	public FiveHundredDespacher() {
		CashMarker = FIVEHUNDRED;
	}

	@Override
	public int processCash(int amount) {
		int temp = amount % 500;
		amount = amount  / 500;
		System.out.println("Despached: " + amount + " Number of  500 rupees");
		return temp;
	}

}
