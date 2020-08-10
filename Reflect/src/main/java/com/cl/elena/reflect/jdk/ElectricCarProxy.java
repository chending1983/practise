package com.cl.elena.reflect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class ElectricCarProxy extends Proxy implements Rechargable, Vehicle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Method m1;
	private static Method m3;
	private static Method m4;
	private static Method m0;
	private static Method m2;
	static {
		try { // 为每一个需要方法对象，当调用相应的方法时，分别将方法对象作为参数传递给InvocationHandler处理
			m1 = Class.forName("java.lang.Object").getMethod("equals",
					new Class[] { Class.forName("java.lang.Object") });
			m3 = Class.forName("com.foo.proxy.Rechargable").getMethod("recharge", new Class[0]);
			m4 = Class.forName("com.foo.proxy.Vehicle").getMethod("drive", new Class[0]);
			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
		} catch (NoSuchMethodException localNoSuchMethodException) {
			throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
		}
	}

	public ElectricCarProxy(InvocationHandler paramInvocationHandler) {
		super(paramInvocationHandler);
	}

	public final boolean equals(Object paramObject) {
		try { // 方法功能实现交给InvocationHandler处理
			return ((Boolean) this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final void recharge() {
		try {

			// 方法功能实现交给InvocationHandler处理

			this.h.invoke(this, m3, null);
			return;
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final void drive()

	{
		try {

			// 方法功能实现交给InvocationHandler处理

			this.h.invoke(this, m4, null);
			return;
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final int hashCode()

	{
		try {

			// 方法功能实现交给InvocationHandler处理

			return ((Integer) this.h.invoke(this, m0, null)).intValue();
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

	public final String toString()

	{
		try {

			// 方法功能实现交给InvocationHandler处理
			return (String) this.h.invoke(this, m2, null);
		} catch (Error | RuntimeException localError) {
			throw localError;
		} catch (Throwable localThrowable) {
			throw new UndeclaredThrowableException(localThrowable);
		}
	}

}
