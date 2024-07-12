package com.Java8;

import java.util.*;
public class AddLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(2, 3, 5, 3, 7, 8, 9);
		
		int sum = addList(list);
		System.out.println(sum);
		
		int N = NormalSum(list);
		
		System.out.println(N);
	}

	private static int NormalSum(List<Integer> list) {
		// TODO Auto-generated method stub
		int s = 0;
		for(int number : list) {
			s+=number;
		}
		return s;
	}

	private static int addList(List<Integer> list) {
		// TODO Auto-generated method stub
	return list.stream().reduce(0, (a,b) -> a+b);
	}

}
