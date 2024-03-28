package com.kodnest.String;

public class Substring_longest {
	public static void main(String[] args) {
		String s="Java";
		
		
		String split[]=s.split(" ");
		int max=0;
		String longword="";
		
		for(int i=0;i<split.length;i++)
		{
			if(split[i].length() > max)
			{
			max=split[i].length();
				 longword=split[i]+;
				
			}
		}
		System.out.println("the longest word is "+max);
		System.out.println("the longest word is "+longword);
	}

}
