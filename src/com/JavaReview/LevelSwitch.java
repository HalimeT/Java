package com.JavaReview;

import java.util.Scanner;

public class LevelSwitch {

	public static void main(String[] args) {
		Scanner scan;
		String level;
		int output=0;
		scan=new Scanner(System.in);
		System.out.println("Enter your level of experience");
		level=scan.nextLine();
		
		switch(level){
			case "Beginner":
				output=1;
				   break;
			case "Intermediate":
				output=2;
				break;
			case "Expert":
				output=3;
				break;
			default:
			
	
	}
		System.out.println(output);

}
}