package com.cl.elena.reflect.jdk;

public class ElectricCar implements Rechargable, Vehicle {

	public ElectricCar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Electric Car is Moving silently...");

	}

	@Override
	public void recharge() {
		System.out.println("Electric Car is Recharging...");

	}

}
