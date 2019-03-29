package com.Class5;

import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int quiz,midterm,finals;

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your quiz,midterm and final scores respectively");
		quiz=scan.nextInt();
		midterm=scan.nextInt();
		finals=scan.nextInt();
		double avrg=(quiz+midterm+finals)/3;
		
		System.out.println("Average score is "+avrg);
		
		if(avrg>=90) {
			System.out.println("grade A");
		}else if(avrg>=70 &&avrg<90) {
			System.out.println("Grade B");
			
		}else if(avrg>=50 &&avrg<70) {
			System.out.println("Grade C");
		
		
	}else if(avrg<50) {
		System.out.println("Grade F");
	}
		}
	

}
