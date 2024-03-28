package com.kodnest.String;
import java.util.Scanner;
public class String_practice8 {
	public static void main(String[] args) {
		String s="program";
		boolean found=false;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					found=true;
				}
				
				
			}
			if(found==false)
			{
				System.out.println(s.charAt(i));
			}
			
		}
	}

}
