package com.automate;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
				
			}
			for(int k = i; k < 5; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 4; i > 0; i--)
		{
			for(int j = i-1; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				if(i == 5)
				{
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
