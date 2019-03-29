package com.MyExamples;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		Scanner scan;
		char grade;
		String exp;
		scan = new Scanner(System.in);
		System.out.println("Please enter your Grade");
		grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			exp = "Excellent";
			break;
		case 'B':
			exp = "Good";
			break;
		case 'C':
			exp = "Average";
			break;
		case 'D':
			exp = "Bad";
			break;
		default:
			exp = "Unknown";
		}System.out.println(grade+" is "+exp);

	}

}
