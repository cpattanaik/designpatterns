package com.cpattanaik.structural.decorator;


public class Client {
	public static void main(String[] args){
		System.out.println("Simple Object: \n");
		XWindow w =  new XSimpleWindow();
		w.show();
		
		System.out.println("\nDecorated Object: \n");
		w = new XScrolledDecoratedWindow(w);
		w.show();
		
	}

}
