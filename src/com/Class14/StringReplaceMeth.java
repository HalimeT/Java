package com.Class14;

public class StringReplaceMeth {

	public static void main(String[] args) {
		//1 replace()
		String str="I am a good tester#1!";
		String newStr=str.replace("a","e");
		System.out.println(newStr);
		
		   String newStr1=str.replace("good", "great");
	        System.out.println(newStr1);
	            // what we are looking for to replace, new value
	        String newStr2=str.replace("tester", "programmer");
	        System.out.println(newStr2);
	        //do not replace
	        String newStr3=str.replace("Tester", "programmer");
	        System.out.println(newStr3);
	        
	        str=str.replace("!", "?");
	        System.out.println(str);
	        
	        System.out.println(str.replace("1", "2"));
		

	}

}
