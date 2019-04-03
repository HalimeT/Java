package com.Class14;

public class Task8 {

	public static void main(String[] args) {
		//8. Write a Java Program to print first 10 numbers of Fibonacci series.
         int count=10;   
         System.out.println("First "+count+" numbers of Fibonacci series");
	    int	num1=0;
		int	num2=1;
		int total=1;
		
	    for(int i=1; i<=count; i++) {
		 
		 System.out.print(total+" ");
		 total=num1+num2;
		 
		 num1=num2; 
		 num2=total;
		 
		 
	 }
		    
	
			
		}
		
		
			
		}
	


