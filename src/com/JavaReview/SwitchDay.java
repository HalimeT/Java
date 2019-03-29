package com.JavaReview;

import java.util.Scanner;

public class SwitchDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		String output="";
		String dayName;
		scan=new Scanner(System.in);
		System.out.println("Enter the name of the day");
		dayName=scan.nextLine();
		
		switch(dayName){
			case"Monday":
				output="First";
				   break;
			case"Tuesday":
				output="Second";
				break;
			case"Wednesday":
				output="Third";
				break;
			case"Thursday":
				output="Fourth";
				break;
			case"Friday":
				output="Fifth";
				break;
			case"Saturday":
				output="Sixth";
				break;
			case"Sunday":
				output="Seventh";
				break;
				
				default:
					output="unknown";
		}
		System.out.println(output+" day of the week");

	}

}
