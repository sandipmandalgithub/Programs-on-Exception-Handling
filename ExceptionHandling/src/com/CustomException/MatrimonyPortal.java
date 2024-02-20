package com.CustomException;

import java.util.Scanner;

public class MatrimonyPortal {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=21)
		{
			System.out.println("Get Married!Hopefully stay happy");
		}
		else
		{
			try 
			{
				AgeInvalidException obj=new AgeInvalidException("Have Patience");
				throw obj;
			}
			catch(AgeInvalidException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
