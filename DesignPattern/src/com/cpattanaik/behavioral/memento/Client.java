package com.cpattanaik.behavioral.memento;

import java.util.Stack;

public class Client {
	public static void main(String[] args){
		Calculator calc =  new CalculatorImpl();
		Stack<Memento>  m =  new Stack<Memento>(); // Memorize in a sequence
		
		calc.setFirstNumber(5);
		calc.setSecondNumber(7);
		System.out.println(calc.getAddResult());
		m.push(calc.takeBackup());
		
		calc.setFirstNumber(7);
		calc.setSecondNumber(7);
		System.out.println(calc.getAddResult());
		m.push(calc.takeBackup());
		
		calc.setFirstNumber(9);
		calc.setSecondNumber(7);
		System.out.println(calc.getAddResult());
		m.push(calc.takeBackup());
		
		calc.unDo(m.pop());
		System.out.println(calc.getAddResult());
		
		calc.unDo(m.pop());
		System.out.println(calc.getAddResult());
	}

}
