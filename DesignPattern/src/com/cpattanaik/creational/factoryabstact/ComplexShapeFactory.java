package com.cpattanaik.creational.factoryabstact;

import com.cpattanaik.common.Eclipse;
import com.cpattanaik.common.Rectangle;
import com.cpattanaik.common.Shape;

public class ComplexShapeFactory implements AbstarctShapeFactory{

	@Override
	public Shape createComplex() {
		return new Eclipse();
	}

	@Override
	public Shape createSimple() {
		return new Rectangle();
	}

}
