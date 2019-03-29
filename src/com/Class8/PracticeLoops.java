package com.Class8;

public class PracticeLoops {

	public static void main(String[] args) {
	
		//Print numbers from 1 to 100

		for(int a=1; a<=100; a++) {
			System.out.println(a);
		}
  
		//Print numbers from 100 to 1
		for(int b=100; b>=1; b--) {
			System.out.println(b);
		}
		 //Print odd numbers from 1 to 20 (2 ways)
		for(int x=1; x<=20; x+=2) {
			System.out.println(x);
		}
		//Print even numbers from 20 to 1 (2 ways)
		for(int y=20; y>=1; y-=2 ) { 
			System.out.println(y);
		}
		
	
		//Print even numbers between 20 and 50 (2 ways)
		for(int z=20;  z<=50; z+=2) {
			System.out.println(z);
		}
		
		for(int z=20;  z<=50; z++) {
			if(z%2==0) {
				System.out.println(z);
			}
		}
		
		//Print odd numbers between 20 and 50 (2 ways)
		for(int q=21; q<=50; q+=2) {
			System.out.println(q);
		}
		
		
		for(int q=20;  q<=50; q++) {
			if(q%2==1) {
				System.out.println(q);
			}
		}
		 
	}

}
