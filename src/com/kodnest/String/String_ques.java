package com.kodnest.String;

public class String_ques {
	public static void main(String[] args) {
		String s="program";
		System.out.println(s.length());
		//s.toCharArray();
		char[]ch=s.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}

}
