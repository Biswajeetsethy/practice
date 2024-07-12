package com.Java8;

import java.util.*;
import java.util.stream.Collectors;
public class SqureOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSqureOfEvenNo(List.of(2, 3, 4, 7, 8, 9, 10));
		System.out.println((List.of(2, 3, 4, 5, 6, 7)));
		
		List<Integer> numbers = List.of(2, 3, 4, 6, 7, 9);
		numbers.stream().filter(n -> n%2 ==0).map(n -> n*n*n).forEach(System.out::println);
	}

	private static List<Integer> SqureofNos(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().map(n -> n*n).collect(Collectors.toList());
		
	}

	private static void printSqureOfEvenNo(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		numbers.stream().filter(number -> (number%2 == 0)).map(number -> (number*number)).forEach(System.out::println);
		
	}

}
