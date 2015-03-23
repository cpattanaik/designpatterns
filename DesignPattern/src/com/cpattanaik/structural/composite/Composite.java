package com.cpattanaik.structural.composite;

import java.util.ArrayList;
import java.util.List;

import com.cpattanaik.common.Util;

public class Composite implements Component {
	List<Component> list = new ArrayList<Component>();

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void show(int indexSpace) {
		System.out.println(Util.getFilledStr(indexSpace, '+') + "Composite");
		
		for(Component c : list) {
			c.show(indexSpace+1);
		}

	}

}
