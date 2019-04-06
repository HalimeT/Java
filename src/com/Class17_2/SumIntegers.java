package com.Class17_2;

import java.util.Scanner;

public class SumIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Write a program that reads a range of integers,
		 *  provided by a user and then prints the sum of the even and odd integers
		 */
		
		SumIntegers demo=new SumIntegers();
	    demo.SumInt();
		
		
	}void SumInt(){
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter a range of integer");
		System.out.println("please enter start point of integer");
		int start=scan.nextInt();
		System.out.println("Please enter end point.");
		
	   int end=scan.nextInt();
       int sum1=0;
       int sum2=0;
       
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				 sum1=sum1+i;
				
			}else if(i%2==1) {
				 sum2=sum1+i;				 
				}
		}
			System.out.println("the sum of even numbers in this range is "+sum1);
			
		System.out.println("the sum of odd numbers in this range is "+sum2);
				
		
	

	}
	}
