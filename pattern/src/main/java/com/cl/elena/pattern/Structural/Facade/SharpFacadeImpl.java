package com.cl.elena.pattern.Structural.Facade;

public class SharpFacadeImpl implements SharpFacade {

	private Sharp rectangleSharp;
	private Sharp squareSharp;
	private Sharp circleSharp;
	
	public SharpFacadeImpl() {
		rectangleSharp = new Rectangle();
		squareSharp = new Square();
		circleSharp = new Circle();
	}

	@Override
	public void drawCircle() {
		circleSharp.draw();
	}

	@Override
	public void drawSquare() {
		squareSharp.draw();
	}

	@Override
	public void drawRerangle() {
		rectangleSharp.draw();
	}

}
