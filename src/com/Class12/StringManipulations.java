package com.Class12;

public class StringManipulations {

	public static void main(String[] args) {
		String str="Syntax";
		int lengthOfString=str.length();
		System.out.println(lengthOfString);//6
		
		String str1="Syntax Technologies";//19
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, Students!";//18
		System.out.println(str2.length());
		
            String str3="Hello";
            String newString=str3.toUpperCase();
            System.out.println(newString);  //HELLO
            
            System.out.println(str3.toLowerCase());//hello
            
        //equals() -compares 2strings, if strings are exactly equal 
            
            String str4="Hello";
            String str5="hello";
            boolean equality=str4.equals(str5);
            System.out.println(equality); //false
            
       //equalsIgnoreCase() --compare 2 strings but ignore case     
            String expectedBrowser="Chrome";
            String actualBrowser="chrome";
            boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
            System.out.println(equals); //true
	}

}
