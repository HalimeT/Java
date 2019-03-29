package com.JavaReview2;

public class NestedLoopPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	for(int i=1; i<=5; i++) {
			for(int k=1; k<=(5-i); k++) {
				System.out.print(".");
			}
			    for(int j=1; j<=i; j++) {
			
				        System.out.print(i);
				}
		
		             System.out.println("");

		}
	  /*Write a program to produce the following pattern
	   *....1
        ...22
        ..333
        .4444
        3+55555 
	   */
	for(int i=1; i<=5; i++) {
		for(int k=1; k<=(5-i); k++) {
			System.out.print(".");
		}
		   System.out.println(i);
	
	}    

	
	   /*Write a program to produce the following pattern
     *          ....1
     *          ...2.
     *          ..3..
     *          .4...
     *          5....
     */
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5-i; j++ ) {
			System.out.print(".");
		}	
		System.out.print(i);
		for(int k=2; k<=i; k++) {
		
	       System.out.print(".");
	
		}System.out.println();
	
	}
	

	
		
	
	   /*Write a program to produce the following pattern
     *          1....1....1
     *          .2...2...2.
     *          ..3..3..3..
     *          ...4.4.4...
     *          ....555....          
     */
for(int i=1; i<=5; i++) {
	 for(int k=2; k<=i; k++) {
		   System.out.print(".");
	    
	 }
	  System.out.print(i);
	  
	   for(int j=1; j<=5-i; j++) {
		   System.out.print(".");
	   }
	   System.out.print(i);
	   for(int j=1; j<=5-i; j++) {
		   System.out.print(".");
		   
	   }
	   System.out.print(i);
	   
	   for(int k=2; k<=i; k++) {
		   System.out.print(".");
	   }
	    
	  System.out.println();
	}

	
	
	}
}
	
	
	
	
	

