package com.kodnest.String;

public class String_stoc {
	public static void main(String[] args) {
		String s="hello java";
		String split[]=s.split(" ");
		for(int i=0;i<split.length;i++)
		{
			char ch=split[i].charAt(0);
			String s1=ch+"";
			String s2=s1.toUpperCase();
			String temp=s2+split[i].substring(1);
			System.out.print(temp+" ");
		}

		
	}

}
