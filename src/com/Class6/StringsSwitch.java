package com.Class6;

import java.util.Scanner;

public class StringsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country;
		String favoriteFood;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country!");
		country = scan.nextLine();

		switch (country) {
		case "USA":
			favoriteFood = "Burger";
			break;
		case "Turkey":
			favoriteFood = "Kebab";
			break;
		case "Italy":
			favoriteFood = "Pasta";
			break;
		case "Russia":
			favoriteFood = "Pelmeni";
			break;
		case "Kazakhstan":
			favoriteFood = "Beshparmak";
			break;
		case "Pakistan":
			favoriteFood = "Biryani";
			break;
		case"Morocco":
			favoriteFood="Couscous";
			break;
		default:
			favoriteFood = "Unknown";

		}
		System.out.println("My favorite food is " + favoriteFood);
	}

}
