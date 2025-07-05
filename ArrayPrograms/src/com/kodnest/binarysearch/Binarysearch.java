package com.kodnest.binarysearch;

import java.util.Scanner;

public class Binarysearch {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int [] arr = new int[scan.nextInt()];
		
		System.out.println("enter " +arr.length+ "number to be stored in array");
		for(int i = 0; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to be searched");
		int key = scan.nextInt();
		
		Search.binarySearch(arr,key);
	}

}



