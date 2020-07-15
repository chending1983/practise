package com.cl.elena.pattern.Creational.AbstractFactory;

import com.cl.elena.pattern.Creational.Factory.Car;
import com.cl.elena.pattern.Creational.Factory.Sedan;
import com.cl.elena.pattern.Creational.Factory.Suv;
import com.cl.elena.pattern.Creational.Factory.Truck;

public class CarFactory extends AbstractFactory {

	@Override
	public Car getShape(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("SUV")) {
			return new Suv();
		} else if (type.equalsIgnoreCase("SEDAN")) {
			return new Sedan();
		} else if (type.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
