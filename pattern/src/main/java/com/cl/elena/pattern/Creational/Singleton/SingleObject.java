package com.cl.elena.pattern.Creational.Singleton;

public class SingleObject {

	public SingleObject() {
		
	}

	private static SingleObject instance = new SingleObject();

	public static SingleObject getInstance() {
		return instance;
	}

}
