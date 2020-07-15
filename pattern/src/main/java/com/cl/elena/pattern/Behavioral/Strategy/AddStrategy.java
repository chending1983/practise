package com.cl.elena.pattern.Behavioral.Strategy;

public class AddStrategy implements Strategy {

	public AddStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
