package com.automate;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number = 1037060000;
		int count = 0;
		while(number%10 == 0)
		{
			count++;
			number = number/10;
		}
		System.out.println(count);

	}

}
