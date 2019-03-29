package com.MyExamples;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ask user to enter the item they want to buy and  the price for the item. Then ask user to pay for it.
		* Every time user enters money accumulate the amount and tell user how much is left to pay off the amount.
		* Whenever user done with payments tell them "Thank you for shopping!"
		*/
		Scanner scan;
		scan= new Scanner(System.in);
		System.out.println("Please, enter the item");
		String item=scan.nextLine();
		
		System.out.println("Please, enter the price of "+item);
		Double price=scan.nextDouble();
		
		double left=0.0;
		double total=0.0;
		double change;
		
		do {
			System.out.println("Please, pay for "+item);
			double money=scan.nextDouble();
			  total=total+money;
			  
			  if(total>price) {
				 change=total-price;
			System.out.println("Please take your change "+change);
			
			  }else if(total<price) {
				 left=price-total;
				System.out.println("Please pay more "+left);
			}
			
		}while(left!=0);
		
		System.out.println("Thank you shipping");
		
		
		

	}

}
