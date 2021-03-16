package com.automate;

class Sub {

	public int Subtract(int x, int y)
	{
		while(y != 0)
		{
			int borrow = (~x) & y;
			x = x ^ y;
			y = borrow << 1;
		}
		return x;
	}
}

public class SubtracttwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub sub = new Sub();
		System.out.println(sub.Subtract(6, 4));

	}

}
