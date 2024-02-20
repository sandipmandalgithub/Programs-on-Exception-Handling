package com;
//HANDELED UNCHECKED EXCEPTION USING THROWS KEYWORD
public class ThrowsDemo1 {
	static void div()throws ArithmeticException{
		System.out.println(10/0);
		
	}
	public static void main(String[] args) {
		try {
			div();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("Invalid denominator");
		}
		
	}

}
