package com.cl.elena.pattern.Behavioral.state;

public class WiFiOnState implements WiFiState {

	public WiFiOnState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		System.out.println("WIFI-ON, Searching.......");
	}

}
