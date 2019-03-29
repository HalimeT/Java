package com.MyExamples;

import java.util.Scanner;

public class HomeworkTask {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		Write a guessing game where the user has to guess a secret number between 1 and 20.
		 After every guess input, the program tells the user whether their number was too large or too small. 
		 The program will keep asking the user to enter the number until he finds the correct number.
		  When the correct answer is found the system should display "Congratulations!!. You got it!".
		  */
		
		int secretNum=13;
		Scanner scan=new Scanner(System.in);
		
	   int num;
	   System.out.println("Please,enter a number between 1 to 20");
		do {
		
		 num=scan.nextInt();
		
	
			if(num>secretNum) {
				System.out.println("Your number is too large");
				
			}else if(num<secretNum) {
				System.out.println("Your number is too small");
				}
			
			
		}while(num!=secretNum);
		
		
		
		System.out.println("Congrats! You got it!");
			
			
			
		
		
		

	}

}
