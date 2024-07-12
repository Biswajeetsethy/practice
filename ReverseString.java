package com.DSA;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Biswajeet";
		String s2="";
		char ch;
		for(int i=0; i<s1.length(); i++) {
			ch = s1.charAt(i); 
			s2 = ch+s2;
		}
		
		System.out.println(s2);
		
		StringBuffer sbf = new StringBuffer(s2);
		sbf.reverse();
		
		System.out.println(sbf);

	}

}
