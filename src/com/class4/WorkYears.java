package com.class4;

import java.util.Scanner;

public class WorkYears {
	public static void main(String[] args) {
		/*
		 * ask user to enter # of work years
		 * and annual salary
		 * if workyear__==>5 years user is eligible for bonus  
		 *                         otherwise he is not
		 * once user is eliglible and salary __>than 50000  ...bonus=5000                         
		 *                          otherwise bonus=3000
        */
		
		int workYear;
		int annSalary;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your work year");
		workYear =scan.nextInt();
		System.out.println(" enter your annual salary");
		annSalary=scan.nextInt();
		
		if(workYear>=5) {
			System.out.println("You are eligible for bonus");
			if(annSalary>50000) {
				System.out.println("Your Bonus is 5000!");
			}else {
				System.out.println("Your bonus is 3000!");
			}
			
		}else {
			System.out.println("No bonus for you!");
		}
		
		
	}
	
	
	

}
