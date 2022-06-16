package com.java.collections;

import java.util.*; 

public class ListArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);//x
        numbers.add(3);
        System.out.println("List: " + numbers);

//        // Access element from the list
//        int number = numbers.get(2);
//        System.out.println("Accessed Element: " + number);
//
//        // Remove element from the list
//        int removedNumber = numbers.remove(1);
//        System.out.println("Removed Element: " + removedNumber);
//        System.out.println("List: " + numbers);

        for(int test : numbers) {
        	System.out.println("test=>"+test);
        }
        
        Iterator<Integer> iteObj = numbers.iterator();
        while(iteObj.hasNext()) {
        	System.out.println("Iterated values: "+iteObj.next());
        }
        
        numbers.clear();
        System.out.println(numbers);
	}

}
