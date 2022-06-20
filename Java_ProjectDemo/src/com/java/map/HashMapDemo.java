package com.java.map;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Map<String,String> numbers = new HashMap<>();

	        // Insert elements to the map
	        numbers.put("AC000001","Gopinath");
	        numbers.put("AC000002","Lakshmi");
	        System.out.println("Map: " + numbers);

//	        // Access keys of the map
	        System.out.println("Keys: " + numbers.keySet());
//
//	        // Access values of the map
	        System.out.println("Values: " + numbers.values());
//
//	        // Access entries of the map
	        System.out.println("Entries: " + numbers.entrySet());
//
//	        // Remove Elements from the mapg
	        //get(1) * remove(2)
	        //indexOf("Gopinath")
	        
	         
	        String value = numbers.remove("AC000001");
	        System.out.println("Removed Value: " + value);
	}

}
