package com.kodnest.String;

import java.util.Arrays;

public class Lexico {
	public static void main(String[] args) {
		int c=0;
		String str="welcomejava";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String s=str.substring(i,j);
				if(s.length()==3)
				{
					System.out.println(s);
				}
			}
		}
		//lexicogrAphic 
		String emp="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String s=str.substring(i,j);
				
				 if(s.length()==3)
				 {	  
					emp=emp+s+" ";
				 }
				
			}
		}
		String split[]=emp.split(" ");
		Arrays.sort(split);
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		
				
	}

}
