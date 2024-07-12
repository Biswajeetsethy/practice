package com.Java8;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(1, 2, 4, 6, 8, 9, 1);
		
		Predicate<? super Integer> evenpredicate = x -> x%2==0;
		Filtermethod(numbers, evenpredicate);
		System.out.println();
		Predicate<? super Integer> Oddpredicate = x -> x%2==1;
		Filtermethod(numbers, Oddpredicate);
		System.out.println();
		Function<Integer, Integer> mappingFunction = n -> n*n;
		List<Integer> Fun = mapAndCreateNewList(numbers, mappingFunction);
		System.out.println(Fun);
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mappingFunction) {
		return numbers.stream().map(mappingFunction).collect(Collectors.toList());
	}

	private static void Filtermethod(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
