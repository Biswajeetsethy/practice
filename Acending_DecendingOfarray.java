package com.DSA;

public class Acending_DecendingOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {4,6,2,5,3,9};
		int temp =0;
		for(int i =0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[j] < arr1[i]) {
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println("Acending order:");
		for(int t=0; t<arr1.length; t++) {
			System.out.println(arr1[t]);
		}

	}

}
