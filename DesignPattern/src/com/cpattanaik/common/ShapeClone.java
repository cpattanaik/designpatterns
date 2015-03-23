package com.cpattanaik.common;

public abstract class ShapeClone implements Cloneable{
	public ShapeClone clone() throws CloneNotSupportedException{ 
		return (ShapeClone)super.clone();
	}
	public void show(){};
}
