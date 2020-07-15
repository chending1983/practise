package com.cl.elena.pattern.Behavioral.Visitor;

public class Monitor implements ComputerPart {

	public Monitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);

	}

}
