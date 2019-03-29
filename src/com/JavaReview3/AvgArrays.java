package com.JavaReview3;

public class AvgArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] arr = { { 2, 6, 9, 3, 7 },
		            { 1, 7, 9, 4, 8 }, 
		             { 0, 4, 6, 2, 5 }, 
		             { 0, 1, 2, 3 } };
		  //____average of 3rd  coloum_____
 double sum=0;
 for(int i=0; i<arr.length; i++ ) {
	
		 sum+=arr[i][2];
		 
	 }
	 System.out.println(sum/arr.length);
	 
 }

	}


