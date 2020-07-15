package com.cl.elena.pattern.Structural.Proxy;

public class RealImage implements Image {

	public String fileName;

	public RealImage(String fileName) {
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	}
	
	private static void loadFromDisk(String fileName) {
		System.out.println("Loading... " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying... " + fileName);
	}

}
