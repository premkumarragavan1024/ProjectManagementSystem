package com.java.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12}; //REG: 2+(-9)+0+5+(-25)+(22)+9+8+12 / totalof array
		   int sum = 0;//2//-7//-7//-2
		   Double average;
		   
		   // access all elements using for each loop
//		   for(int i=0;i<=numbers.length;i++) {
//			   sum+=numbers[i];
//			   
//		   }  // add each element in sum
		   for (int number: numbers) {
		     sum += number;
		     // 0+=2=>2 ; 2+=(-9)=-7 ;-7+=0=-7;-7+=5=>-2;-2+=12=>10;10+=(-25)=>-15;-15+=(22)=>7;7+=9=>16;16+=8=>24;24+=12=>36
		   }
		  //sum=>36(interger)
		   
		   System.out.println(sum);   // get the total number of elements
		   
		   int arrayLength = numbers.length;//10

		   // calculate the average
		   // convert the average from int to double
		   average =  ((double)sum / (double)arrayLength);//36/10

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
	}

}
