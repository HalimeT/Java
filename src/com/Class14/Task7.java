package com.Class14;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// 7. Write a java program to check whether a given number is prime or not?
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check if it is prime");
		int num=scan.nextInt();
	    boolean flag=false;
		for(int i=2; i<=num/2; ++i) {
			
			if(num%i==0) {
				System.out.println(" is not prime");
				flag=true;
				break;
			}
		}
			if(!flag) {
				System.out.println("is prime number ");
				
			}
			
				
			
			
			
		
	
}
}