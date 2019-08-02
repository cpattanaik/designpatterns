/**
 * 
 */
package com.cpattanaik.structural.adaptor;

/**
 * @author c0p00fy
 *
 */
public class MP3Player implements MediaPlayer {
	@Override
	public void play(String mediaType, String FileName) {
		System.out.println("Playing MP3");
	}
}
