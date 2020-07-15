package com.cl.elena.pattern.Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class FactoryProducer {

	public FactoryProducer() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<AbstractFactory> getFactory(String carType, String color) {
		List<AbstractFactory> retList = new ArrayList<>();
		if (carType == null) {
			System.err.println("不订车型是几个意思？");
			return null;
		}
		CarFactory car = new CarFactory();
		car.getShape(carType);
		ColorFactory c = new ColorFactory();
		if (color == null) {
			System.out.println("default green！！");
			c.getColor("GREEN");
		}
		retList.add(c);
		return retList;
	}

}
