package com.Class17;

public class Greetings {

	public static void main(String[] args) {
		Greetings obj=new Greetings();
		obj.hello();
		//how to find largest number
		obj.findLargest(20, 10);
		obj.findLargest(30, 40);
		obj.findLargest(230, 10000);
		obj.helloToInstructor("Awet");
		obj.helloToInstructor("Weqas");

	}
	void helloToInstructor(String name) {
		System.out.println("Hello "+name);
		
	}
	void hello() {
		System.out.println("Hello");
	}
	void findLargest(int a,int b) {
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
	}

}
