package com.kodnest.arrays.bubblesort;

import java.util.Scanner;

public class BuublesortApp {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//creating the array
		int [] arr = new int[scan.nextInt()];
		
		//storing the elements
		System.out.println("Enter " +arr.length+ " number to be stored in array");
		for(int i=0 ; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		//Displaying the array elements before sorting
		System.out.println("Before sorting the array is : ");
		for(int i=0 ; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		//calling the bubblesort() and storing the returned sorted array in sortedArr
		int [] sortedArr = Bubblesort.bubbleSorting(arr);
		
		//Displaying the array elements after sorting
		System.out.println("After sorting the array is : ");
		for(int i=0; i<=sortedArr.length-1;i++)
		{
			System.out.print(sortedArr[i]+" ");
		}
		
		
	}

}
