package com.myproject.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo demo= new MethodsDemo();
		demo.message();
		demo.parameterized(30);
		demo.Account(23000, 23000);
		MethodsDemo.parameterized(33);
	}

	public void message()
	{
		System.out.println("welcome");
	}
	
	public static void parameterized(int age)
	{
		System.out.println("age is : "+ age);
	} 
	
	public void Account(int salary, int income)
	{
		System.out.println("The user has "+ salary +" as "+ income);
	}
}
