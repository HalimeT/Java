package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] groceryList= {{"Apple","Pear","Banana"},
				{"Onion","Avacado","EggPlant","Cucumber"},
				{"Cheese","Butter","Yoghurt","Cream"}};
		
		for(int i=0; i<groceryList.length; i++) {
			for(int j=0; j<groceryList[i].length; j++) {
				System.out.print(groceryList[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(String[] list:groceryList) {
			for(String item:list) {
				System.out.print(item+" ");
				
			}
			System.out.println();
		}

	}

}
