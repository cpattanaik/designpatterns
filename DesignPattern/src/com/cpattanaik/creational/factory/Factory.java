package com.cpattanaik.creational.factory;

import com.cpattanaik.common.Circle;
import com.cpattanaik.common.NullShape;
import com.cpattanaik.common.Rectangle;
import com.cpattanaik.common.Shape;

public class Factory {

	public static Shape getInstance(String string) {
		if(string.equals("circle"))
			return new Circle();
		else if(string.equals("rectangle"))
			return new Rectangle();
		return new NullShape();
	}
}
