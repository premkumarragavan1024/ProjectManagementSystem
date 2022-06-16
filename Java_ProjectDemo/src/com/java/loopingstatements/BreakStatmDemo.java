package com.java.loopingstatements;
/* 
 * */
public class BreakStatmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=3;i++){    
             //inner loop  
             for(int j=1;j<=3;j++){    
                 if(i==2 && j==2){    
                     //using break statement inside the inner loop  
                     break;    
                 }    
                 System.out.println(i+" "+j);    
             } 
             
             
             
     }    
}  
	}

 
/*
 outerloop= i=1 (true);j=1(true) 1==2 && 1==2
 res = 1 1
 innerloop=>i=1 j=2
 res = 1 2
 res = 1 3 
 outerloop= i=2 (true);j=1(true) 1==2 && 1==2
 res 2 1
  
 
 outerloop= i=3 (true);j=1(true) 1==2 && 1==2
 
 */