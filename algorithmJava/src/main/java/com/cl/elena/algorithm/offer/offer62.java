	package com.cl.elena.algorithm.offer;

public class offer62 {

	public offer62() {
		// TODO Auto-generated constructor stub
	}
    public int lastRemaining(int n, int m) {
    	int ans = 0;
    	for (int i = 2; i <= n; i++) {
    		ans = (ans + n) %i;
    	}
    	return ans;
    }
}
