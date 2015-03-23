package com.cpattanaik.behavioral.strategy;

public class StrategySub implements Strategy {

	@Override
	public void execute(int x, int y) {
		System.out.println(x-y);

	}

}
