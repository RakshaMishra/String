package com.kodnest.String;

public class String_alphabets {
	public static void main(String[] args) {
		String s="Hello Java? 123";
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		String s1=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{ 
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				
			}
		
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				count1++;
				
			}
			
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				count2++;
				
			}
			
			if(ch==' ')
			{
				count3++;
				
			}
			if(ch>='0'&& ch<='9')
			{
				count4++;
			}
			
		}
		System.out.println("count of vowels "+count);
		System.out.println("count of lowercase "+count1);
		System.out.println("count of uppercase "+count2);
		System.out.println("count of space "+count3);
		System.out.println("count of number "+count4);
		
		
	}


}
