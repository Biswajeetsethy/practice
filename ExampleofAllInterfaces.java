package com.Java8;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleofAllInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(2, 4, 5, 1, 6 , 7, 9);
		
		System.out.println("return boolean data true or false:");
		Predicate<Integer> isEvenpradicate = x -> x%2==0 ;
		System.out.println("It will take a input & return a output");
		Function<Integer, Integer> squreFunction = x -> x*x;
		System.out.println("It take Integer Input & return string output");
		Function<Integer, String> StringOutPutFunction = x -> x + " ";
		System.out.println("It will take input but not return a output");
		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);
		System.out.println();
		BinaryOperator<Integer> sumBinaryOperator = (x , y) -> x+y;
		System.out.println("It will return value without input value");
		Supplier<Integer> randonIntegerSupplier = () -> 2;
		System.out.println(randonIntegerSupplier.get());
		
		//BiPredicate
		BiPredicate<Integer, String> bipredicate = (number, str) -> {
			return number<10 && str.length()>5;
		};
		System.out.println(bipredicate.test(10, "string"));
		
		BiFunction<Integer, String, String> bifunction = (number, str) -> {
			return number + " "+ str;
			
		};
		System.out.println(bifunction.apply(15, "string"));
		
		BiConsumer<Integer, String> biconsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biconsumer.accept(25, "string");

	}

}
