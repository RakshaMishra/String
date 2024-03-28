package com.kodnest.String;

public class String3_assesm {
	public static void main(String[] args) {
		String s="raksha";
		
		

		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}

	}
	}


