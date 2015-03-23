package com.cpattanaik.behavioral.memento;

public class CalculatorImpl implements Calculator{
	private int firstNumber = 0;
	private int secondNumber = 0;
	
	@Override
	public Memento takeBackup() {
		return new CalculatorMemento(firstNumber, secondNumber);
	}
	
	@Override
	public void unDo(Memento mem) {
		firstNumber = mem.getFirstNumber();
		secondNumber = mem.getSecondNumber();
	}
	public int getAddResult(){
		return firstNumber + secondNumber;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
}
