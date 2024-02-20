package com;
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
		//Unhandled exception type InerruptedException
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Handled");
			}
	}
		//	Unhandled exception type FileNotFoundException
		
		try {
		FileReader f=new FileReader("java.txt");
		}
		catch(Exception e) {
			System.out.println("File is not present");
		}

	}
}
