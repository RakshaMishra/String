package com.kodnest.String;

public class String_equality {
	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		boolean found=true;
		if(s1.length()==s2.length())
		 {for(int i=0;i<s1.length();i++)
		{     char ch=s1.charAt(i);
			if(ch!=s2.charAt(i))
			{   
				found =false;
				
			}
		}
		 }
		if(found)
		{
			System.out.println("strings are equal.");
		}
		else
		{
			System.out.println("strings are not equal.");
		}
	}

}
