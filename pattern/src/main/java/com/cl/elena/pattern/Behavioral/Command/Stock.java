package com.cl.elena.pattern.Behavioral.Command;

public class Stock {

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	private String name = "ABC";
	
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");

	}

}
