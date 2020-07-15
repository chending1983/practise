package com.cl.elena.pattern.Creational.Builder;

public abstract class Burger implements Item {

	public Burger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Burger";
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
