package com.test.sample.gfg;

public class SumRotatedArray {
	
	
	public boolean pairInRotatedArray(int [] arr, int sum) {
		
		// find the pivot element
		int n = arr.length;
		int i;
		for(i =0; i < n; i++) {
			if(arr[i] > arr[i+1]) {
				break;
			}
			
			
		}
		
		int l = ( i+1) %n; // lowest value in the array
		int r = i;// highest value
		
		while( l !=r) {
			if (arr[l] + arr[r] == sum){
				return true;
			}
			if(arr[l] + arr[r] < sum) {
				l = (l +1)%n;
			}else {
				r = (n+r-1)%n;
			}
		}
		
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,15,6,8,9,10};
		SumRotatedArray sra = new SumRotatedArray();
		System.out.println("Sum of 16 exists ? : "+sra.pairInRotatedArray(arr, 16));
		
	}

}
