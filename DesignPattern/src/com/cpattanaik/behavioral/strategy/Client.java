package com.cpattanaik.behavioral.strategy;
/* 
 * Set the behavior dynamically and change the operation on a context  at run time
 * Example: Lets say the robot is the context and its behavior 'move' can change at run time( AgresiveMove/DefenciveMove/NormalMove)
  */
public class Client {
	public static void main(String[] args){
		int x = 9, y = 7;
		Context context =  new Context();
		
		context.setStrategy(new StrategyAdd());
		context.doOperation(x, y);
		
		context.setStrategy(new StrategySub());
		context.doOperation(x, y);
		
	}

}
