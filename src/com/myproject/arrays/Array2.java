package com.myproject.arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		
		System.out.println(Arrays.toString(num));

		System.out.println("Element at index 2 is "+ num[2]);
		System.out.println("Element at index 4 is "+ num[4]);
		
		for (int index=0; index<num.length; index++)
			System.out.println("Element at index at "+index+ "is "+num[index]);
	}

}
