package com.JavaReview2;

public class ArrayMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Write a program to find the index of an array element.         
		 *Write a program to find the maximum and minimum value of an array.
        */
		
		int[] arr= {10,56,89,45,100,345,12,7,9};
		int max=arr[0];
		int min=arr[0];
		
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				
			}
		  if(arr[i]<min) {
			  min=arr[i];		  
		}
		  }
		System.out.println(max+" is the max value in the array");
		System.out.println(min+" is the min value in the array");
		
		  
		  }

}
