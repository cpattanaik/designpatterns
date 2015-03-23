package com.cpattanaik.structural.adaptor;

public class MP4MedaiPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing MP4: " + fileName);

	}

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub

	}

}
