package com.Class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if number is btwn 1-10-->number is small
		 * if number is btwn 11-100-->number is medium
		 * if number is btwn 101-1000-->number is large		
		 */
		int num=15;
		
		//true AND false-->False
		if(num>1 && num<=10) {
			System.out.println("number is small");
			
			//true AND true-->True
		}else if(num>=11 && num<=100) {
			System.out.println("number is medium");
			
			//false AND true-->false
		}else if(num>=101 && num<=1001) {
		System.out.println("number is large");
		
		}else {
			System.out.println("Number is not in our range ");
		}

	}
	

}
