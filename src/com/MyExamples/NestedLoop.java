package com.MyExamples;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=7;
		
		for(int i=1; i<=rows; i++  ) {
			      
			for(int k=1; k<=i; k++) {
				
				
				System.out.print(k+" ");
				
			}
			
			
			System.out.println("");
			
			
			}
		int row2=1;
		
		for(int i=6; i>=row2; i--  ) {
		      
			for(int k=1; k<=i; k++) {
				
				
				System.out.print(k+" ");
				
			}
			
			
			System.out.println("");
			
			
			}
		

	}

}
