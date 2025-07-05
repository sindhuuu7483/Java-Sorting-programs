package com.kodnest.array.selectionsort;

public class Selectionsort {
	public static int[] selectionsorting(int [] arr)
	{
		for(int i=0; i<=arr.length-2;i++)
		{
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<=arr.length-2;j++)
			{
				if(arr[i]<min)
				{
					min = arr[j];
					pos = j;
				}
			}
			int temp;
			temp=arr[i];
			arr[i]=arr[pos];
		}
	
	return arr;
	}
	
}
		
	




