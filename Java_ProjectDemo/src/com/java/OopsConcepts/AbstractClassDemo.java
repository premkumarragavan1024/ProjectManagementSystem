package com.java.OopsConcepts;

abstract class Shape{//Shape as Abstract
	//hiding internal details and showing functionality
	String color;
	abstract double area();
	public abstract String toString();//obj will be converted to String
	
	//Constructor-same class name for method
	public Shape(String color) {
		
		System.out.println("shape constructor called");
		this.color = color;
		
	}
	
	//get method
	public String getColor() {
		
		return color;
	}
	
	
}

//Sub class - implemention details
class Circle extends Shape{
	double radius;//2.5

	//Circle constructor
	public Circle(String color, double radius) {
		super(color);//method - extend class variable
		this.radius = radius;
	}
	 
	double area() {//rad=12
		return Math.PI * Math.pow(radius, 2);//π*r pow 2 =>π=22/7 {22/7 * (2.5)pow 2}
	}

	@Override
	public String toString() {
		return "Circle [area=" + area() + "] [ color="+super.getColor()+"]";
	}
	
	
	
}



public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		Shape s1 = new Circle("Yellow",2.5);
		System.out.println(s1.toString());
		
	}

}
