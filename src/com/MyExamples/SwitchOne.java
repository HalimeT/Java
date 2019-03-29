package com.MyExamples;

import java.util.Scanner;

public class SwitchOne {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		char operator;
		double num1,num2,result;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an operator +,-,/,*");
		operator=scan.next().charAt(0);
		System.out.println("enter number1 and number2 respectively");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		
		
		switch(operator) {
		case'+':
			result=num1+num2;
		System.out.println(num1+"+"+num2+" equals "+result);
		break;
		
		case'-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+" equals "+result);
			break;
		case'*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+" equals "+result);
			break;
		case'/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+" equals "+result);
			break;
			default:
				System.out.println("In valid operator.");
				break;
		
		
		
		}
	}

}
