package com.MyExamples2;

public class StringReplaceMethods {

	public static void main(String[] args) {
		//replace(char(old),char(new))   replaceFirst()    replaceAll()
		
		//String[] split(String regex)
		//String[] split(String regex, int limit)
	
		String str=" www.myFirstBook.com";
		System.out.println(str.replace("w", "c"));
		System.out.println(str.replace("m","net"));
	
		System.out.println(str.replaceFirst("Book","Pencil"));
		System.out.println(str.replaceFirst("m","net"));
		
		System.out.println(str.replaceAll("(.*)my(.*)","Welcome"));
	 //String Split
	    String str2= "apple,banana,orange,strawberry,lemon,grape,patato,domato,okra,eggplant";
	    String[] fruits=str2.split(",");
	   
	    for(String i:fruits) {
	    	 
	    	 System.out.print(i+" ");
	  
	     }
	
	
	
	
	
	
	
	}
	
	
}

