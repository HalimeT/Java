package com.JavaReview2;

import java.util.Scanner;

public class ArraySpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		boolean found=false;
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]==6) {
			found=true;
			break;
			}
		}	
		if(found==true) {
			
			 System.out.println("6 is in the array");
		}else {
			System.out.println("6 is not in the array");
		}
			
			
	
		

	}

}
