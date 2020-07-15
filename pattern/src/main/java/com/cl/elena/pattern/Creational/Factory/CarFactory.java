package com.cl.elena.pattern.Creational.Factory;

public class CarFactory {

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("SUV")) {
			return new Suv();
		} else if (carType.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		} else if (carType.equalsIgnoreCase("SEDAN")) {
			return new Sedan();
		} else if (carType.equalsIgnoreCase("WAGON")) {
			return new Wagon();
		}
		return null;
	}

}
