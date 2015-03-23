package com.cpattanaik.structural.adaptor;

public class VLCMedaiPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC: " + fileName);

	}

}
