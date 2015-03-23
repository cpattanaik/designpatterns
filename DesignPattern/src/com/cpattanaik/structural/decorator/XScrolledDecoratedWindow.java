package com.cpattanaik.structural.decorator;

public class XScrolledDecoratedWindow extends XDecorator {

	private String decoratorType = " Scrolled ";
	
	public XScrolledDecoratedWindow(XWindow xw) {
		super(xw);
	}
	
	public void show(){
		System.out.print(decoratorType);
		super.show();
	}
	
	

}
