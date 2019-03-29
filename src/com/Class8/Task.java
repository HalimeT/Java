package com.Class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNum=scan.nextInt();
		
		System.out.println("Please enter ending number");
		int endNum=scan.nextInt();
		
		if(startNum<endNum) {
		
		     for(int i=startNum; i<=endNum; i++) {
			      System.out.println(i);
	         	}
		}else {
			System.out.println("I won't run your code");
		}	
	}
	

	}


