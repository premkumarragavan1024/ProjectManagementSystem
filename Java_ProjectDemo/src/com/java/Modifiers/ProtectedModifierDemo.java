package com.java.Modifiers;

//we can access state or behaviour within a class(sub class) as well as same package
class Animal{
	
	protected void display() {
		
		
		System.out.println("Im inside display method in Animal class");
	}
	
	protected void add() {
		
		int a=10,b=20;
		System.out.println("Add= "+(a+b));
	}
	

	protected void sub() {
		
		int a=10,b=20;
		System.out.println("Sub= "+(a-b));
	}

}


//extends Animal
public class ProtectedModifierDemo extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an = new Animal();
		an.display();//objname.methodname or objname.variable
		
		ProtectedModifierDemo prodemo = new ProtectedModifierDemo();
//		
		prodemo.display();
		prodemo.add();
		prodemo.sub();
//		
		
	}

}
