package com.cl.elena.algorithm.offer;

public class offer05 {
	public String replaceSpace(String s) {
		StringBuilder ssBuilder = new StringBuilder();
       for (char c : s.toCharArray()) {
    	  if (c == ' ') {
    		  ssBuilder.append("%20");
    	  } else {
    		  ssBuilder.append(c);
    	  }
       }
       return ssBuilder.toString();
   }
}
