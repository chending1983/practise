package com.cl.elena.pattern.Behavioral.state;

public class WiFiOffState implements WiFiState {

	public WiFiOffState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		System.out.println("WiFi OFF!!!");
	}

}
