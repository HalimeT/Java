package com.JavaReview;

public class Loops {

	public static void main(String s[]) {
		// TODO Auto-generated method stub
 for(int i=18; i>=0;  i-=3) {
	 System.out.println(i);
 }
 
 
     int a=18;
     while(a>=0) {
	     if(a%3==0) {
	    	  
		 System.out.println(a);
	     }
	     a--;
	
 }
     
     int e=18;
     do {
    	
    	 System.out.println(e);
    	 e-=3;
    	 
     }while(!(e<0));
    
     
    		 int x=1; 
    		 while(x<5) {    
    		    x++;    
    		    System.out.print(x);
    		 }
	
    		 int z=2, sum=0;
    		 while(z<9) {
    		    z++;
    		    sum=sum+z;
    		 }
    		 System.out.print(sum);
    		 
    		
    			   float fl = 5.3f;
    			   if (fl == 5.3) {
    			      System.out.println("Both are equal");
    			   } else {
    			      System.out.println("Both are not equal");
    			   }
    			   
    			   double discount;
    			   char code = 'C' ;
    			   switch ( code )
    			   {
    			   case 'A':
    			   discount = 0.0;
    			  
    			   case 'B':
    			   discount = 0.1;
    			   
    			   case 'C':
    			   discount = 0.2;
    			  
    			   default:
    			   discount = 0.3;
    			   
    			   }
    			   
    			   System.out.println(discount);
    			}
    		  
	
	}
	
	
	
	


