package com.java.controlStatements;

import java.util.Scanner;

public class JavaSwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
					
			/*switch syntax:
			 * switch(variable){
			 * case 0:
			 * break;
			 * .
			 * .
			 * case n:
			 * default:
			 * .
			 * .
			 * 
			 * }
			 * 
			 * */
		
		//String number = "Add";
		//how to get value from user
		
		Scanner scan = new Scanner(System.in);//scan is called object  
		System.out.println("Please type Add | Sub | Mul:");
		String enterText = scan.next();//Add | Sub | Mul
		
		
		
		int a=1,b=2;
		
		
		switch(enterText) { //Add
		case "Add": //false
		  System.out.println("Number is 0"+(a+b));
		  break;
		case "Sub": 
				System.out.println("Number is 1 : "+(a-b));
				break;
		case "Mul": 
			System.out.println("Number is 2"+(a*b));
			break;
			default :
				System.out.println("Sorry please type correct value");
			
		
		
		}
		
			
	}

}
