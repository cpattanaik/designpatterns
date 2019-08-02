package com.cpattanaik.behavioral.state;

public class Context {
	private State state;
	
	public Context() {
		state = new Off();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void changeState() {
		state.changeState(this);
		
	}
}
