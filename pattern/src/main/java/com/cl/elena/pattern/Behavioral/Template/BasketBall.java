package com.cl.elena.pattern.Behavioral.Template;

public class BasketBall extends Game {

	public BasketBall() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void initialize() {
		System.out.println("BasketBall Game Initialized! Start playing.");

	}

	@Override
	void startPlay() {
		System.out.println("BasketBall Game Started. Enjoy the game!");

	}

	@Override
	void endPlay() {
		System.out.println("BasketBall Game Finished!");

	}

}
