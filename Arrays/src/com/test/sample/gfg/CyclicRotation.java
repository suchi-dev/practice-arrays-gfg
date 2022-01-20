package com.test.sample.gfg;

public class CyclicRotation {
	
	public void cyclicRotation(int [] arr) {
		int x = arr[arr.length -1];
		
		for(int i = arr.length-1 ; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		CyclicRotation cr = new CyclicRotation();
		cr.cyclicRotation(arr);
		System.out.println("After cyclic rotation the elements are:");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ "|");
		}
		
		
		

	}

}
