package com.cpattanaik.behavioral.memento;

public interface Calculator {
	public void setFirstNumber(int firstNumber);
	public void setSecondNumber(int secondNumber);
	public int getAddResult();
	
	public Memento takeBackup();
	public void unDo(Memento mem);
	

}
