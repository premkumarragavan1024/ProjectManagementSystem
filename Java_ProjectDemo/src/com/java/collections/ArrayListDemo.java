package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<datatype> objname = new ArrayList<>();
		
		 ArrayList<String> animals = new ArrayList<>();
	        // Add elements animals[0]="Dog" | animals[1] = "Cat" | animals[2]="Horse"
	        animals.add("Dog");//0
	        animals.add("Cat");//1
	        animals.add("90");//2
	        animals.add("Dog");//0
	        animals.add("Cat");//1
	        animals.add("90");//2
	        
	        System.out.println("Original ArrayList: " + animals);
	        
	        System.out.println(animals.size());
	        System.out.println(animals.get(1));
	        System.out.println(animals.set(1,"Test" ));

	        System.out.println("Changed ArrayList: " + animals);
	        
	        
	        animals.remove(2);
	        
	        System.out.println("Changed ArrayList: " + animals);
	        
	        System.out.println("Array with Integer numbers.................");
	        
	        ArrayList<Integer> noofdays = new ArrayList<>();
	        noofdays.add(20);
	        noofdays.add(40);
	        noofdays.add(60);
	        
	        
	        
	        Iterator<Integer> iterObj = noofdays.iterator();//iterObj=>  [20,40,60]
	        
	  	    int sum = 0;//20//60//120
	        
	        while(iterObj.hasNext()) {
	        	sum = sum + (iterObj.next());//20//40//60
	        }
	        
	        
	        System.out.println("sum :::: "+sum);
	        
	        
	}

}
