package com.DSA;

import java.util.Stack;
import java.util.Scanner;
public class InsertIndexOnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter a index No to insert 10:");
		int n= ss.nextInt();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		stack1.push(2);
		stack1.push(1);
		stack1.push(6);
		stack1.push(4);
		System.out.println(stack1);
		for(int i= 0; i<5; i++) {
			if(i == n) {
				stack2.push(10);
			}
			else {
			stack2.push(stack1.pop());
			}
		}
		for(int i=0; i<5; i++) {
			stack1.push(stack2.pop());
		}
		
		System.out.println(stack1);
		
		

	}

}
