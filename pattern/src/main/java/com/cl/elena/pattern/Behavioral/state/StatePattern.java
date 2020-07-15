package com.cl.elena.pattern.Behavioral.state;

public class StatePattern {

	public StatePattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        WiFiContext context = new WiFiContext();
        WiFiState on = new WiFiOnState();
        context.setWiFiState(on);
        context.request();
        context.setWiFiState(new WiFiOffState());
        context.request();
	}
}
