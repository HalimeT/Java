package com.Class14;

public class ReplaceAll1 {

	public static void main(String[] args) {
         String str="12345Hello world *&^%$) one 123";
         
         System.out.println(str.replaceAll("[0-9]",""));
         System.out.println(str.replaceAll("[^A-Za-z]",""));
         System.out.println(str.replaceAll("[A-Za-z0-9]",""));
         
         String s="I love java and want to learn more";
         String[] b=s.split(" ");
         System.out.println("There are "+b.length+" words in the array");
          String c=s.replace(" ","");
          System.out.println("There are "+c.length()+ " letters in the array");
         
         

	}

}
