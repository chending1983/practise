package com.cl.elena.pattern.Behavioral.Listener;

import java.util.EventObject;

public class ClickEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private int id;
	public final static int SINGLE_CLICK = 1; // 单击事件
	public final static int DOUBLE_CLICK = 2; // 双击事件

	public ClickEvent(Object source) {
		super(source);
	}

	public ClickEvent(Object source, int id) {
		super(source);
		switch (id) {
		case SINGLE_CLICK:
			this.id = SINGLE_CLICK;
			break;
		case DOUBLE_CLICK:
			this.id = DOUBLE_CLICK;
			break;
		}
	}

	public int getID() {
		return this.id;
	}

}
