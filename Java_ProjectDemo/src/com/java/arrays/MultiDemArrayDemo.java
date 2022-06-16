package com.java.arrays;

public class MultiDemArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a 2d array
        int[][] a = {
            {1, 2, 3}, //{00,01,02}
            {4, 5, 6, 9} //{10,11,12,13}
           
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        
        System.out.println("values: " + a[0][1]);
        System.out.println("values: " + a[1][2]);
        
//        System.out.println("Length of row 3: " + a[2].length);
        
        System.out.println("--------------------------------------2D Calculation--------------------------------------");
        
     // create a 2d array
        int[][] dataentry = {
            {1, -2, 3}, //{00,01,02}
            {-4, -5, 6, 9}, //{10,11,12,13}
            {7}, //{20}
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: dataentry) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
        
        
        System.out.println("-------------------------------------3D Calculation--------------------------------------");
        
     // create a 3d array
        int[][][] test = {
            {//r0
              {1, -2, 3}, //{000,001,002}
              {2, 3, 4}//{010,011,012}
            }, 
            { //r1
              {-4, -5, 6, 9}, //{100,101,102}
              {1}, //{110}
              {2, 3}//{120,122}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
            	System.out.println("1D Array"+array1D[0]);
            	System.out.println("1D Array"+array1D[2]);
//            	System.out.println("1D Array"+array1D[3]);
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
	}

}
