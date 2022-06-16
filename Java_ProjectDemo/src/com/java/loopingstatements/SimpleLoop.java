package com.java.loopingstatements;

public class SimpleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Looping statement - For loop
		/*For - syntax
		 * for(<Datatype of array> <Temp variable> : <Array iterate>)   ){
		 * 
		 *   Body of loop statement - by using temp variable any operations can be performed
		 * }
		 * 
		 * */
//		Array - index of memory [0]...[n] =>
		/*
		 * int a[3] ={20,30,40} or int[3] a ={20,30,40} 
		 * a[0]=20
		 * a[1]=30
		 * a[2]=40
		 * */
		
		int school[]= {20,40,60,80,100};//a.length=3 <5 ;4<5;
		
//		System.out.println("<=> array value<=>"+school[3]);
//		System.out.println("<=> array value<=>"+school[4]);

		for(int i=0; i < school.length;i++) {//memory - i++ school.length="5" 0<5
			System.out.println("school["+i+"] value=>"+school[i]); //school[0] = 20
		 
			//a=i;
		}
		 
		
		
		
//		int a=0 ;//initialize
//		System.out.println("a value=>"+a);
//		
//		
//		
//		
//		int b=0 ;//initialize
//		for(int i=3; i < school.length;++i) {//memory - i++
//			System.out.println("a value=>"+i); 
//			b=i;
//		}
//		System.out.println("b value=>"+b);
//		
//		
//		
//		
//		
//		//0 to 4 =a[i] 5-1 1000-1
//		
//		
//		//Example
		String[] arrData = {"Alpha","Beta","Gamma","Delta","Sigma"};
		System.out.println("Length of the string"+arrData.length);
		/* length = 5; 0 to 4
		 * 
		 * arrData[0]="Alpha"
		 *arrData[1]="Beta"
		 *arrData[2]="Gamma"
		 *arrData[3]="Delta" 
		 *arrData[4]="Sigma"
		 *for(array initialization; no of time iteration - arraysize ; increment/decrement)   )
		 */ 
		
		for(int i=0; i < arrData.length;i++) {//memory - i++
				System.out.println(+i+"<=> array value<=>"+arrData[i]);
			} 
		/*Step 1 : int i =3 ; 2 < 5 ; arrData[2] ; i++ (2+1)*/
			
			/*For each statement*/
			for(String temp : arrData) {
				
				System.out.println("For each statement Result => "+temp);
			}
//			
//			
	}

}
