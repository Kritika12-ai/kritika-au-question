package com.automate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {
	
	
	@Test//(enabled = false)
	public void streamMap()
	{
		ArrayList<String> names_1 = new ArrayList<String>();
		names_1.add("Man");
		names_1.add("Women");
		names_1.add("Don");
		names_1.add("Hitman");
		names_1.add("Wonderwoman");
		
		//print names which have last letter as a with uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
		
		//print names which have first letter as a with upper case and sorted
		List<String> names = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		// merge two lists
		Stream<String> newStream = Stream.concat(names.stream(), names_1.stream());
		//newStream.sorted().forEach(s -> System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

}
