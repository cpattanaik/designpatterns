package com.cpattanaik.creational.factoryabstact;

public class FactoryMaker {
	public static AbstarctShapeFactory getFactory(String type){
		if(type.equals("simple")){
			return new CircularShapeFactory();
		}else if(type.equals("complex")){
			return new RectangularShapeFactory();
		}else{
			return null;
		}	
	}
}
