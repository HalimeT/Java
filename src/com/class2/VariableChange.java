package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		String name, lastName, state;
// values of variables can be changed.
		name = "mahir";
		lastName = "temiz";
		System.out.println(lastName);
		lastName = "tmz";

		state = "TX";

		char grade = 'A';
		// char grade='A'; do not work
		grade = 'A';

		String city = "Dallas";
		city = "NewYork"; // value of variable is changed

		long phoneNumber = 567908345;
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);


	}

}
