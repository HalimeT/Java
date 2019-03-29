package com.MyExamples;

public class ArrayFirstAndLastNumber {

	public static void main(String[] args) {
		
		int[][] arr={{1,2,6},
	               {6,1,2,3},
	               {13,6,1,2,3}};
	               boolean flag=false;
	              
	               
                for(int i=0; i<arr.length; i++){
	                 for(int j=0; j<arr[i].length; j++){
	                	 if(arr[i][0]==6) {
	                	 flag=true;
	                	 break;
	                 }
	                    if( arr[i][arr[i].length-1]==6){
	                    	flag=true;
	                    	break;
	                   
	               }else {
	                flag=false;
	                   } 
	            }
	                 System.out.println(flag);
	    
                }
	             
	}

}
