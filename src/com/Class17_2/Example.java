package com.Class17_2;
import com.Class17.Calculator;
public class Example {

	public static void main(String[] args) {
		// Calculator met = new Calculator();
		// System.out.println(met.sum(125, 150));    
	  
		 Example app= new Example(); 
	   System.out.println(app.example6('1'));
	
	
	}  
	
	    void example() { 
			 System.out.println("No return value and NO Parameters");  
			 }  
	    
	    void example2(String name) { 
		System.out.println("No return value but with Parameter : " + name);
		} 
	    
	    boolean example3() {
			System.out.println("With return value and NO Parameters"); 
			return true;    
			} 
	    
		String example4(String name) {
			System.out.println("No return value but with Parameter : " + name);
			return name; 
			} 
		
		boolean example5(String name) { 
		System.out.println("No return value but with Parameter : "+ name);
		return false;    
		}
		
		long example6(char name) {
		System.out.println("No return value but with Parameter : " + name);
		
		 return name;    
		 } 

		
		

	}


