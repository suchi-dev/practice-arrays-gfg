package com.test.sample.gfg;

public class ArrayReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = m2();
		for(int j =0; j < arr.length; j++) {
			System.out.print(arr[j] + "|");
		}
	}

	private static int[] m2() {
		// TODO Auto-generated method stub
		return new int []{1,5,10,15};
	}

}
