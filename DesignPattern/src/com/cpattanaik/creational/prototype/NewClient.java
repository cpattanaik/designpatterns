package com.cpattanaik.creational.prototype;

public class NewClient {
	public static void main(String[] args) {
		Person p = new Man();
		fun(p);
	}

	private static void fun(Person p) {
		Person nP = p.clon();
		nP.show();
	}
	
}
