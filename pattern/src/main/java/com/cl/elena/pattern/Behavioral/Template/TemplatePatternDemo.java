package com.cl.elena.pattern.Behavioral.Template;

public class TemplatePatternDemo {

	public TemplatePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Game game = new BaseBall();
		game.play();
		System.out.println();
		game = new BasketBall();
		game.play();
	}

}
