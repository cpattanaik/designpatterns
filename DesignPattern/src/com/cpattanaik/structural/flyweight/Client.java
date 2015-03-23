package com.cpattanaik.structural.flyweight;

public class Client {
	public static void main(String[] args){
		CoffeShop shop = new CoffeShop();
		shop.takeOrder("Capucino", 1);
		shop.takeOrder("Expreso", 2);
		shop.takeOrder("Capucino", 4);
		shop.takeOrder("Expreso", 7);	
		
		shop.serve();
	}
		

}
