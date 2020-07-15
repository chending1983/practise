package com.cl.elena.pattern.Structural.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler<T> implements InvocationHandler {

    private T realObject;
    private Method beforeMethod;
    private Method afterMethod;

	public DynamicProxyHandler() {
		// TODO Auto-generated constructor stub
	}

    public Object newProxy(T object) {
        this.realObject = object;
        //获取真实对象中的所有方法
        Method[] declaredMethods = object.getClass()
                .getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!method.isAccessible())
                //setAccessible设置成true取消了Java的权限控制检查，
                //是用来访问private的方法
                method.setAccessible(true);
//            //如果注解是BeforeExecute
//            if (method.isAnnotationPresent(BeforeExecute.class)) {
//                beforeMethod = method;
//            } else if (method.isAnnotationPresent(AfterExecute.class)) {
//                afterMethod = method;
//            }
        }
        
        //用newProxyInstance获取代理对象的实例
        //第一个参数是真实对象的类加载器
        //第二个参数是一个数组，我们都知道一个类可以实现多个接口，所以这里是数组，在主程序使用的时候，我们可以转换成要用的接口类型就行
        //第三个参数也是需要将DynamicProxyHandler传入，这里也是对invoke的回调
        //可以直接在这里new一个InvocationHandler，就不用DynamicProxyHandler继承实现InvocationHandler了，具体看下cglib代理。
        return Proxy.newProxyInstance(realObject .getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(realObject, args);
		return result;
	}

}
