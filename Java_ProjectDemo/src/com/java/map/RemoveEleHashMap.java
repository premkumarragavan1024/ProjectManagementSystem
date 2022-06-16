package com.java.map;

import java.util.HashMap;

public class RemoveEleHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> languages = new HashMap<>();
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    System.out.println("HashMap: " + languages);

		    // remove element associated with key 2
		    String value = languages.remove(2);
		    System.out.println("Removed value: " + value);

		    System.out.println("Updated HashMap: " + languages);
	}

}
