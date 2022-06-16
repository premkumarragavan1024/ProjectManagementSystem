package com.java.Modifiers;


class Data{
	private String name;//thulasy
	private String dept;//cse
	private String email;//thulasy@gmail.com
	
	
	
	
	//Name void getName(){} it does not return any value
	public String getName() {
		return name;
	}
	public void setName(String name) {//thulasy
		this.name = name;//thulasy = thulasy
	}
	
	//Dept
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}



public class GetterSetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//you can access a private variable using get & set method
		Data d = new Data();
		d.setName("Thulasy");
		d.setDept("CSE");
		d.setEmail("thulasy@gmail.com");
		
		
		
		System.out.println("Data of Thulasy");
		System.out.println(d.getName());
		System.out.println(d.getDept());
		System.out.println(d.getEmail());
		
		
		
	}

}
