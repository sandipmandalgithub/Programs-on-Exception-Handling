package com.CustomException;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		int password=sc.nextInt();
		
		if(password==123)
		{
			System.out.println("Logged in successfully!");
		}
		else
		{
			try 
			{
			throw new InvalidPasswordExecption("Kindly enter valid password");
			}
			catch( InvalidPasswordExecption e) 
			{
			System.out.println(e.getMessage());
				
			}
		}
	
	
	}

}
