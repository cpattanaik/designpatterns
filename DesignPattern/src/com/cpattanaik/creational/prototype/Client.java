package com.cpattanaik.creational.prototype;

import com.cpattanaik.common.CircleClone;
import com.cpattanaik.common.Sample;
import com.cpattanaik.common.ShapeClone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException{
		Client c = new Client();
		Sample s = new Sample(5);
		CircleClone cc = new CircleClone(s);
		ShapeClone[] a= c.fun(cc);
		for(int i = 0; i < a.length; i++){
			a[i].show();
			System.out.println(a[i] == a[0]);
		}
	}

	private ShapeClone[] fun(ShapeClone cc) throws CloneNotSupportedException {
		ShapeClone[] array =  new ShapeClone[5];
		for(int i = 0; i < 5; i++){
			array[i] =  cc.clone();
			Sample s = new Sample(i);
			if(array[i] instanceof CircleClone)
				((CircleClone)array[i]).setS(s);
			
		}
		return array;
	}

}
