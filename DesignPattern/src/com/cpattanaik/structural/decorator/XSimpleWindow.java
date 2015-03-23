package com.cpattanaik.structural.decorator;
/*
 * Component class, which needs extension of its properties dynamically
 */
public class XSimpleWindow implements XWindow {

	String windowType = " Simple ";
	
	@Override
	public void show() {
		System.out.println(windowType);

	}

	public String getWindowType() {
		return windowType;
	}

	public void setWindowType(String windowType) {
		this.windowType = windowType;
	}

}
