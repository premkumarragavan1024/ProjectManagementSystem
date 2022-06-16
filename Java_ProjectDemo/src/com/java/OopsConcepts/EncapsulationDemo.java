package com.java.OopsConcepts;



//Access specifier , modifier =====> public,private,protected and default






//Binding up of state(variable) and behaviour(function/methods) within class
class EmployeeCount{//sub class
	
	
	public int noofemp = 0;//data member,variable
	//rightclick -> source -> generate getter and setter methods

	public int getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	
	
 
	
}







public class EncapsulationDemo {//main class

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		
		EmployeeCount empcount = new EmployeeCount();
		
		
		empcount.setNoofemp(1000);
		
		
		
		System.out.println((float) empcount.getNoofemp() + 500);//parsing double to int===> type casting/type conversion
	}

}
