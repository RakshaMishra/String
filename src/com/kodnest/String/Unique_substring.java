package com.kodnest.String;

public class Unique_substring {
	public static void main(String[] args) {
		String s="raksha";
		
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=(s.substring(i,j));
				 for(int k=j+1;k<s.length();k++)
				 {
					 String s2=s.substring(j,k);
					 if(s1.equals(s2))
					 {
						 System.out.println(s1);
					 }
				 }
				
				
				
			}
		}
		
	}
	
}
