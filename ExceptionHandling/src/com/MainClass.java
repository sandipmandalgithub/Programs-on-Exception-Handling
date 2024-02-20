package com;

public class MainClass {
	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index");
	}
	catch(ArithmeticException e) {
		System.out.println("Invalid denominator");
	}
	catch(Exception e) {
		System.out.println("Super class handler");
	}

}
}
