package com.cpattanaik.structural.proxy;

public class Client {
	public static void main(String[] args){
		Image image = new ProxyImage("xyz.jpg");

		//Actual Image will be created here
	    image.display(); 
	    
	      
	    //Here it wont crate again, 
	    //since it is already created
	    image.display(); 	
		
	}

}
