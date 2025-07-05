package com.kodnest.LinearSearch;
import java.util.Scanner;

public class Linearsearch {
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
		
		for(int i = 0 ; i<=arr.length-1 ; i++)
		{
			if(key == arr[i])
			{
				System.out.println("key " +key+" is found at index " +i );
				return;
			}
		}
		System.out.println("key " +key + "is not found");
	}

}





