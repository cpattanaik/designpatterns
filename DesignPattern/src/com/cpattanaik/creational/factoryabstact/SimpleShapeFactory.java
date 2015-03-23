package com.cpattanaik.creational.factoryabstact;

import com.cpattanaik.common.Circle;
import com.cpattanaik.common.Shape;
import com.cpattanaik.common.Square;

public class SimpleShapeFactory implements AbstarctShapeFactory{

	@Override
	public Shape createComplex() {
		return new Circle();
		
	}

	@Override
	public Shape createSimple() {
		return new Square();
		
	}

}
