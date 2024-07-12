package com.Java8;

import java.util.*;

public class EvenNo {

	public static void main(String[] args) {
		printAllNumberInList(List.of(1,2,3,2,5,7,4));
		System.out.println();
		printEvenNumberInList(List.of(1,2,3,2,5,7,4));

	}

	private static void printEvenNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter((number) -> (number%2 == 0)).forEach(System.out::println);
		
	}

	private static void printAllNumberInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(System.out::println);
		
	}

}
