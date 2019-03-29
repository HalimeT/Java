package com.Class7;

public class Task {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
			
		
			if(day==6) {
				System.out.println("I DO not need a day off");
				workDay=false;
				
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}
		

	}

}
