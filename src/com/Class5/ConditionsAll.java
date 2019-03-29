package com.Class5;

import java.util.Scanner;

public class ConditionsAll {
	public static void main(String[] args) {

		/*
		 * Ask user to enter price and boolean value for sale Based on the sale we will
		 * check the price if price<20 apply discount 20% and give final price if
		 * price>=20 and less 100 apply dicount 30% and give final price if prce >100 and
		 * less 500 apply discount 50% and give final price
		 */

		Scanner scan;
		boolean sale;
		int discount, price;
		double finalprice;
		scan = new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale = scan.nextBoolean();
		
		System.out.println("Please enter price of the item ");

	}
}