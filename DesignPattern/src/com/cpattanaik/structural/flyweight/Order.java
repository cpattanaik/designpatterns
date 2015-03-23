package com.cpattanaik.structural.flyweight;

/*
 * This is actual heavy weight class having external dynamic properties set to the fly weight class 
 * and provide all necessary services.
 */
public class Order {
	private Coffee coffee ;
	private int tableNumber;
	
	public Order(String  flavourName, int tableNumber) {
		this.coffee = Menu.getCoffee(flavourName);;
		this.tableNumber = tableNumber;
	}

	public void serve() {
		System.out.println("Coffee: " + coffee.getCoffeeName() + " served to table " + tableNumber);
	}

}
