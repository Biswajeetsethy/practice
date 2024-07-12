package com.DSA;

import java.util.*;
public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		stack.push(3);
		stack.push(34);
		stack.push(28);
		stack.push(33);
		stack.push(21);
		System.out.println(stack);
		System.out.println("remove a number from last");
		System.out.println(stack.pop());
		System.out.println("************");
		System.out.println(stack);
		System.out.println("get a number from last");
		System.out.println(stack.peek());
		System.out.println("************");
		System.out.println(stack);
		System.out.println("Reverse a stack using for loop:");
		int size = stack.size();
		 for(int i = 0 ; i<size; i++){
			stack1.push(stack.pop());
		}
		System.out.println(stack1);
		/*
		System.out.println("Reverse a stack using forEach");
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		stack2.addAll(stack1);
		for(Integer i : stack2.peek()) {
			stack3.push(i);
			
		}
		System.out.println(stack2);
		System.out.println(stack3); */
			
		
	

	}

}
