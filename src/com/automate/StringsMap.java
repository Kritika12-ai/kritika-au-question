package com.automate;

import java.util.HashMap;
import java.util.Map;

public class StringsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This to Test how many vowels count";
		str = str.toLowerCase();
		
		HashMap <Character, Integer> vowels = new HashMap<Character, Integer>();
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		
		for(int i = 0; i < str.length(); i++)
		{
			if(vowels.containsKey(str.charAt(i)))
			{
				vowels.put(str.charAt(i), vowels.get(str.charAt(i))+1);
			}
		}
		for(Map.Entry entry : vowels.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
