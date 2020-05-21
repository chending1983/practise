package com.cl.elena.cloudclient.main.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CustomizeListener implements ApplicationListener<ContextRefreshedEvent> {

	public CustomizeListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		System.out.println("CustomizeListenetApplicationListener............................");
	}

}
