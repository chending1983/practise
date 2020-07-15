package com.cl.elena.pattern.Behavioral.Listener;

import java.util.EventObject;

public class Button {

	public Button() {
		// TODO Auto-generated constructor stub
	}

	
    private ApplicationListener clickListener;

    public void setClickListener(ApplicationListener clickListener){
        this.clickListener = clickListener;
    }

    public void handleEvent(EventObject e) {
        if (e instanceof ClickEvent) {
            ClickEvent event = (ClickEvent)e;
            switch(event.getID()){
                case ClickEvent.SINGLE_CLICK:
                    this.clickListener.click(event);
                    break;
                case ClickEvent.DOUBLE_CLICK:
                    this.clickListener.doubleClick(event);
                    break;
            }
        }
    }
}
