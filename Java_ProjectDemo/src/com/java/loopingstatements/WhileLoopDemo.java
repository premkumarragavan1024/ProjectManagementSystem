package com.java.loopingstatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*syntax:
		   while(condition)  
		  {
		   increment/decrement;
		   }
		   */
		System.out.println("----------- WHILE LOOP-------------");
//		/*For example*/
		int i=1;
		while(i<=10) {//1<=10 until 9 <  10
			System.out.println(i);
			i++;
		}
		System.out.println("-----------DO-WHILE LOOP-------------");
		/*syntax:
		 do  
		 {
		  increment/decrement;
		  
		 }while(condition);
		   
		 * */
		int j=1;
		/*For example*/
		do {
			System.out.println("do while value = "+j);
		j++;
		}while(j<=10);
	}

}
