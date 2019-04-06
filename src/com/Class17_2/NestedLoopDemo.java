package com.Class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedLoopDemo demo=new NestedLoopDemo();
		demo.Loop();
	}void Loop(){
		for(int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				if(m<10) {
					System.out.println(h+":0"+m);
				}
				else {
					System.out.println(h+":"+m);
				}
			}
			
		}

	}

}
