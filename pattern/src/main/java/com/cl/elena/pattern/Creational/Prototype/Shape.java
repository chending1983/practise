package com.cl.elena.pattern.Creational.Prototype;

public abstract class Shape implements Cloneable {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private int id;

	protected String type;

	abstract void draw();

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
