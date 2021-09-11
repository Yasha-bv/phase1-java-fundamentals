package com.myproject.typecasting;

public class Explicit {
	public static void main(String[] args) {
	
		double doubleCount= 200.55555545454545;
		float floatCount= (float) doubleCount;
		long longCount= (long) doubleCount;
		int integer= (int)longCount;
		short shortCount= (short) floatCount;
		byte small= (byte) integer;
		
		
		
		System.out.println(small);
		System.out.println(shortCount);
		System.out.println(integer);
		System.out.println(longCount);
		System.out.println(floatCount);
		System.out.println(doubleCount);
		
	}
}
