package com.kodnest.String;

public class panagram {
	public static void main(String[] args) {
		String s="abcd efgh ijkl mno pqr stuv wxyz";
		boolean found=true;
		for(char ch='a';ch<='z';ch++)
		{
			if(!s.contains(ch+""))
			{
				found=false;
				break;
			}
		}
		if(found==true)
		{
			System.out.println("the string is panagram");
		}
		else
		{
			System.out.println("the string is not a panagram");
		}
	}

}
