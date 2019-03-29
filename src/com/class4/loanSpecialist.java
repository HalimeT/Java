package com.class4;

import java.util.Scanner;

public class loanSpecialist {
	public static void main(String[] args) {
		//ask user what amount of loan is needed
		//if loan is less than 200,000 lend the money
		//otherwise reject it
		
		int money;
		Scanner scan= new Scanner(System.in);
		System.out.println("What amount of loan do you need?");
		
		money=scan.nextInt();
		if(money<200000) {
			System.out.println("I will lend the money");
			
		}else {
			System.out.println("I have to reject your need.");
		}
	}

}
