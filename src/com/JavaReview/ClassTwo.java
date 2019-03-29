package com.JavaReview;

import java.util.Scanner;

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 21;

		if (x % 2 == 0) {
			System.out.println("My number must be even");
		} else {
			System.out.println("My number must be odd");
		}

		int time=1900;
		if (time<=0700) {
			System.out.println("Good morning.");
		} else if (time <= 1205) {
			System.out.println("Good day");
		} else {
			System.out.println("Good evening");
	}
	
	
	boolean summer=true;
	boolean sunny=false;
	if(summer) {
		System.out.println("It is the summer");
		if(sunny) {
			System.out.println("we are going to beach");
		}else {
			System.out.println("we are not going to do beach");
		}
   }else {
			System.out.println("it is not the summer");
		}
	
	
	
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name=scan.nextLine();
	
	System.out.println("Enter your gender");
	String gender=scan.nextLine();
	
	System.out.println("Enter your age");
	int age=scan.nextInt();
	
	System.out.println("Enter your mobile number");
	long mobnum=scan.nextLong();
	
	
	System.out.println("Name: "+name);
	System.out.println("Gender: "+gender);
	System.out.println("Age: "+age);
	System.out.println("Mobile Number: "+mobnum);
		
	}
	
	
	
	
	
	}
	
	