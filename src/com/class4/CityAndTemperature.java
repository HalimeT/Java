package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	/* ask user to enter city and temperature in Fahrenheit
	 * your program should convert F..>..C
	 * 
	 */
	public static void main(String[] args) {
		
		String cityName;
		int temp;
		
        Scanner scan=new Scanner(System.in);
        
		System.out.println("Please enter your city?");
	     cityName=scan.nextLine();
	     
	     System.out.println("Please enter temperature in Fahrenheit");
	     temp=scan.nextInt();
	     
	     //formula (F-32)x5/9
	     int convertedTemp=(temp-32)*5/9;
	     System.out.println("the temperature in the city "+ cityName+" is "+convertedTemp+"C");
	     
	     
	     
		
	}

}

