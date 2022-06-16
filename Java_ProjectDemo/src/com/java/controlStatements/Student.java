package com.java.controlStatements;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean tr =true;
		
		int x = 10;
		int y = 12;
		int z = 3;
		System.out.println("-------------if condition DEMO 1 ----------------------------");
		/*DEMO 1*/
		/**if condition:
		 * syntax: if(condition) => if(x > y) => true|False 
		 */
		
		if(tr)  
			System.out.println(tr);
			
		 
		System.out.println("-------------**if condition else DEMO 2 ----------------------------");
		//x+y=10+12=22 (22 > 3) //true
		/**if condition else:
		 * syntax: if(condition) => if(x > y){scope 1}else{scope 2} => true|False 
		 */
		//if((x+y) >  z) { //< , ==
		if(x ==  z) {//
			System.out.println(" Scope 1");
			
		}else {
			System.out.println(" Scope 2");
			
		}
		

		System.out.println("-------------/*Demo 3 - Nested if*/ DEMO 3 ----------------------------");
		/*Demo 3 - Nested if*/
		
		String city = "Delhi";
		
		if(city == "Mumbai") {//false
			System.out.println("s1="+city);
			
		}else if(city == "Tamil nadu") {//false
			System.out.println("s2="+city);
			
		}else if(city == "Delhii") {//false
			
			System.out.println("s3="+city);
			
		}else {
			System.out.println("Default value");
		}
		
		System.out.println("-------------/*Demo 3b - Nested if*/ DEMO 3 ----------------------------");
		/*Demo 3 - Nested if*/
		
		String address = "TamilNadu,India";//Memory M[0] TamilNadu  & M[1] India
		
		if(address.endsWith("India")) {//true
			//SCope 1
			if(address.contains("Goa")) {//false
				System.out.println("Your city is Goa");
			}else if(address.contains("Karnataka")) {//false
				System.out.println("Your city is Karnataka");
			}else {
				System.out.println(address.split(",")[0]);//TamilNadu
				System.out.println(address.split(",")[1]);//India
			}
			
			
		}else {
			//SCope 2
			System.out.println("You are not living in India");
		}
		
		
		
		
		
		
		
		
	}

}
