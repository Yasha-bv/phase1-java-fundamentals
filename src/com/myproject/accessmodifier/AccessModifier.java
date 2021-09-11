package com.myproject.accessmodifier;

public class AccessModifier {

	public static void main(String[] args) {
		
		Park pk= new Park();
		System.out.println(pk.size);
		System.out.println(pk.name);
		pk.MyPark();
		pk.Name();
	}
	}
	
	class Park{
		
		public int size= 123;
		public String name= "Lansang Park";
		
		public void MyPark(){
			System.out.println("Size of my park is "+size);
		}
		
		public void Name() {
			System.out.println("Name of my park is "+ name);
		}
	}

