package com.cl.elena.reflect.jdk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

@SuppressWarnings("restriction")
public class ProxyUtils implements AutoCloseable{

	public ProxyUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void generateClassFile(Class clazz,String proxyName) {
		byte[] classFile = ProxyGenerator.generateProxyClass(proxyName, clazz.getInterfaces());
		String paths = clazz.getResource(".").getPath();
		System.out.println(paths);
		try (FileOutputStream out = new FileOutputStream(paths+proxyName+".class");){
            out.write(classFile);  
            out.flush();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
