package com.Class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ask user to enter age and based on the age we will print:
		 * if age is > than 1 but < than3-->baby
		 * if age is > than 3 but < than 5-->toddler
		 * if age is >than 5 but < than 13-->kid
		 * if age is > than 13 but < 20 than -->teenager
		 * if age is> than 20 but <64 than-->adult
		 * if age is equal or older than 64-->senior
		 */
		
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your age");
		age=scan.nextInt();
		if(age>1 && age<=3) {
			System.out.println("You are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("You are a toddler");
		}else if(age>5 && age<=13) {
			System.out.println("You are a kid");
			
		}else if(age>13 && age<=20) {
			System.out.println("You are a teenager");
		}else if(age>20 && age<=64) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are senior");
		}
		

	}

}
