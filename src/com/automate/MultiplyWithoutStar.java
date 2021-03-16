package com.automate;

class MultiplyNumbers {

	public int Multiply(int x, int y)
	{
		if(y == 0)
			return 0;

		if(y > 0)
			return (x + Multiply(x, y-1));

		if(y < 0)
			return (-Multiply(x, -y));

		return -1;
	}
}

public class MultiplyWithoutStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyNumbers mn = new MultiplyNumbers();
		System.out.println(mn.Multiply(5, 2));
	}
}
