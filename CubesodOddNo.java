package com.Java8;

import java.util.*;
public class CubesodOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintCubesofOddNos(List.of(3, 5, 6, 7, 8, 9, 1, 4));

	}

	private static void PrintCubesofOddNos(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(n -> (n%2 != 0)).map(n -> (n*n*n)).forEach(System.out::println);
		
	}

}
