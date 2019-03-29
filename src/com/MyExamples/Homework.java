package com.MyExamples;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*3. Print the following pattern:
1
12
123
1234
12345

4. Print the following pattern:
*
**
***
****
*****
****
***
**
*/

	for(int i=1; i<=5; i++) {
		
		for(int k=1; k<=i; k++) {
			 System.out.print(k);
		}
		
		System.out.println(" ");
	}	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	for(int i=1; i<=5; i++) {
		 for(int k=1; k<=i; k++) {
			 
			 System.out.print("*");
			 
		 }
		 System.out.println(" ");
	}
	 for(int i=1; i<=4; i++) {
		 
		 for(int k=4; k>=i; k--) {
			 System.out.print("*");
			 
		 }
		 System.out.println(" ");
	 }
	 //.......................................................
	 
	 for(int i=1; i<=5; i++) {
		 for(int k=1; k<=i; k++) {
			 
			 System.out.print(k);
			 
		 }
		 System.out.println(" ");
	 }
	

	 for(int i=4; i>=1; i--) {
		 
		 for(int k=1; k<=i; k++) {
			 System.out.print(k);
			 
		 }
		 System.out.println(" ");
	 }
	
	
		
	}

}
