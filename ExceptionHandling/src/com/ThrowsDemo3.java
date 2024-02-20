package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

//IT IS POSSIBLE TO DECLARED MULTIPLE EXCEPTIONS USING THROWS KEYWORD
public class ThrowsDemo3 {
	static void m1() throws ArithmeticException,FileNotFoundException{
		System.out.println(10/0);
		FileReader f=new FileReader("java.txt");
	}
	public static void main(String args[])
	{
		try {
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid denominator");
		}
		catch(Exception e)
		{
			System.out.println("File is not found");
		}
	}

}
