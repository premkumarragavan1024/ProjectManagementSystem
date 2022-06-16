package com.java.OopsConcepts;

//class A->class B->Class C

class onee{//Base
	public void print_hello() {
		System.out.println("Hello");
	}
}


class twoo extends onee{//Derived
	public void print_for() {
		System.out.println("World");
	}
}


class three extends twoo{
	public void print_world() {
		System.out.println("Intermediator");
	}
}

public class MultiLevelInhertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			three thr = new three();
			thr.print_hello();
			thr.print_for();
			thr.print_world();
	}

}
