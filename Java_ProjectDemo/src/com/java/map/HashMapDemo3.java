package com.java.map;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> languages = new HashMap<>();
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    System.out.println("Original HashMap: " + languages);

		    // change element with key 2
		    languages.replace(3, "C++");
		    System.out.println("HashMap using replace(): " + languages);
	}

}
