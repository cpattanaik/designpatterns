/**
 * 
 */
package com.cpattanaik.behavioral.state;

/**
 * @author c0p00fy
 *
 */
public class On implements State{
	@Override
	public void changeState(Context context) {
		System.out.println("On");
		context.setState(new Off());
	}
}
