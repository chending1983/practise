package com.cl.elena.pattern.Behavioral.state;

public class WiFiContext {
	private WiFiState state;

	public WiFiContext() {
		// TODO Auto-generated constructor stub
	}
	
	public void setWiFiState(WiFiState state) {
		this.state = state;
	}
	
	public void request() {
		state.handle();
	}

}
