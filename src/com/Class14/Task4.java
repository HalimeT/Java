package com.Class14;

public class Task4 {

	public static void main(String[] args) {
		//How to find out the part of the string from a string?      
		//What is substring? Find number of words in string?  
		
		String str="How to find out the part of the string from a string? ";     
		
		String[] newString=str.split(" ");  
		System.out.println(newString.length);            
		System.out.println(str.substring(str.length()/2));

	}

}
