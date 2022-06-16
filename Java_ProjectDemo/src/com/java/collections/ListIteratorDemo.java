package com.java.collections;

//import java.util.LinkedList;
//import java.util.List;

import java.util.*;



public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name = new LinkedList<>();
		name.add("Janary");
		name.add("Febrary");
		name.add("March");
		name.add("April");
		name.add("May");
		
		System.out.println("Original List size     :::"+name.size()+" :::: DATA :::::"+name);

		
		System.out.println("Forward Iterations-------------------------_>>>>");
		ListIterator<String> itObj = name.listIterator();
		while(itObj.hasNext()) {
			System.out.println("Lsit Iterated value : "+itObj.next());
		}
		
		System.out.println("Backward Iterations-------------------------_>>>>");
		while(itObj.hasPrevious()) {
			System.out.println("Lsit Iterated value : "+itObj.previous());
		}
		
	}

}
