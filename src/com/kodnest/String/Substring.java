package com.kodnest.String;

public class Substring {
	public static void main(String[] args) {
		String s1="Program";
		/*System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2,5));
		String replace=s1.replace('g','W');
		String replace1=s1.replace("gra","W");
		System.out.println(replace1);
		System.out.println(replace);
		String s="12345";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}*/
		
		System.out.println("the length is "+s1.length());
		String s2="Raksha";
		System.out.println(s1.equals(s2));
		System.out.println(s2.charAt(3));
		System.out.println(s2.substring(3,5));
		System.out.println(s1.concat(s2));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace("ksh","aaaaaaaa"));
		System.out.println(s1.indexOf(3));
		char[]ch=s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(s2.startsWith("rak"));
		System.out.println(s1.endsWith("rama"));
		String s3="raKsHa";
		System.out.println(s2.equalsIgnoreCase(s3));
		String[]split=s3.split("a");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		String s4="      Yashwanth     ";
		System.out.println(s4.trim());
		System.out.println(s3.compareTo(s2));
		
		
		
		
		
	}

}
