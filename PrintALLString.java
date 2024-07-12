package com.Java8;

import java.util.Comparator;
import java.util.List;

public class PrintALLString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Spring", "Spring Boot", "Microservices", "AWS", "Python");
		
		list.stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("print list having Spring");
		
		list.stream().filter(name -> name.contains("Spring")).forEach(System.out::println);
		System.out.println();
		System.out.println("Print list having more than length 4");
		
		list.stream().filter(name -> name.length() >= 4).forEach(System.out::println);
		System.out.println();
		System.out.println("Print number of characters in each String");
		 
		list.stream().map(name -> name+ " "+ name.length()).forEach(System.out::println);
		System.out.println();
		System.out.println("Sorted the string");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		System.out.println("Sorted the string using compirater");
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println();
		System.out.println("Rever the String");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		System.out.println("sort the string based on size");
		list.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

	}

}
