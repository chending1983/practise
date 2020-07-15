package com.cl.elena.pattern.Creational.Builder;

public class BuilderPatternDemo {

	public BuilderPatternDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Order order = new Order();
		order.addItem(new coffee());
		order.addItem(new coke());
		order.addItem(new VegBurger());
		OrderBuilder orderBuilder = new OrderBuilder(order);
		orderBuilder.buildOrder();
	}

}
