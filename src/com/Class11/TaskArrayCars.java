package com.Class11;

public class TaskArrayCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] cars= {{"GMC","Ford","Mercury"},
				{"Audi","Mercedes","BMW"},
				{"Toyota","Nissan","Mazda","Honda"},
				{"Infinity","Lexus"}};
       
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}System.out.println("");
			
		}
		
		
	System.out.println("----TASK 2-------");
	
	String[][] countries= {{"Mexico","USA","Alaska"},
			{"Brasil","Peru","Uruguay","Panama","Argentina","Chile"},
			{"Germany","Netherland","Italy","Spain","Ireland","Greece"},
			{"South Africa","Niger","Angola","Nigeria"},
			 {"Russia","Kirghizistan","Turkmenistan","Pakistan"}};
   
	for(int i=0; i<countries.length; i++) {
		for(int j=0; j<countries[i].length; j++) {
			System.out.print(countries[i][j]+" ");
			
		}System.out.println("");
		
	}
	}

}
