package com.cpattanaik.structural.adaptor;
/*
 *  Initially, only mp3 support was there. 
 *  But latter it is extended to support MP4/VLC players.
 */ 
public class Client {
	public static void main(String[] args){
		//We can put this content inside a wrapper class
		MediaPlayer player =  new MP3Player();
		player.play("mp3", "song1.mp3");
		
		player =  new MediaAdapter(new MP4Player());
		player.play("mp4", "Song2.mp4");
		
		player =  new MediaAdapter(new VLCPlayer());
		player.play("VLC", "Song3.mp4");
	}
}
