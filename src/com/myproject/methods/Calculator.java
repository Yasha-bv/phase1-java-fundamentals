package com.myproject.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter first value:");
		Scanner sc1= new Scanner(System.in);
		int input= sc1.nextInt();
		System.out.println("enter second value: ");
		Scanner sc2= new Scanner(System.in);
		int input1= sc2.nextInt();
		Calculator1 c1 = new Calculator1();
		
		System.out.println(c1.add(input, input1));
		System.out.println(c1.sub(input, input1));
		System.out.println(c1.mul(input, input1));
	}
	}


	class Calculator1
	{
	
		public float add (int n1,int n2)
		{
			float c= n1+n2;
			return c;
		}
		
		public float sub(int n1, int n2)
		{
			float c= n1-n2;
			return c;
		}
		
		public float mul (int a, int b)
		{
			float c=a*b;
			return c;
		}
	}


