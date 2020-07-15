package com.cl.elena.pattern.Creational.Prototype;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
	      System.out.println("Inside Circle::draw() method.");
	}

}
