package com.Class11;

public class NamesGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] names= {{"John","Jane","Sara","Hana"},
				           {"A",     "C",   "B",  "F"}
		                      };
		System.out.println(names[0][0]+"'s grade is "+names[1][0]);
		System.out.println(names[0][2]+"'s grade is "+names[1][2]);
     
		String[][] food= {{"Burger", "Fries", "Hot dog", "meatloaf"},
				          {"lo Mein","fried rice"},
				          {"biriyani","korma","naan","chick peas"}};
		
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length; j++) {
				System.out.print(food[i][j]+" ");
				
			}
			System.out.println("");
		}
		

	}

}
