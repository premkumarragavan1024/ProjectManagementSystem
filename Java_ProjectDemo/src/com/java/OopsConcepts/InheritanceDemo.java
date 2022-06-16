package com.java.OopsConcepts;

//Base class-Bicyle
class Bicycle{
//	Properties-state & behaviour
	
	//variables of bicycle(State)
	public int gear;//3
	public int speed;//100
	//Constructor - whenever class called constructor execute first
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	//methods of bicycle(Behaviour)
	public void applyBrake(int dec) {
		speed -=dec;//5- [speed = 100]-5 =?
	}
	public void speedUp(int inc) {
		speed +=inc;//1000 [speed = 100]+1000 =?
	}
	
	public String toString() {
		
		return ("No of gears are : "+ gear +" \n " + " speed of bicycle is : "+speed);
	}
	
	
	
}

//Derived - MountainBike
class MountainBike  extends Bicycle{

	public int seatHeight;//variable
	
	//constructor
	public MountainBike(int gear, int speed, int startHeight) {//3,100,25
		super(gear, speed);//base class
		this.seatHeight = startHeight;
	} 
	//Set method
	public void setHeight(int newvalue) {
		this.seatHeight = newvalue;
	}
	public String toString() {
		
		return (super.toString()+"\n seat height is : "+seatHeight);
	}

}


//Parent class
public class InheritanceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inheritance Sample");//execution starts here
		MountainBike mb = new MountainBike(3, 100, 25);//I called derived class with value(constructor with field value)
		System.out.println(mb.toString());
		
		
	}

}
