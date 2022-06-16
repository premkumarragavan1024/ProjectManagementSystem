package com.java.OopsConcepts;
public class ClassDemo{
	
	
	String name;//tiger
	String breed;//pomerian
	int age;//5
	String color;//white;
	
	
	

	//constructor -> whenever class is called constructor executed 
	//sync = //Object based arguments  
	public ClassDemo(String c_name, String c_breed, int c_age, String c_color) { //with parameter
		super();
		this.name = c_name;
		this.breed = c_breed;
		this.age = c_age;
		this.color = c_color;
	}



	 
	public ClassDemo() {
		super();
		// TODO Auto-generated constructor stub
	}



	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBreed() {
		return breed;
	}




	public void setBreed(String breed) {
		this.breed = breed;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}


//
//
	public String toString() {//toString==>pre-defined
		return "Hi this is Animal : '"+ this.getName() + "' Its breead is '" + this.getBreed()+
				"' Its Age is '"+ this.getAge()+ "' then finally its color is '"+this.getColor()+"'";
	}
//	
	
	//execution starts here
	public static void main(String[] args) {
		
		//class create
		//Class calling syntax : ClassName objname = new ClassName(arg....);
		
		
		ClassDemo obj=new ClassDemo("Tiger", "pomerian",5, "white");//constructor 
		System.out.println(obj);
		
		
	}
}











 