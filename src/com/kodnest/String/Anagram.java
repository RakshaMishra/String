package com.kodnest.String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		char[]str1=s.toCharArray();
		char[]str2=s1.toCharArray();
		boolean found=true;
		if(s.length()==s1.length())
		{
			System.out.println("anagrams are possile");
		}
		else
		{
			System.out.println("anagrams are not possible");
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!=str2[i])
			{
				found=false;
			}
		}
		if(found)
		{
			System.out.println("strings are anagram");
		}
		else
		{
			System.out.println("they are not anagrams");
		}
		
		
	}

}
