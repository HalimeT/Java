package com.Class17_2;

public class ScannerClass {

public static void main(String[] args) {     
			 ScannerClass obj = new ScannerClass();     
			 Scanner scan = new Scanner(System.in);  
			 int a = scan.nextInt();       
			 int b = scan.nextInt();       
			 int d =12;               
			 int c = obj.sum(d, 123);        
			 System.out.println(obj.sum(a, b));   
			 //        obj.sum(12, 13);
			 //        obj.sum(100, 100);      
			 //        obj.sub();
			 //        obj.sub();          
 }  

         int sum(int a, int b) {  
				 //        System.out.println(x +y);  
				 return b+a;          
 }        void sub() {      
	       int a=10, b=12; 
	         System.out.println(a - b);     
	 
		                
		 
		 }

	}


