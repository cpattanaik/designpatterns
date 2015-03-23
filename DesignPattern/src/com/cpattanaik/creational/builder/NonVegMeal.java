package com.cpattanaik.creational.builder;

public class NonVegMeal extends Meal {

	@Override
	public void addItem(Item item) {
		itemList.add(item);
	}

	@Override
	public void Show() {
		for(Item item: itemList){
			item.show();
		}
		
	}

}
