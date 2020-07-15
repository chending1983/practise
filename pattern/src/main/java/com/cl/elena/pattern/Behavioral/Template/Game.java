package com.cl.elena.pattern.Behavioral.Template;

public abstract class Game {

	public Game() {
		// TODO Auto-generated constructor stub
	}

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// 模板
	public final void play() {
		// 初始化游戏
		initialize();

		// 开始游戏
		startPlay();

		// 结束游戏
		endPlay();
	}

}
