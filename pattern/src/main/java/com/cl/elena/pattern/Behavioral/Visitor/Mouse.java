package com.cl.elena.pattern.Behavioral.Visitor;

public class Mouse implements ComputerPart {

	public Mouse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);

	}

}
