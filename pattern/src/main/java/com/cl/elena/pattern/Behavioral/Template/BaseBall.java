package com.cl.elena.pattern.Behavioral.Template;

public class BaseBall extends Game {

	public BaseBall() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void initialize() {
		System.out.println("BaseBall Game Initialized! Start playing.");

	}

	@Override
	void startPlay() {
		System.out.println("BaseBall Game Started. Enjoy the game!");

	}

	@Override
	void endPlay() {
		System.out.println("BaseBall Game Finished!");

	}

}
