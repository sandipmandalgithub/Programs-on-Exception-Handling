package com;

public class UncheckedException {
	public static void main(String[] args) {
		//ArithmeticException -->not handling immediately
		
		System.out.println(10/0);
		
		//ArrayIndexOutOfBoundsException-->not handling immediately
		
		int a[]= {10,20,30};
		System.out.println(a[10]);
	}

}
