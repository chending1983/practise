package com.cl.elena.pattern.Creational.Prototype;

public class PrototypePatternDemo {

	public PrototypePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SharpCache.loadCache();

		Shape clonedShape = (Shape) SharpCache.getSharp(1);
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) SharpCache.getSharp(2);
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) SharpCache.getSharp(3);
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
