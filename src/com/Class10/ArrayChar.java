package com.Class10;

public class ArrayChar {

	public static void main(String[] args) {
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

		//2.Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).

		//3.Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using element of array: “Saturday is Java coding Day”.
		///////TASK 1
		char[] letters;
		letters=new char[6];
		letters[0]='A';
		letters[1]='B';
		letters[2]='C';
		letters[3]='D';
		letters[4]='E';
		letters[5]='F';
		
		System.out.println(letters[1]);
		
		//second way!
		char[] arrays= {'A','B','C','D','E','F'};
		System.out.println(arrays[1]);
		
		
		///////TASK 2
		
		String[] names= {"Temiz","Aksoy","Ozcan","Gunes","Demir"};
		System.out.println(names[0]);
		
		
		String[] name;
		name=new String[5];
		name[0]="Temiz";
		name[1]="Aksoy";
		name[2]="Ozcan";
		name[3]="Gunes";
		name[4]="Demir";
		System.out.println(name[0]);
		
		//////Task3
		String[] words= {" Java","Saturday"," Day"," Coding"," is"};
		
		String sentence=words[1]+words[4]+words[0]+words[3]+words[2];
		System.out.println(sentence);
		
		int 
		
		
		

	}

}
