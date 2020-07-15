package com.cl.elena.pattern.Behavioral.Strategy;

public class ContextStrategy {

	private Strategy strategy;
	
	public ContextStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	

}
