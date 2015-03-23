package com.cpattanaik.common;

public class CircleClone extends ShapeClone{

	private Sample s = null;
	public CircleClone(Sample s){
		System.out.println("Constructor Called");
		this.s = s;
	}
	
	public Sample getS() {
		return s;
	}

	public void setS(Sample s) {
		this.s = s;
	}

	@Override
	public ShapeClone clone() throws CloneNotSupportedException {
		return (ShapeClone)super.clone();
	}
	
	@Override
	public void show() {
		System.out.println("CloneCircle: " + s.getX());
		
	}

}
