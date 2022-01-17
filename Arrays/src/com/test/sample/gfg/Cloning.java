package com.test.sample.gfg;

public class Cloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = { 1, 2, 3, 4 };
		int[] cloneArr = intArr.clone();
		
		System.out.println("Cloning in a single dimensional array");
		System.out.println(intArr == cloneArr);
		for (int i : cloneArr) {
			System.out.print(i + "-");

		}
		
		System.out.println();
		System.out.println("Cloning in a multi dimensional array");
		
		int [][] multiArr = {{1,2,3},{4,5}};
		int [] [] cloneMultiArr = multiArr.clone();
		
		System.out.println(multiArr == cloneMultiArr);
		System.out.println(multiArr[0] == cloneMultiArr[0]);
		System.out.println(multiArr[1] == cloneMultiArr[1]);
		
		

	}

}
