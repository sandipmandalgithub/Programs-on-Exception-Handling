package com.CustomException;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("Enter the amount");
		int amount=sc.nextInt();

		if(amount<=balance) 
		{
			System.out.println("Amount withdrawn successfully!");
			balance=balance-amount;
			System.out.println("Available balance is "+balance);
		}
		else
		{
			try 
			{
				InsufficientBalanceException obj=new InsufficientBalanceException("Insufficient balance");
				throw obj;
			}
			catch(InsufficientBalanceException e) 
			{
				System.out.println(e.getMessage());
			}
		}


	}
}
