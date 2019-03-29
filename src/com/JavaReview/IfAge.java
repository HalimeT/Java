package com.JavaReview;
import java.util.Scanner;

public class IfAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should  greater than or equal 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
        // If the age is greater than 100  print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		Scanner scan;
		int age;
		String output="";
       scan=new Scanner(System.in);
        System.out.println("Enter your age.");
        age=scan.nextInt();
        
        if(!(age>18)) {
        	output="Too young";
        	
        }else if(age>=18 && age<=35) {
        	output="Young Person";
        	
        }else if(age>=36 || age<=99) {
        	output="You are Middle Age Person";
        	
        }else if(age>100) {
        	output="You are too Old";
        	
       }
        System.out.println(output);
        
	}

}
