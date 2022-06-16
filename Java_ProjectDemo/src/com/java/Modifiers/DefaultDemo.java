package com.java.Modifiers;

 public class DefaultDemo {

	 
		void message() {
			System.out.println("Default modifiers is access with packages");
		}
		
	
		
		public static void main(String[] args) {
			System.out.println(calculate()); //method call : method_name();
		}



		static int calculate() {//30
			
			int a=10;
			int b=20;
			
			
			 return +(a+b);
			
			
		}
		
		
		 
}
