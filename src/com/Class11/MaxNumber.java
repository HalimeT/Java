package com.Class11;

public class MaxNumber {

	public static void main(String[] args) {
		// Interview question
		
		
		int[] arr= {10,56,89,45,100,345,1200,7,9};
		int max=arr[0];
	
		for(int num:arr) {
			
			if(num>max) {
				max=num;
				
}
			}System.out.println(max);
	}
	}
