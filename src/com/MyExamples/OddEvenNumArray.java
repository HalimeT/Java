package com.MyExamples;

import java.util.Scanner;

public class OddEvenNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int[] arr=new int[6];
		int sum=0;
		int sum1=0;
	
		
		System.out.println("Please, enter 6 integers");
		
		for(int i=0; i<6; i++) {
			
             int num= scan.nextInt();
             arr[i]=num;
             }
		
		System.out.print("The sum of even numbers in the array is: ");
	
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2==0) {
					sum=sum+arr[i];
				}
				}System.out.println(sum);
		
		System.out.print("The sum of odd numbers in the array is: ");
			for(int i=0; i<arr.length; i++) {
		    if(arr[i]%2==1) {
		    	sum1=sum1+arr[i];
		    	 
		     }
		    
			}System.out.println(sum1);
		
		}

}
