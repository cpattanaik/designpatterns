package com.cpattanaik.behavioral.memento;
/*
 * It will provide function to keep complete state of the calculator object, 
 * so that, on undo, it will get the object back and do the operation.
 */
public interface Memento {
	public int getSecondNumber();
	public int getFirstNumber();

}
