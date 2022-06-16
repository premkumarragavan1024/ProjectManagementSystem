package com.java.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);
        
        
        System.out.println("numbers: " + numbers);
        
        //Remove Element
		LinkedHashMap<String, Integer> numbers1 = new LinkedHashMap<>();
		numbers1.put("n1", 1);
		numbers1.put("n2", 2);
		numbers1.put("n3", 3);
        System.out.println("LinkedHashMap: " + numbers1);

        // remove method with single parameter
        int value = numbers1.remove("n2");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers1.remove("n3", 3);//true/false
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + numbers1);
	}

}
