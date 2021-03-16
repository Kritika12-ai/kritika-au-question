package com.automate;

class AddTwoNumbers {

	public int Add(int x, int y)
	{
		while(y != 0)
		{
			int carry = x & y ;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
}

public class AdditionWithoutOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers an = new AddTwoNumbers();
		System.out.println(an.Add(4, 5));
	}
}


