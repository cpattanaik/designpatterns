package com.cpattanaik.creational.prototype;

public class Man implements Person{

	@Override
	public Person clon() {
		return new Man();
	}
	
	public void show(){
		System.out.println("Cloned");
	}
	
}
