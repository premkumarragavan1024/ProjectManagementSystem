package com.java.Modifiers;

class  SubClass{

	private String name;//private variable
	public String department = "Computer science and engineering";
	
	
}

//Main class
public class PrivateDemo{
	
	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
 		//sub.name="Test";//private access so cannot be access inside & outside class
 	//	System.out.println(sub.name);
 		
 		
		System.out.println("Public variable access :"+sub.department);//public access so can be access outside class

		DefaultDemo defdemo = new DefaultDemo();
		defdemo.message(); 
	}
	
	
}