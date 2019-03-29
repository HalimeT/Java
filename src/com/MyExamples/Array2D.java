package com.MyExamples;

public class Array2D {

	public static void main(String[] args) {
		/*
		 * 
		 * 11  33   56  100
		 * 67  78   -9   19
		 * 12  20   97  -71
		 */
   
    	int[][] table=new int[3][4]; 
    	
    	table[0][0]=11;
    	table[0][1]=33;
    	table[0][2]=56;
    	table[0][3]=100;
    	
    	table[1][0]=67;
    	table[1][1]=78;
    	table[1][2]=-9;
    	table[1][3]=19;
    	
    	table[2][0]=12;
    	table[2][1]=20;
    	table[2][2]=97;
    	table[2][3]=-71;
    	
    	
    	
    	for(int i=0; i<=2; i++) {
    		for(int j=0; j<=3; j++) {
    			System.out.print(table[i][j]+" ");
    		}
    		System.out.println("");
    	}
    	
     }
	
	}

