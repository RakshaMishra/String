package com.kodnest.String;

public class String_10_1 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="aaaaaaa";
		boolean found=false;
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not equal");
		}
		
		else if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					found=true;
				}
			
			}
		}
		if(found==true)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

}
