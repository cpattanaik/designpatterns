package com.cpattanaik.creational.factory;

import com.cpattanaik.common.Shape;

public class Client {
	public static void main(String str[]){
		Shape p = Factory.getInstance("circle");
		p.show();
		
		p = Factory.getInstance("ID2");
		p.show();
	}

}
