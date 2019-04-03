package com.Class15;

public class Dog {
	String name,bread;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Dog d1=new Dog();    
		   d1.name="Loly";   
		   d1.bread="Husky";  
		   d1.age=8;  
		  
		   d1.run();
		   d1.sit();
		   d1.eat();
		   Dog d2=new Dog();  
		   d2.name="Yaman";   
		   d2.bread="Sivas Kangal"; 
		   d2.age=2;   
		  
		   d2.run();  
		   d2.sit();
		   d2.eat();     
		   Dog d3=new Dog();   
		   d3.name="Boss"; 
		   d3.bread="Labrador";  
		   d3.age=11;  
		   
		   d3.run();  
		   d3.sit();  
		   d3.eat();

	}void run(){
		System.out.println(name+" who is a "+bread+" can run");
	}void sit(){
		System.out.println(name+" who is a "+bread+" can sit");
	}void eat(){
		System.out.println(name+" who is a "+bread+" can eat");
	}

}
