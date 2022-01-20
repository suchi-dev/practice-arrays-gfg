package com.test.sample.gfg;

public class RearrangeArrays {

	public void rearrange(int[] arr) {
		int n = arr.length;
		for(int i =0; i <n; i++) {
			for(int j =0; j < n; j++) {
				if(arr[j] == i) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break;
				}
			}
		}
		
		for(int i =0; i < n; i++) {
			if(arr[i] != i) {
				arr[i] = -1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RearrangeArrays rarr = new RearrangeArrays();
		int [] arr = {-1, -1, 6, 1,9, 3,2,-1,4,-1};
		System.out.println("After rearranging the array elements such that arr[i] = i");
		rarr.rearrange(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + "|");
		}
	}

}
