package com.java.OopsConcepts;


class Demo{
	//method definition
	public int demoMethod(int num1,int num2) {//demoMethod passing 2 variable as integer type
		System.out.println("Number result");
		
		return (num1+num2);
	}
	public int demoMethod() {//same method as demoMethod passing no arguments
		return 0;
	}
	 
	public double demoMethod(double d) {
		// TODO Auto-generated method stub
		return d;
	}
}


public class PolymorphismDemo {//main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
	  
		System.out.println("VALUE = "+d.demoMethod(6,7));//2 arg methos => 13
		System.out.println("VALUE = "+d.demoMethod());   //no arg method =>0
		System.out.println("VALUE = "+d.demoMethod(20)); //1 arg method => 20
	}

}
