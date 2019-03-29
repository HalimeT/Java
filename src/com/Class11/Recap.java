package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. create an array 	
		String[] names=new String[6];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva";
		
		for(int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
		//2.create an array using array literal
		System.out.println("-------for Loop-------");
		String[] studentNames= {"Ali","Inna","Hana","Zaki","Samir","Farah"};
		for(int i=0; i<studentNames.length; i++) {
			System.out.println(studentNames[i]);
		}
		
		//retrieve values using: advanced for loop, for each loop,enhanced for loop
		System.out.println("------Advanced for loop-------");
	for(String instructors:names) {
		System.out.println(instructors);
	}
			

	}

}
