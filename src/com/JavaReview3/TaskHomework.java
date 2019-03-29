package com.JavaReview3;

public class TaskHomework {

	public static void main(String[] args) {
		
	//	Write a program that prints last character of each word in a string   
		String str = "Syntax Technologies";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==(' ')) {
				System.out.println(str.charAt(i-1)+" "+str.charAt(str.length()-1));
				
			}
		}
		
		

	}

}
