package com.request.files;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean a = true ;//Primitive variable
		char s= 't';
		String test = "dsafadsfasfasf";
		System.out.println(a);
		System.out.println(s);
		System.out.println(test);
		
		System.out.println("==========================================================");
		Second sec = new Second();//Non-primitive variable  Classname objname=new classname(); class declaration format
		sec.additionCal();
		String strvalue = sec.test;
		System.out.println("String value from another class - "+strvalue);
		
		
		
		Third thr = new Third();
		thr.Substract();
		
		
	}

}
