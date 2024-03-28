package com.kodnest.String;

public class Substring_length {
	public static void main(String[] args) {
String s="raksha";
		
		
    int maxl=0;
    int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			   String ch=s.substring(i,j);
			   if(ch.length()>maxl)
			   {
				   maxl=ch.length();
				   
			   }
			   
			}
		}
		System.out.println("the length of maximum substring is "+maxl);
		System.out.println("the count of maximum substring is "+count);
		
	}
	

}
