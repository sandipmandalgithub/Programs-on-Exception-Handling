package com;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
		int div=num1/num2;
		System.out.println("Result: "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Do not divided by zero");
		}
		
		System.out.println("End");
	}

}
