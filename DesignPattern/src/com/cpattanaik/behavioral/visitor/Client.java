package com.cpattanaik.behavioral.visitor;
/* 
 * You want to visit a class for some analytics cause. visitor pattern will decouple the analytics 
 * logic from actual context class  and do the complex analytics work outside.
 */

public class Client {
	public static void main(String[] args){
		
		IVisitor vr =  new VisitorImpl();
		IVisitable vl = new VisitableImpl();
		
		// Here you can take one array of objects and can visit them.
		vl.accept(vr);
	    vr.displayResult();
	}

}
