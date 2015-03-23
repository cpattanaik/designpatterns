package com.cpattanaik.behavioral.strategy;

public class Context {
	private Strategy strategy =  null;
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	public void doOperation(int x, int y){
		strategy.execute(x, y);
	}

}
