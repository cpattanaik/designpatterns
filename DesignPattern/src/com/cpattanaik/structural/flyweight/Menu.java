package com.cpattanaik.structural.flyweight;
/*
 * This is just like factory class gives reference of the fly weight object.
 */
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static Map<String, Coffee> coffeeMap = new HashMap<String, Coffee>();
	
	public static Coffee getCoffee(String flavourName) {
		if(!coffeeMap.containsKey(flavourName))
			coffeeMap.put(flavourName, new Coffee(flavourName));
		return coffeeMap.get(flavourName);
	}
	
}
