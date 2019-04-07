package com.Class18;

public class MaxAndMin {
	public static int max(int[] array) {
		 int max = array[0];
		  for (int j:array){
			 if (j >= max) {  
				 max = j;
			 }}
			 return max;
			 
			 }
  public static int min(int[] array) {
						
					
	 int min = array[0]; 
    for (int i:array){
		 if (i <= min) {
				 min =i;
				  } 
			 }
		return min;
		
	}

}
