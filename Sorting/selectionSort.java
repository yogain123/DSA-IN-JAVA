/*

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
Following example explains the above steps:
arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64 
*/
import java.util.*;
class selectionSort
{
	public static void main(String... args)
	{
		
		int i,j;
		int a[] = {7,8,5,2,4,6,3};
		int max = findMax(a);
		//int resultArray[] = new int[a.length];
		int res_and_pos[] = new int[2];
		int temp,position=0;
		for(i=0;i<a.length;i++)
		{
			position = positionToSwap(i,a.length,a,max);
			
			temp = a[i];
			a[i] = a[position];
			a[position] = temp;
			
		}
		
		System.out.println(Arrays.toString(a));	
		
	}
	
	public static int positionToSwap(int i, int len, int a[],int min)
	{
		int k;
		int pos = 0;
		//int min_and_pos[] = new int[2];
		for(k=i;k<len;k++)
		{
			if(a[k]<=min)
			{
				min = a[k];
				pos = k;
			}
		}
		return pos;
	}
	
	static int findMax(int a[])
	{
		int max = 0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]>=max)
				max = a[i];
		}
		
		return max;
	}
}
