package com.java.readValue;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("----------------DEMO 1 next() method----------------");
		System.out.println("Enter Full name :");
		Scanner scan = new Scanner(System.in);//Scan obj read the value from the user
		String firstname = scan.next();//next() read the first token
		String lastname = scan.next();//read the second token
		
		//to print these tokens
		System.out.println("First name : "+firstname);
		System.out.println("Last name : "+lastname);
		/*Output
			----------------DEMO 1 next() method----------------
			Enter Full name :
			vijay kumar
			First name : vijay
			Last name : kumar
		*/	

		
		
		System.out.println("----------------DEMO 2 Read file method----------------");
		Scanner readnxt = new Scanner(System.in);
		String input  = readnxt.next();
		System.out.println("Read a line:"+input);
		/*Output
				 * ----------------DEMO 2 Read file method----------------
		hello world
		Read a line:hello
*/
	 
		System.out.println("----------------DEMO 3 hasnext() method----------------");
		String sample = "Hello 5 world";
		Scanner readhsnxt = new Scanner(sample);
		readhsnxt.useLocale(Locale.US);//to interpret Ints in String
		String a[] ;
		 
		while(readhsnxt.hasNext()) {//iterate - hasNext() until it string ends
			System.out.println(""+readhsnxt.hasNextInt()+"");//true/false
			System.out.println("=>"+readhsnxt.next()+"\n");
		 
			 
		}
		
		
		readhsnxt.close();
	}

}
