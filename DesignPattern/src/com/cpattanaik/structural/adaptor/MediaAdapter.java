/**
 * 
 */
package com.cpattanaik.structural.adaptor;

/**
 * @author c0p00fy
 *
 */
public class MediaAdapter implements MediaPlayer {
	private MediaPlayer player = null;
	public MediaAdapter(MediaPlayer player) {
		this.player = player;
	}

	
	@Override
	public void play(String mediaType, String FileName) {
		player.play(mediaType, FileName);
	}
}
