package com.kodnest.String;
import java.util.Scanner;
public class String_practice3 {
	public static void main(String[] args) {
		String s="hello java";
		char[]ch=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		while(left<right)
		{if(ch[left]!=' ' && ch[right]!=' ')
		{
			//swapping
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		else if(ch[left]==' ')
		{
			left++;
		}
		else if(ch[right]==' ')
		{
			right--;
		}
		}
		System.out.println(new String(ch));
		
	}

}
