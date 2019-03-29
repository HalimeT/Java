package com.Class5;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// find the largest of 3 double values.
		double num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three different numbers respectively");
		
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		if(num1>num2 && num1>num3 ) {
			System.out.println(num1+" is the largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest number");
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest number");
		}else {
			System.out.println("The numbers that you entered are not distinct");
		}

	}

}
