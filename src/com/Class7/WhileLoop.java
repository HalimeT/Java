package com.Class7;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		while (a<10) {
			System.out.println("Good morning");
			a++;
		}
		
		int b=0;
		while(b<5) {
			System.out.println("Iam inside the while loop");
			b++;
		}
		System.out.println("I am outside of while loop");
		
		//I want to print values from 10 to 20 inclusive;
		
		int z=10;
		while(z<=20) {
			System.out.println(z);
			z++;
		}
		  //I want to print values from 1 to 20 inclusive but all in 1 line with space;
		int q=1;
		while(q<=20) {
			System.out.print(q+" ");
			q++;
		}
		System.out.println("---------------");
		 //I want to print values from 10 to 1;
		
		int e=10;
		while(e>=1) {
			System.out.print(e+" ");
			e--;
		}
		
		
		
	}

}
