package com.class4;

public class mortageRate {
	public static void main(String[] args) {
		/*store variables to store mortgage rate and mortgage price
		 * if rate > 4.5 code "will not buy a house"
		 * otherwise user will consider buying
		 * once user decides to buy a house ,if price of house >than 200000-->
		 *                                        take a loan
		 *                                        otherwise pay cash
		 */
		
		double mortRate=3.8;
		
		int homePrice=500000;
		
			
			if (mortRate>4.5) {
				System.out.println("You are not able to buy a house!");
			}else {
				System.out.println("You are able to buy a house!");
				if(homePrice>=200000) {
					System.out.println("Take a loan!");
				}else {
					System.out.println("Pay cash!");
				}
			}
		
		
		
		
		
		
	}
	
}
