package com.kodnest.LinearSearch;

import java.util.Scanner;

public class Linearsearch1 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");

		int [] arr= new int[scan.nextInt()];
		
		System.out.println("enter " + arr.length + "numbers to be stored in an array");
		
		for(int i = 0 ;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to be searched");
		int key = scan.nextInt();
		
		System.out.println(Search.Linearsearch1(arr,key));
	}
}








