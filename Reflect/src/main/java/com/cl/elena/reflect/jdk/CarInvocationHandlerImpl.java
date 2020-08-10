package com.cl.elena.reflect.jdk;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class CarInvocationHandlerImpl implements InvocationHandler {

	private ElectricCar car;

	public CarInvocationHandlerImpl(ElectricCar car2) {
		this.car = car;
	}

	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		System.out.println("You are going to invoke " + paramMethod.getName() + " ...");
		paramMethod.invoke(car, null);
		System.out.println(paramMethod.getName() + " invocation Has Been finished...");
		return null;
	}
}
