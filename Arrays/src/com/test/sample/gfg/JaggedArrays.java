package com.test.sample.gfg;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int [][] arr = new int[2][];
		
		arr[0] = new int [3];
		arr[1] = new int[2];
		
		//Initializing an array
		
		for(int i=0; i < 2; i++) {
			for(int j =0; j < arr[i].length; j++) {
				arr[i][j]=count;
				count++;
			}
		}
		System.out.println("Printing the elements of jagged array");
		for(int i =0; i <2; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
