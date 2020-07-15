package com.cl.elena.pattern.Behavioral.Strategy;

public class StrategyPatternDemo {

	public StrategyPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		ContextStrategy context = new ContextStrategy(new AddStrategy());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	}

}
