package com.cl.elena.pattern.Behavioral.Visitor;

public class Keyboard implements ComputerPart {

	public Keyboard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
