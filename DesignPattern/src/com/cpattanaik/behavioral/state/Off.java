/**
 * 
 */
package com.cpattanaik.behavioral.state;

/**
 * @author c0p00fy
 *
 */
public class Off implements State{
	@Override
	public void changeState(Context context) {
		System.out.println("Off");
		context.setState(new On());
	}
}
