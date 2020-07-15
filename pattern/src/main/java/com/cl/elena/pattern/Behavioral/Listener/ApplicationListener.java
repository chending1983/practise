package com.cl.elena.pattern.Behavioral.Listener;

import java.util.EventListener;

public interface ApplicationListener extends EventListener{
	
	void click(ClickEvent Event);
    void doubleClick(ClickEvent Event);

}
