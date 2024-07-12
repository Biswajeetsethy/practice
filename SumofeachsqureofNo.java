package com.Java8;

import java.util.List;

public class SumofeachsqureofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,3,5,6,3,1,8,9);
		System.out.println(sumofsures(list));
		System.out.println();
		System.out.println(sumofoddNos(list));
		System.out.println();
		Avoiddublication(list);
		System.out.println();
		AcendingOrder(list);
		
	}
	private static void AcendingOrder(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().distinct().sorted().forEach(System.out::println);
		
	}
	private static void Avoiddublication(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().distinct().forEach(System.out::println);
		
	}
	private static int sumofoddNos(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().filter(n -> n%2 != 0).reduce(0, Integer::sum);
	}

	private static int sumofsures(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().map(n -> n*n).reduce(0, Integer::sum);
		
	}

	}

