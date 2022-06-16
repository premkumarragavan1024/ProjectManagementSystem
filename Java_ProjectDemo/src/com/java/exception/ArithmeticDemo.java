package com.java.exception;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		      // code that generate exception
		      int divideByZero = 5 / 8;//0
		      System.out.println("Rest of code in try block"+divideByZero);
		    }
		    
		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		
		
	      System.out.println("---------Finally block : block is always executed no matter whether there is an exception or not--------------" );
		
		
		
		try {
		      // code that generates exception
		      int divideByZero = 5 / 0;
		    }

		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		    
		    finally {
		      System.out.println("Contact Administrator");
		    }
		   
	
	}

}
//Output:
/*
 * ArithmeticException => / by zero*/
 