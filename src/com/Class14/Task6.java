package com.Class14;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		//6. Write a Java Program to find whether a String is palindrome or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word to check if it is palidrome");
		String str=scan.nextLine();
		String rev=""; 
		String output="";
	
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
			}
		
		if(rev.equalsIgnoreCase(str)) {
			output=" is palindrome";
		}else {
			output=" is not polindrome";
		}
		System.out.println(str+" "+output);
		

	}

}
