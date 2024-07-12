package com.DSA;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss= new Scanner(System.in);
		System.out.println("enter the number for fabonacci");
		int n=ss.nextInt();
		int a=0, b=1, c;
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
