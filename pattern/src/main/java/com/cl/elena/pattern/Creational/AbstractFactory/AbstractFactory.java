package com.cl.elena.pattern.Creational.AbstractFactory;

import com.cl.elena.pattern.Creational.Factory.Car;

public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Car getShape(String shape);

}
