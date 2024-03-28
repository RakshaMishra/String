package com.kodnest.String;

public class Char_frequency {
	public static void main(String[] args) {
		String s="program";
		
		
		for(int i=0;i<s.length();i++)
		{  int count=0;
			for(int j=i;j<s.length();j++)
			{if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
			
	}
			char ch=s.charAt(i);
			System.out.println("character "+ch+" "+count);
		}
		
	}
}



