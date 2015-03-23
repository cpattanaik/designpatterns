package com.cpattanaik.creational.builder;

public class Builder {
	public Meal getVegMeal(){
		Meal meal = new VegMeal();
		meal.addItem(new Dalma());
		meal.addItem(new Bhata());
		meal.addItem(new vegCurry());
		return meal;
	}

	
	public Meal getNonVegMeal(){
		Meal meal = new NonVegMeal();
//		meal.add(new chickenMeal());
//		meal.add(new Bhata());
//		meal.add(new Dalma());
		return meal;
	}
}
