package com.JavaReview2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,2,3,4,5,6,7,8,9,10};
      
      int sum=0;
      for(int i=0; i<=arr.length-1; i++) {
    	  
    	 
    	  sum+=arr[i]; //sum=sum+arr[i];
    			 
      }
	 System.out.println("The sum of all array elements="+sum);
	
	} 

}
