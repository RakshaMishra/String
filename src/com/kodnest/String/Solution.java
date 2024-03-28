package com.kodnest.String;

public class Solution {
	public static void main(String[] args) {
		String s1="123";
		String s2="123";
		String s3=new String("123");
		String s4=new String("123");
		s1=s3;
		System.out.println(!(s1.equals(s3)));
		
	}

}
