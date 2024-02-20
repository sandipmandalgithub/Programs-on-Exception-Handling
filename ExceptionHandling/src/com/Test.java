package com;

public class Test {

	public static void main(String[] args) {
		System.out.println("Start");
	
		int arr[]= {10,20,30};
		try {
		System.out.println(arr[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		System.out.println("End");

	}

}
