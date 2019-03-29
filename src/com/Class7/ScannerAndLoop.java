package com.Class7;
import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner scan;
		int a=1;
		
		scan=new Scanner(System.in);
		
		while(a<=3) {
			System.out.println("Please enter your name");
		    name=scan.nextLine();
		    System.out.println("You are doing great "+name);
		    a++;
        }
            		

	}

}
