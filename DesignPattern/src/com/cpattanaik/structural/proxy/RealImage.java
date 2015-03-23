package com.cpattanaik.structural.proxy;

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName){
		System.out.println("Constructer Called");
		this.fileName = fileName;
	}  
	
	@Override
	public void display() {
		System.out.println("Image Displaying: "+ fileName);
	}
	
}
