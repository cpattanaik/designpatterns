package com.cpattanaik.creational.builder;

public class Client {
	public static void main(String[] args){
		Builder builder =  new Builder();
		Meal meal = builder.getVegMeal();
		meal.Show();
	}
	
}
