package com.MyExamples;
import java.util.*;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int[] arr=new int[3];
		
		for(int i=0; i<=arr.length-1; i++) {
			
			System.out.println("Please, enter "+(i+1)+" st number");
			int num=scan.nextInt();
			sum=sum+num;
			arr[i]=sum;
			
		
			}
		System.out.println("The avarage of the numbers is "+arr[2]/arr.length);

		
		
	}

}
