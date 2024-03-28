package com.kodnest.String;

public class Substrings_len2 {
	public static void main(String[] args) {
    String s="raksha";
    int count=0;
 
		
		
    System.out.println("substrings having length 2");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String ch=s.substring(i,j);
				if(ch.length()==2)
				{  
					
					System.out.println(ch);
					count++;
				}
			}
		}
		System.out.println("count of substring having length 2 is "+count);
	}

}
