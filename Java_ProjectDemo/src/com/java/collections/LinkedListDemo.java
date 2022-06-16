package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new LinkedList<>();
//		List<Interger><Float><Double>

        // Add elements to the list
        numbers.add(1);//[0]
        numbers.add(2);//[1]x
        numbers.add(3);//[2]
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("List: " + numbers);
	}

}
