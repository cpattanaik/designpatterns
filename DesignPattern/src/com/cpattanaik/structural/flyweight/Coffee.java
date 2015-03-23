package com.cpattanaik.structural.flyweight;
/*
 * This is actual fly weight class, which is created one for 
 * each type with intrinsic properties set, but the extra 
 * properties,  i.e the dynamic properties will be added latter 
 */
public class Coffee {
	private String coffeeName = null;

	public Coffee(String flavourName) {
		System.out.println("Constructor called");
		this.coffeeName = flavourName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	

}
