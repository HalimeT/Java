package com.JavaReview3;

public class Arrays2D {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6,9},{7,8}};
		//------------Task1----
		for(int i=0; i<arr.length; i++) {
		System.out.println("The length of row "+(i+1)+" ="+arr[i].length);
	}
		
	    for(int[] a:arr) {
	    	System.out.println(a.length);
	    }
		
	//--------TASK2-------------------
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}System.out.println("");
	}

	 for(int[] a:arr) {
		 for(int elements:a) {
			 System.out.print(elements+" ");
		 }System.out.println("");
	 }
	
	}
	
	

}
