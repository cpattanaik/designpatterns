package com.cpattanaik.structural.composite;

public class Client {
	public static void main(String[] args){
		int indexSpace = 1;
		Simple s1 = new Simple();
		
		Composite c1 =  new Composite();
		c1.add(s1);
		
		Composite c2 = new Composite();
		c2.add(c1);
		
		Simple s2 = new Simple();
		c2.add(s2);
		
		c2.show(indexSpace);
	}

}
