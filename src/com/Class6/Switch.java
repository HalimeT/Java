package com.Class6;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=6;
		String dayName;
		
		switch(day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Tuesday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		
		default:
			dayName="Unknown";
		}System.out.println("Today is "+dayName);
			
		
		

	}

}
