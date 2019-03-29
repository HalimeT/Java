package com.MyExamples;

public class Practice1 {

	public static void main(String[] args) {
		
		int sales=29800;
		String commisionRate="";
		
		if(sales>28000) {
		 commisionRate="8%";
			
		}else if(sales>=15000 && sales<=28000) {
			 commisionRate="6%";
			
		}else if(sales<15000){
			commisionRate="4%";
			}
		System.out.println("Commision rate is "+commisionRate);
		
		

	}

}
