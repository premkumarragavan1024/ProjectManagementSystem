package com.java.loopingstatements;

public class SummingElementLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] emp= {"empA","empB"}; //=> empA:name,id,addres,phone
//Sum of all elements of an array 100,200,300,400,500 = sum??
		
		//Array initialization
		int [] arr = {100,200,300,400,500};//arr.length=5
						
		//arr[0] 	=100;			sum=sum+a[0]=100 ==> 0 = 0+100 = 100 => sum=100
		//arr[1]	=200;			100=100+a[1]=300 ==> 100 = 100 + 200 => sum=200
		//arr[2]	=300;			200=200+a[2]=500 ==> 200 = 200 + 300 => sum=300
		//arr[3]	=400;
		//arr[4]	=500;
		
		
		//Desc : Summing up 100+200+300+400+500=>idea:a=a++;
		
		
		
		float sum = 0;//global variable
		
		for(int data = 0;data < arr.length ; data++) {//data-local
			//0=0+arr[0]=> 100= 0+100 = >sum=100
			//100=100+200=>sum=300
			//300=300+300=>sum=600
			//600=600+400=>sum=1000
			//1000=1000+500=>sum=1500
			sum = sum + arr[data];
			System.out.println(data+"=>sum<="+sum);
		}
		
		
		
		System.out.println("Exact result of sum of all elements: "+sum);
		
		
		
		
		
		
		
		
	}

}
