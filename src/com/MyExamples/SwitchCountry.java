package com.MyExamples;

import java.util.Scanner;

public class SwitchCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
		String language;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country!");
		country = scan.nextLine();

		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Russia":
			language = "Russion";
			break;
		case "Kazakhstan":
			language = "Kyrgyz";
			break;
		case "Pakistan":
			language = "Urdu";
			break;
		case"Germany":
			language="German";
			break;
			
		default:
			language = "Unknown";

		}
		System.out.println("Language spoken in "+country+" is " +language);
	}



	}


