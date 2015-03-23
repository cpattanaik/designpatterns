package com.cpattanaik.structural.flyweight;
/*
 * This is an application class to simulate coffee shop.
 */
import java.util.LinkedList;
import java.util.List;

public class CoffeShop {
	List<Order> orders = new LinkedList<Order>();
    
    public void takeOrder(String flavourName, int TableNumber){
    	Order order = new Order(flavourName, TableNumber);   
    	orders.add(order);
    }
    
    public void serve(){
    	for(Order order: orders){
    		order.serve();
    	}
    }
    
}
