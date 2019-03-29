
package com.MyExamples;
import java.util.Arrays;

public class DublicateNumber {

	public static void main(String[] args) {
		
	int[][] test= {{1,1,12,3,5},
	               {3,5,1,1,46},
	               {1,3,12,67,8},
	               {2,4,18,9,0}};
	
	for(int[] input:test) {

		System.out.println("dublicates: "+Arrays.toString(input));
	
	}

	}
}
