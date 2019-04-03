package com.Class14;

public class Task2 {

	public static void main(String[] args) {
		//  * 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		
		int[] num= {1000,56,89,45,100,345,129,7,9};
	    int max=0;
	    int secMax=0;
	    int min=0;
	    
	    for(int a:num) {
		
			if(a>max) {
			  max=a;
			 }
			if(a<min) {
				  min=a;
				 }
			}
			
	    for(int i:num) {
			if(i>secMax && i<max) {
				secMax=i;
			}
		}System.out.println("The  second maximum value in the array is: "+secMax);
		System.out.println("The maximum value in the array is: "+max);
		System.out.println("The minumum value in the array is: "+min);
			
		
			
		
			
				
				

	}
	}

