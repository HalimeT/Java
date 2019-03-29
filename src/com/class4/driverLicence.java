package com.class4;

import java.util.Scanner;

public class driverLicence {
	public static void main(String[] args) {
		
		
		int age;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How old are you?");
		age=scan.nextInt();
		
		if(age>18){
			System.out.println("I will issue driver licence to you");
		}else if(age==18) {
			System.out.println("I will issue driver licence to you");
		}else {
			System.out.println("please get a learners permit");
		}
		
		
		
		
		
	}
	

}
