package com.Class12;

import java.util.Scanner;

public class StringMethodsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="";
		String password="";
		String confirm="";
		String message="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please, enter username");
		userName=scan.nextLine();
		System.out.println("please, enter password");
		password=scan.nextLine();
		System.out.println("please, confirm password");
		confirm=scan.nextLine();
		
		
	  if(!userName.isEmpty()&& !password.isEmpty()) {
			
			if(password.length()>=8) {
				
				if(!password.contains(userName)) {
					
					if(password.equals(confirm)) {
						 message="Your username and password has been created";
						
					}else {
						message="Password do not match";
						}
				}else {
					message="Password can not contain username!";
				}
			}else {
				message="Password is too short";
			}
		}else{
			message="Username and password can not be empty";
		}
	
	
	         System.out.println(message);
	
	}

	}


