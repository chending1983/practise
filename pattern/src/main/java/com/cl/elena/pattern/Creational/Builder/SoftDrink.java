package com.cl.elena.pattern.Creational.Builder;

public abstract class SoftDrink implements Item {

	public SoftDrink() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "SoftDrink";
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
