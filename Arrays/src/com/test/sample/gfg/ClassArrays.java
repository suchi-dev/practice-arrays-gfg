package com.test.sample.gfg;

public class ClassArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] intArr = new int[3];
		byte [] byteArr = new byte[3];
		short [] shortArr = new short[3];
		
		String [] strArr = new String[3];
		
		System.out.println(intArr.getClass());
		System.out.println(byteArr.getClass());
		System.out.println(shortArr.getClass());
		System.out.println(strArr.getClass());
		System.out.println(strArr.getClass().getSuperclass());
		
		
	}

}
