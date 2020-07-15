package com.cl.elena.pattern.Creational.Builder;

public class OrderBuilder {
	public Order order;
	public OrderBuilder(Order order) {
		this.order = order;
	}
	
	public void buildOrder() {
		order.showOrder();
		System.out.println("check out bill :" + order.getPrice());
	}

}
