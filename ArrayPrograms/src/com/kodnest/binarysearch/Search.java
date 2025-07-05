package com.kodnest.binarysearch;

public class Search {
	public static void binarySearch(int []arr,int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(key==arr[mid])
			{
				System.out.println("Key " +key+" found at index : " +mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			else
			{
				high=mid-1;
				mid=(low+high)/2;
			}
		}
		System.out.println("key not found");
	}

}



