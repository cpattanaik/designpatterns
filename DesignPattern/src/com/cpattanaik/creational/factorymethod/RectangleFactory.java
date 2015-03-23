package com.cpattanaik.creational.factorymethod;

import com.cpattanaik.common.Rectangle;
import com.cpattanaik.common.Shape;

public class RectangleFactory extends ShapeFactory {

	@Override
	protected Shape createShape() {
		return new Rectangle();
	}

}
