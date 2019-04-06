package com.Class17_2;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * I want to print pattern
		 *  123456789---5rows & 9 columns
		 *  123456789 
		 *  123456789
		 *  123456789 
		 *  123456789
		 */
		NestedLoops demo=new NestedLoops();
		demo.Loop();
		
	}void Loop(){
		for (int i = 1; i < 6; i++) {

			for (int y = 1; y <= 9; y++) {
				System.out.print(y);
			}

			System.out.println("");
		}

		/*
		 * pattern 1111111
		 *         2222222
		 *         3333333 
		 *         4444444 
		 *         5555555 
		 *         6666666 
		 *         7777777
		 */

		for (int i = 1; i <= 7; i++) {

			for (int y = 1; y <= 7; y++) {
				System.out.print(i);
			}

			System.out.println("");
		}
		/* Pattern
            *****
		 *  ***** 
		 *  *****
		 *  *****
		 */ 
		
		
		for (int i = 1; i <=4; i++) {

			for (int y = 1; y <= 5; y++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		
		for(int i=1; i<5; i++) {
			for(int y=5; y>0; y--) {
				System.out.print(y);
				}
			System.out.println();
		}

		for(int i=5; i>0; i--) {
			for(int y=5; y>0; y--) {
				System.out.print(i);
				}
			System.out.println();
		}
		
		
       int rows=4;
		
		for(int i=1; i<=rows; i++  ) {
			      
			for(int k=1; k<=i; k++) {
				
				
				System.out.print("*");
				
			}
			System.out.println();
	}
		}
	}

	


