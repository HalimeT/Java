package com.Class14;

public class Task1 {

	public static void main(String[] args) {
		//. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		
		
		     int x=10;
		     int y=7;
		     System.out.println("before swap two numbers, x: "+x+"  y:"+y);
		     x=x+y;//17
		     y=x-y;//10
		     x=x-y;//7
		     System.out.println("After swap two numbers, x: "+x+"  y:"+y);
		    
			
			String a=new String("Hello");
			String b=new String("Everyone!");
			System.out.println("before swap two Strings, a: "+a+"  b:"+b);
			a=a.concat(b);//HelloEveryone
			b=a.substring(0,a.length()-b.length());//(0,(13-8=5)) -hello
			  a=a.substring(b.length());//5
			  System.out.println("after swap two Strings, a: "+a+" b: "+b);
			  
			 
	}

}
