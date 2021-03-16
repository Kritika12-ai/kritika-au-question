package com.automate;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo(5);

	}
	
	public static void Fibo(int n)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 0; i < n; i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+a+" ");
		}
		System.out.println();
		System.out.println(c);
	}

}
