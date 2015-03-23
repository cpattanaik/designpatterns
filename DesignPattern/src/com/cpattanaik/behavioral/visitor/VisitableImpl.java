package com.cpattanaik.behavioral.visitor;

public class VisitableImpl implements IVisitable {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);

	}

}
