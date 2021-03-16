package com.automate;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is Ayush";
		
		String arr_str[] = str.split(" ");
		for(int i = arr_str.length -1; i >= 0; i--)
		{
			System.out.print(arr_str[i]+" ");
		}
	}

}
