package com.kodnest.array.selectionsort;

import java.util.Scanner;

public class SelectionsortApp {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter " +arr.length+ "numbers to be stored in an array");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before sorting the Array is : ");
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		
		int [] sortedArr = Selectionsort.selectionsorting(arr);
		System.out.println("After sorting the array is : ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(sortedArr[i]+ " ");
		}
	}
}
	


