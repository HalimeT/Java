package com.Class18;

public class Minimum {
	public static void main(String[] args) {
		int[] v= {2,1,3,4,5,6};
		System.out.println(minOfValues(v));
	}
	
	public static int minOfValues(int[] a) {
		int min=a[0];
		for(int i:a) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	
	}
  
}
