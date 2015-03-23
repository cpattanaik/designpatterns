package com.cpattanaik.creational.factorymethod;

import com.cpattanaik.common.Shape;


public class Client {
  
	public static void main(String args[]){
		ShapeFactory f= new CircleFactory();
		Shape p = f.getShape();
		p.show();

		f= new RectangleFactory();
		p = f.getShape();
		p.show();
		
	}
}
