package com.test.sample.gfg;

public class MultiDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}

	}

}
