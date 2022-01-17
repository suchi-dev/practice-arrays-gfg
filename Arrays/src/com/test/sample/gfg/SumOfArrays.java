package com.test.sample.gfg;

public class SumOfArrays {
	
	public static void main(String[] args) {
		int [] arr = {3,1,2,5,4,7};
		sum(arr);
	}

	private static void sum(int[] arr) {
		int sum = 0;
		for(int i =0; i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("The sum of the elements are : "+sum);
		
	}

}
