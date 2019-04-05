package com.Class17;

public class Task2 {

	public static void main(String[] args) {
	 Task2 num=new Task2();
	 num.oddOrEven(123);
	 num.oddOrEven(234);

	}
	void oddOrEven(int num) {
		if(num%2==0) {
			System.out.println(num+" is Even");
		}else if(num%2==1) {
		
			System.out.println(num+" is Odd");
		}
	}

}
