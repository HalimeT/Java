package com.MyExamples;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		Scanner scan=new Scanner(System.in);
	    int[] num= {1,15,84,95,99,88,40,20};
	  
	    
	    int i;
	    int oddNum=0;
	   
	     for( i=0; i<num.length; i++) {
	    	
	    	    oddNum=num[i]%2;
	       
	           if(oddNum==1) {
	        	
	        		   System.out.println(num[i]+" is odd number");
	        	   }
	     }	

	}
	}
