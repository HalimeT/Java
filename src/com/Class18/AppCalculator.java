package com.Class18;
import java.util.Scanner;
public class AppCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("sum of the numbers: "+Calculator.sum(a,b,c));
		System.out.println("minimum of the numbers: "+Calculator.min(a,b,c));
		System.out.println("average of the numbers: "+Calculator.avg(a,b,c));
        System.out.println("maximum value of the numbers: "+Calculator.max(a,b,c));
	}

}
