package com.cl.elena.pattern.Behavioral.Visitor;

public class VisitorPatternDemo {

	public VisitorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
