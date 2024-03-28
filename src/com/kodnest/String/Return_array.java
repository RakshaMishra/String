package com.kodnest.String;
import java.util.Scanner;
public class Return_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]ar=new int[9];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int[] br = array(ar);
		
		
		
	}
	public static int[] array(int[]ar)
	{   int[]cr=new int[9];
		for(int i=0;i<ar.length;i++)
		{
			cr[i]=ar[i]*10;
			
		}
		return cr;
	}
	//how to return the array.*-/7

}
