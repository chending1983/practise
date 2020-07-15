package com.cl.elena.pattern.Creational.Prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
