package com.cl.elena.pattern.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class SharpCache {

	public SharpCache() {

	}

	private static Map<Integer, Shape> map = new HashMap<Integer, Shape>();

	public static Shape getSharp(int shapeId) {
		Shape cachedShape = map.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(1);
		map.put(circle.getId(), circle);

		Square square = new Square();
		square.setId(2);
		map.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId(3);
		map.put(rectangle.getId(), rectangle);
	}

}
