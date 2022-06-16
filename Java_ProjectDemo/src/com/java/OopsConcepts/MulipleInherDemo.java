package com.java.OopsConcepts;
 

interface one1{
	public void printThree();//only see method - no any details
}

interface two2{
	public void printTwo();//declaration no implementation details
}

interface three3 extends one1,two2{
	public void printThree();
}


//extends the class extended but while interface you cant use extend keyword instead use "implements"
class child implements three3{
	@Override
	public void printThree() {//implementation details
		System.out.println("Hello");
	}

	
	public void printTwo() {
		// TODO Auto-generated method stub
		System.out.println("World!!!");
		
	}
}
public class MulipleInherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.printThree();
		c.printTwo();
		c.printThree();
	}

}
