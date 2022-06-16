package com.java.OopsConcepts;


class one{//Base class
	public void print_hello() {//method with definition
		System.out.println("class one :Hello");
	}
}


class two extends one{//Derived class
	public void print_for() {
		System.out.println("class two : World");
	}
}


public class SingleInheritDemo {//Main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			two g = new two();//Derived 
			g.print_hello();
			g.print_for();
			g.print_hello();
	}

}
