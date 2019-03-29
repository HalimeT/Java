package com.Class5;

import java.util.Scanner;

public class PeopleHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int height;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your height in inches");
		height=scan.nextInt();
		Double result=0.0833333*height;
		if(result<5) {
			System.out.println("You are short");
		}else if(result<6 && result>=5){
			System.out.println("You are medium");
		}else if(result>=6) {
			System.out.println("You are short");
		}

	}

}
