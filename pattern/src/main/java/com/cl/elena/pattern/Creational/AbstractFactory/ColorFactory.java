package com.cl.elena.pattern.Creational.AbstractFactory;

import com.cl.elena.pattern.Creational.Factory.Car;

public class ColorFactory extends AbstractFactory {

	public ColorFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;

	}

	@Override
	public Car getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
