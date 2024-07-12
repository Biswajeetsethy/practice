package com.DSA;

public class ArraywithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first print 0 then No
		
		int arr1[]= {2, 4, 0, 1 ,6, 0, 5, 0};
		
		int arr2[]=new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 0) {
				for(int j=0; j>1; j++) {
				arr2[j]= arr1[i];
				}
			}
		}

	}

}
