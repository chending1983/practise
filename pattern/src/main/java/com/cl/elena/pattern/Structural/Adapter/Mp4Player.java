package com.cl.elena.pattern.Structural.Adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	public Mp4Player() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVlc(String fileName) {

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);

	}

}
