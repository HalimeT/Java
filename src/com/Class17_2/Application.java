package com.Class17_2;

import com.Class17.Calculator;

 class Application {

	public static void main(String[] args) {
		 Calculator obj=new Calculator();
		 int add=obj.sum(12,34);
		 int s=obj.sub(60,30);
		 int d=obj.div(60,12);
		 int m=obj.mult(80,8);
		System.out.println(add);
		System.out.println(s);
		System.out.println(d);
		System.out.println(m);
		 

	}

}
