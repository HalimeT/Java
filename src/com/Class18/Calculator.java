package com.Class18;

public class Calculator {
	public static int sum(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
		
	}
	public static int avg(int a, int b, int c) {
		int avg=(a+b+c)/3;
		return avg;
	}
	public static int max(int a, int b, int c) {
		int max=a;
		if(b>a) {
		   max=b;
			
		}if(c>max) {
		   max=c;
	
		}return max;
		
	}
	public static int min(int a, int b, int c) {
		int min=a;
		if(b<a) {
		   min=b;
			
		} if(c<min) {
		   min=c;
		
		}return min;
		
	}

}
