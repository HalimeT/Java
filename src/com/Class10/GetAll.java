package com.Class10;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[] names= {"John","Mike","Jane","Talgat","Olga","Mehmet","Siyar"};
  int a=3;
  System.out.println(names[a]);
  
  a+=2;
  System.out.println(names[a]);
  
  a-=4;
  System.out.println(names[a]);
  
  int size=names.length;
  System.out.println(size);
  
 /* System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);
	*/
  
    for(int i=0; i<size; i++) {
    	System.out.println(names[i]);
    	
    }
	}

}
