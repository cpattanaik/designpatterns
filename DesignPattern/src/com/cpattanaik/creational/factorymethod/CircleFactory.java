package com.cpattanaik.creational.factorymethod;

import com.cpattanaik.common.Circle;
import com.cpattanaik.common.Shape;

public class CircleFactory extends ShapeFactory {

	@Override
	protected Shape createShape() {
		return new Circle();
	}

}
