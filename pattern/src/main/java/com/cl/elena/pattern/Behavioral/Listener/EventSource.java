package com.cl.elena.pattern.Behavioral.Listener;

import java.util.EventObject;

public class EventSource implements ApplicationListener {

	public EventSource() {
		// TODO Auto-generated constructor stub
	}
	
    public Button testOnClick() {
        final Button button = new Button();
        button.setClickListener(this);
        return button;
    }

	@Override
	public void click(ClickEvent Event) {
        System.out.println("鼠标单击事件: " + Event.getID());
	}

	@Override
	public void doubleClick(ClickEvent Event) {
        System.out.println("鼠标双击事件: " + Event.getID());
	}
	
	public static void main(String args[]) {
        EventSource eventSource = new EventSource();
        Button button = eventSource.testOnClick();
        ClickEvent clickEvent = new ClickEvent(EventSource.class, ClickEvent.SINGLE_CLICK);
        button.handleEvent(clickEvent);
	}

}
