package com.cpattanaik.creational.builder;



public class VegMeal extends Meal {

	@Override
	public void addItem(Item item) {
		itemList.add(item);
	}

	@Override
	public void Show() {
		System.out.println("Veg Meal:");
		for(Item item: itemList){
			item.show();
			System.out.print("  ");
		}
		
	}
	

}
