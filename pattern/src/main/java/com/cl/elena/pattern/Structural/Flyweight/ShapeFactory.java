package com.cl.elena.pattern.Structural.Flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Sharp> map = new HashMap<>();;

	public ShapeFactory() {
	}

	public static Sharp getCircle(String color) {
		Circle circle = (Circle) map.get(color);

		if (circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
