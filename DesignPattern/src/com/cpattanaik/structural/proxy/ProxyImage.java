package com.cpattanaik.structural.proxy;

public class ProxyImage implements Image {

	private Image rImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(this.rImage == null)
			rImage = new RealImage(fileName);
		rImage.display();
	}

}
