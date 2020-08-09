package com.cl.elena.algorithm.leetcode;

public class SortByParity {

	public SortByParity() {
		// TODO Auto-generated constructor stub
	}
	
	// 按奇偶排序数组, 给一个正整数数组，按照奇偶数排序，奇数在前，偶数在后
	public static int[] swap(int[] A) {
        int[] arr=new int[A.length];
        int start=0;
        int end=A.length-1;
        for(int i=0;i<A.length;i++) {
        	if(A[i]%2==0) {
        		arr[start++]=A[i];
        	}else {
        		arr[end--]=A[i];
        	}
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] input = {2,3,4,5,6,7};
		System.out.println("SortByParity.main()");
		
	}
}
