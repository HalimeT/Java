package com.Class14;

public class Task5 {

	public static void main(String[] args) {
		// 5. Write a java program to reverse String? Reverse a string word by word?
		
		String str="5. Write a java program to reverse String?";
		
		String rev="";
		for(int i=str.length(); i>0; i--) {
			rev+=str.substring(i-1,i);//44,45
		}System.out.println(rev);
		// 2nd way!
		String rev1="";
		char[] arr=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			rev1+=arr[i];
		}System.out.println(rev1);
		
		
		String[] word=str.split(" ");
		for(int i=word.length-1; i>=0; i--) {
			System.out.print(word[i]+" ");
		}
		
		
		
		
		
	
		
		
	   
	   

}
}