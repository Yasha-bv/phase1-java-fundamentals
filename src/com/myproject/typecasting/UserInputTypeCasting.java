package com.myproject.typecasting;

import java.util.Scanner;

public class UserInputTypeCasting {

	public static void main(String[] args) {
		
		System.out.println("Enter you number  ");
		Scanner sc= new Scanner (System.in);
		float userInput= sc.nextFloat();
		
		System.out.println("User Input is: "+ userInput);
	
		
		//int intCount= userInput;
		float fl= userInput;
		double db= userInput;
		
		System.out.println(db);
		System.out.println(fl);
		
	}

}
