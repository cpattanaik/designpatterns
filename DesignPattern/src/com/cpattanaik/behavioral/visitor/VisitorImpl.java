package com.cpattanaik.behavioral.visitor;

public class VisitorImpl implements IVisitor{
    private int count = 0;
	
	@Override
	public void visit(IVisitable visitable) {
		System.out.println("Visited");
		//do visit here
		count = 5;
		
	}

	@Override
	public void displayResult() {
		System.out.println("Analytics value: "+count);
		
	}
	   
}
