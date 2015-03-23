package com.cpattanaik.creational.factoryabstact;

import com.cpattanaik.common.Shape;

public class Client {
	public static void main(String args[]){
		AbstarctShapeFactory asf =  FactoryMaker.getFactory("complex");
	    Shape s = asf.createComplex();
	    s.show();
	}

}
