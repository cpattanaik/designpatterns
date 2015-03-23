package com.cpattanaik.creational.factoryabstact;

public class FactoryMaker {
	public static AbstarctShapeFactory getFactory(String type){
		if(type.equals("simple")){
			return new SimpleShapeFactory();
		}else if(type.equals("complex")){
			return new ComplexShapeFactory();
		}else{
			return null;
		}	
	}
}
