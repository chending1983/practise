package com.cl.elena.pattern.Behavioral.Strategy;

public class MultiplyStrategy implements Strategy {

	public MultiplyStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
