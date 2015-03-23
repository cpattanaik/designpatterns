package com.cpattanaik.structural.adaptor;

public class AudioPlayer implements MediaPlayer {

	MediaAdaptor mediaAdaptor;
	
	public void play(String mediaType, String FileName) {
		if(mediaType.equals("mp3")){
			System.out.println("Playing MP3: " + FileName);
		}else if(mediaType.equals("mp4") || mediaType.equals("vlc")){
			mediaAdaptor = new MediaAdaptor(mediaType);
			mediaAdaptor.play(mediaType, FileName);
		}
		else{
			System.out.println("Unsupported Media Type");
		}
		
	}
	
}
