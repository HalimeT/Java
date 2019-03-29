package com.Class12;

public class StringManupulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Students";
		
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
		
		
		System.out.println("-------indexOf()-------");
		String str1="Sunday";
		System.out.println(str1.indexOf("n"));
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Technologies"));//7
		System.out.println(str2.indexOf(" "));//6
		System.out.println(str2.indexOf("W"));//-1 means does not exist
		
		
		String str3="Today is Sunday Java class";
		String newString=str3.substring(8);//Sunday Java class
		System.out.println(newString);
		System.out.println(str3.substring(16));//Java class
		
		
		System.out.println(str3.substring(0,5));//Today
		System.out.println(str3.substring(9,20));//Sunday Java
		System.out.println(str3.substring(16,20));//Java
		System.out.println(str3.substring(21));//class
		
		
		
		

	}

}
