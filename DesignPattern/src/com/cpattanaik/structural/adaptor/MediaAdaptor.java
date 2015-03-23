package com.cpattanaik.structural.adaptor;

public class MediaAdaptor implements MediaPlayer{
	//It inherits MeiaPlayer to implement play method, 
	//the play method will actually call the advanced player play method

	AdvancedMediaPlayer player;
	
	public MediaAdaptor(String mediaType) {
		if(mediaType.equals("mp4")){
			this.player = new MP4MedaiPlayer();
		}
		else if(mediaType.equals("vlc")){
			this.player = new VLCMedaiPlayer();
		}
	}

	@Override
	public void play(String mediaType, String FileName) {
		if(mediaType.equals("mp4")){
			player.playMP4(FileName);
		}else if(mediaType.equals("vlc")){
			player.playVLC(FileName);
		}
	}

}
