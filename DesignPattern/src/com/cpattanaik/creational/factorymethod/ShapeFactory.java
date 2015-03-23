package com.cpattanaik.creational.factorymethod;

import com.cpattanaik.common.Shape;

public abstract class ShapeFactory {
	protected abstract Shape createShape();
	
	Shape getShape(){
		return this.createShape();
	}

}
