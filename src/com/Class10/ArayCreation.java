package com.Class10;

public class ArayCreation {

	public static void main(String[] args) {
              //index 0, 1, 2,  3	   
		int[] array= {10,20,30,40};
		
		System.out.println(array[2]);
		
		//size of array..output will consider how many value carried by array.
		System.out.println(array.length);
		
		//string of names--5
		String[] names= {"john","Mike","Jane","Talgat","Olga"};
		
		System.out.println("There are "+names.length+" values in my array of names");
		
		System.out.println(names[2]);
		
		//int[] numbers;
		//numbers={1,2,3,4};   does not work!
		
	}

}
