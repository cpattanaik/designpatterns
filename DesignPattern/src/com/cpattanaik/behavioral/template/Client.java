package com.cpattanaik.behavioral.template;

public class Client {
	public static void main(String[] args){
		System.out.println("Package A: ");
		Trip trip =  new PackageA();
		trip.start();
	
		System.out.println("Package B: ");
		trip =  new PackageB();
		trip.start();
    }
	
}
