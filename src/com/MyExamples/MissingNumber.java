package com.MyExamples;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int [51];
		int exp=50*51/2;
		
		for(int i=0; i<arr.length; i++) {
			if(i==40) {			
				continue;
			}
			arr[i]=i;
			}
         
		int sum=0;
		for(int j=0; j<arr.length; j++) {
			sum=sum+arr[j];
		}
		
		
		System.out.println("The missing number is "+(exp-sum)  );
	}

}
