package com;
//HANDELED CHECKED EXCEPTION USING THROWS KEYWORD
import java.io.FileReader;

public class ThrowsDemo2 {
	static void read()throws Exception
	{
		FileReader f=new FileReader("java.txt");
		
	}
	public  static void main(String args[])
	{
		try {
			read();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
