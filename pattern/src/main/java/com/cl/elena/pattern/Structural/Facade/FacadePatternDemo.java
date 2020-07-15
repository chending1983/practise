package com.cl.elena.pattern.Structural.Facade;

public class FacadePatternDemo {

	public FacadePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		SharpFacade faceFacade = new SharpFacadeImpl();
		faceFacade.drawCircle();
		faceFacade.drawRerangle();
		faceFacade.drawSquare();
	}
}
