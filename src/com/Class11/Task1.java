package com.Class11;

public class Task1 {

	public static void main(String[] args) {
		
		String[] cars= {"Toyota","Audi","Bmw","Lexus","GMC","Nissan"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		//-------advanced for loop---------
        for(String brands:cars) {
        	System.out.print(brands+" ");
        	
        	}
        System.out.println("-----TASK 2--------");
	
	String[] countries= {"Turkey","Argentina","Netherland","England"};
	
	for(int i=0; i<=3;i++) {
		
		if(countries[i].equals("Turkey")) {
			System.out.println("The capital of "+countries[i]+" is Ankara");
		}else if(countries[i].equals("Argentina")) {
			System.out.println("The capital of "+countries[i]+" is BuenosAires");
		}else if(countries[i].equals("Netherland")) {
					System.out.println("The capital of "+countries[i]+" is Amsterdam");
		}else if(countries[i].equals("England")) {
						System.out.println("The capital of "+countries[i]+" is London");
		}
		}
	System.out.println("-----2nd way---------");
	
	for(String country:countries) {
		switch(country) {
		case"Turkey":
			System.out.println("Ankara");
			break;
		case"Argentina":
			System.out.println("BuenosAires");
			break;
		case"Netherland":
			System.out.println("Amsterdam");
			break;
		case"England":
			System.out.println("London");
			break;
		}
		
		
	}
	
	}

}
