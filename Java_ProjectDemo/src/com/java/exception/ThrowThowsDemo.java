package com.java.exception;

import java.io.*; 

public class ThrowThowsDemo {
	
	
	public static void divideByZero() {

	    // throw an exception
	    throw new ArithmeticException("Trying to divide by 0");
	  }
	
	public static void findFile() throws ArithmeticException,IOException {

		int a=5/0;
	    // code that may generate IOException
	    File newFile = new File("test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }
		
	public static void arraybound(){
		
		int arr[]= {1,2,3,4,5};//0 to 4
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);//arr[5]
		}
	}
	
	
	  public static void main(String[] args) {

		//  divideByZero();
		  
		  
		  
		  try {
	      //findFile();//method call
			  arraybound();
	    }
//	    catch (IOException e) {
//	      System.out.println(e.getMessage());
//	    }
	    catch(ArithmeticException e1) {
	    	System.out.println(e1.getMessage());
	    	 
	    }catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("ArrayIndexOutOfBound"+e);
	    } 
	  }
	 //Output:  java.io.FileNotFoundException: test.txt (No such file or directory)
}
