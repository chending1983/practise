package com.cl.elena.pattern.Creational.Factory;

import javax.security.auth.Subject;

public class FactoryPatternDemo {

	public FactoryPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Suv carSuv = (Suv) factory.getCar("SUV");
	}

}
