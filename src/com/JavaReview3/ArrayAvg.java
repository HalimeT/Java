package com.JavaReview3;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[][] arr = { { 2, 6, 9, 3, 7 },
				            { 1, 7, 9, 4, 8 }, 
				             { 0, 4, 6, 2, 5 }, 
				             { 0, 1, 2, 3 } };
		   double sum=0;
		   for(int i=0; i<arr[1].length; i++) {
			   sum+=arr[1][i];
			   }
			System.out.println("The avarage is "+sum/arr[1].length);

			// Find the number of values above the value of 7.
			int count=0;
			 for(int[] inner:arr) {
				 for(int num:inner) {
					 if(num>7) {
					 count++;
					 }
				 }  
			 }	
			 System.out.println(count);
	
	
	
	}

}
