package com.cpattanaik.structural.adaptor;
/*
 *  Initially, only mp3 support was there. 
 *  But latter it supported mew media player.
 *  Old Audio player class initially looking as:
 * 
 *  public class AudioPlayer{

	public void play(String mediaType, String FileName) {
		if(mediaType.equals("mp3")){
			System.out.println("Playing MP3: " + FileName);
		}else{
			System.out.println("Unsupported Media Type");
		}
		
	}
	
}
 * 
 */ 
public class Client {
	public static void main(String[] args){
		AudioPlayer player =  new AudioPlayer();
		player.play("mp3", "song1.mp3");
		
		//New support
		player.play("mp4", "Song2.mp4");
		player.play("vlc", "Song3.vlc");
	}

}
