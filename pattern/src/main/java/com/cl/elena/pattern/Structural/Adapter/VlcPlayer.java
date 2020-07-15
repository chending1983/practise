package com.cl.elena.pattern.Structural.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	public VlcPlayer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);

	}

	@Override
	public void playMp4(String fileName) {

	}

}
