package com.cl.elena.pattern.Structural.Flyweight;

public class Circle implements Sharp {

	int x, y = 0;
	int radius = 0;
	String colorString;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(String color) {
		this.colorString = color;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + colorString
		         +", x : " + x +", y :" + y +", radius :" + radius);
		 
	}

}
