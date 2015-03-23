package com.cpattanaik.structural.composite;


import com.cpattanaik.common.Util;

public class Simple implements Component {

	@Override
	public void add(Component component) {
		// Not necessary to override here

	}

	@Override
	public void show(int indexSpace) {
		System.out.println(Util.getFilledStr(indexSpace, '-')+ "Simple");
	}

}
