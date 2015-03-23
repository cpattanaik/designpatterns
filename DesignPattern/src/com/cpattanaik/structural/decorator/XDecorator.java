package com.cpattanaik.structural.decorator;

public abstract class XDecorator implements XWindow{
	private XWindow xw = null;

	public XDecorator(XWindow xw){
		this.xw = xw;
	}
	
	@Override
	public void show() {
		xw.show();
		
	}
	

}
