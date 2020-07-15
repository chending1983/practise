package com.cl.elena.pattern.Structural.Proxy;

public class ProxyPatternDemo {

	public ProxyPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Image image = new ProxyImage("test_10mb.jpg");
		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像不需要从磁盘加载
		image.display();
		DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
		image = (Image) dynamicProxyHandler.newProxy(new RealImage("hahahaha"));
		image.display();

	}
}
