package com.Class17_2;

import java.util.Scanner;

public class Task1Question2 {

	public static void main(String[] args) {
		/*Ask user to enter the item they want to buy and  the price for the item. Then ask user to pay for it.
		* Every time user enters money accumulate the amount and tell user how much is left to pay off the amount.
		* Whenever user done with payments tell them "Thank you for shopping!"
		*/
		Task1Question2 demo=new Task1Question2();
		demo.LeftMoney();
		
	}void LeftMoney(){
		Scanner scan=new Scanner(System.in);
		double price=0.0;
		
		System.out.println("Enter the item that you want to buy");
		
		String item=scan.nextLine();
		
		System.out.println("Please, enter price of "+item);
		price=scan.nextDouble();
		
		 double left=0.0;
		 double money=0.0;
		 double total=0.0;
		
		 do{
			  System.out.println("Please pay for "+item);
		      money=scan.nextDouble();
			  total=total+money;
	         left=price-total;
	               if(left!=0.0) {
	         
			            System.out.println(left+" is left to pay off the amount ");
	              } else {
	    	            System.out.println("");
	                 }
	                     money++;
			
		 }while((left!=0));
		 
		 System.out.println("Thank you for shipping!");
		

	}

}
