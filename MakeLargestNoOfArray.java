package com.DSA;

public class MakeLargestNoOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 7, 8, 4, 9};
		String str = "";
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}
		for(int i =0; i<arr.length; i++) {
			str+=arr[i];
		}
		System.out.println(str);

	}

}
