package com.cpattanaik.creational.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Meal {
	protected List<Item> itemList =  new ArrayList<Item>();
	
	public abstract void addItem(Item item);
	public abstract void Show();
}
