package com.MyExamples;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the
		 * loop.package com.MyExamples; To determine whether a year is a leap year,
		 * follow these steps: 1 If the year is evenly divisible by 4, go to step 2.
		 * Otherwise, go to step 5. 2 If the year is evenly divisible by 100, go to step
		 * 3. Otherwise, go to step 4. 3 If the year is evenly divisible by 400, go to
		 * step 4. Otherwise, go to step 5. 4 The year is a leap year (it has 366 days).
		 * 5 The year is not a leap year (it has 365 days).
		 */
		for (int i = 1; i <= 10; i++) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please, enter a leap year.");

			int year = scan.nextInt();

			if (year % 4 == 0) {

				if (year % 100 == 0) {

					if (year % 400 == 0) {

						System.out.println(" The year is a leap year ");
                      break;
					  }else {
						System.out.println(" The year is not a leap year ");
					}

				} else {
					System.out.println(" The year is a leap year ");
				  break;
				}

			 } else {

				System.out.println("The year is not leap year");
			}

		}
	

	}
}
