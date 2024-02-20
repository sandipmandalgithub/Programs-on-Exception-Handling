package com;

public class NullPointerException {
	public static void main(String[] args) {
		String s="JAVA";//s=null
		if(s!=null) {//Avoiding an Exception
			System.out.println("Length of " + s +" is "+s.length());
			
		}
		System.out.println("-----------------");
		
		String x="JAVA";//x=null
		try {//Handling an Exception
			System.out.println("Length of " + s +" is "+s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
