package com.Class7;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		scan=new Scanner(System.in);
		
		
		double amount;
		 do {
			System.out.println("Please pay for soda");
			amount=scan.nextDouble();
		 }while(amount!=1.99);
		 System.out.println("Please enjoy your soda");
			
		
		 

	}

}
