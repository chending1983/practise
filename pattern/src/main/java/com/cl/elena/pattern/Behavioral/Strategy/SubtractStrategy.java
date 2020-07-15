package com.cl.elena.pattern.Behavioral.Strategy;

public class SubtractStrategy implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

	public SubtractStrategy() {
		// TODO Auto-generated constructor stub
	}

}
