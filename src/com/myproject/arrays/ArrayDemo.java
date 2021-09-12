package com.myproject.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int no[]= new int[10];
		String users[]= new String[10];
		
		no[0]=22;
		no[1]=33;
		no[2]=44;
		
		users[0]="hi";
		users[1]="hii";
		users[2]="hiii";
		
		System.out.println(Arrays.toString(no));
		System.out.println(Arrays.toString(users));
	}

}
