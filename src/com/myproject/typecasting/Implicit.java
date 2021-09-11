package com.myproject.typecasting;

public class Implicit {

	public static void main(String[] args) {
		
		byte small= 100;
		short shortCount= small;
		int integer= shortCount;
		
		long longCount= shortCount;
		float floatCount= 200.55555545454545f;
		double doubleCount= floatCount;
		
		
		System.out.println(small);
		System.out.println(shortCount);
		System.out.println(integer);
		System.out.println(longCount);
		System.out.println(floatCount);
		System.out.println(doubleCount);
		
	}

}
