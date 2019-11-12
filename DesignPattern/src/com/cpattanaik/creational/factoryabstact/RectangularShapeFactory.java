package com.cpattanaik.creational.factoryabstact;

import com.cpattanaik.common.Rectangle;
import com.cpattanaik.common.Shape;
import com.cpattanaik.common.Square;

public class RectangularShapeFactory implements AbstarctShapeFactory{

	@Override
	public Shape createComplex() {
		return new Rectangle();
	}

	@Override
	public Shape createSimple() {
		return new Square();
	}

}
