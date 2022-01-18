package com.test.sample.gfg;

public class RotateArrays {

	public void rotateArrays(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateByOne(arr, n);
		}
	}

	private void leftRotateByOne(int[] arr, int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RotateArrays rot = new RotateArrays();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		rot.rotateArrays(arr,2, 10);
		System.out.println("After rotating the array elements are: ");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + "|");
		}
		
		
		

	}

}
