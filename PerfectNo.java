package com.DSA;

import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = ss.nextInt();
		int sum =0;
		for(int i =1; i<n; i++) {
			if(n%i == 0) {
				sum+=i;
			}
		}
		if(n == sum) {
			System.out.println(n + " perfect Number");
		}
		else {
			System.out.println(n + " Not perfect Number");
		}

	}

}
