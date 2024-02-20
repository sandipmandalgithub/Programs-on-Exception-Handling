package com;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("Inside Finally block");
		}
		System.out.println("End");
		
	}

}
