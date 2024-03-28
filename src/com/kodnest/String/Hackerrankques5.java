package com.kodnest.String;

import java.util.Scanner;

public class Hackerrankques5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char[]ch=s.toCharArray();
		String s1="";
		String even="";
		String odd="";
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				even= even+ch[i] +"";
			}
			else
			{
				odd=odd+ch[i]+"";
			}
			
		}
		s1=even + " " + odd;
		System.out.println(s1);
		
	}

}


