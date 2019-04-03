package com.MyExamples2;

public class toCharArrayMethod {

	public static void main(String[] args) {
		
		String str=new String("Hello World myFriends.com1234");
		
		char[] arr=str.toCharArray();
		for(char letter:arr) {
			if(letter=='o') {
			System.out.println(letter);
			
		}
		 
		}

	}

}
