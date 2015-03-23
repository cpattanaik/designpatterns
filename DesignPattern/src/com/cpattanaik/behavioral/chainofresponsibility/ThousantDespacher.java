package com.cpattanaik.behavioral.chainofresponsibility;

public class ThousantDespacher extends CashDespacher{
    private static final int THOUSAND = 1000;
	public ThousantDespacher() {
		CashMarker = THOUSAND;
	}

	@Override
	public int processCash(int amount) {
		int temp = amount % 1000;
		amount = amount  / 1000;
		System.out.println("Despached: " + amount + " Number of 1000 rupees");
		return temp;
	}

}
