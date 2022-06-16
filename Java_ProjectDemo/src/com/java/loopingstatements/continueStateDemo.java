package com.java.loopingstatements;

public class continueStateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		
		for(i=1;i<=10;i++) {//1 to 10
			
			//i=1 to 10
			//i=6 break;
			if(i == 6) {
				
				break;//iteration breaks when i=6
			}
//			
			//loop will continue
			if(i == 5)
			{
				continue;//iteration continues when i=5
			}
			
			System.out.println(i);
		}
	}

}
