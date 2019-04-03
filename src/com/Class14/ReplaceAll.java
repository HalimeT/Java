package com.Class14;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="12Hello 3234 World 465%^%";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString);
		
//		String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//		System.out.println(replacedNoCharacter);
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));

	}

}
