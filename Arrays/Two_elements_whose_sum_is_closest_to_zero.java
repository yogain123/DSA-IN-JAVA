/*1) Sort all the elements of the input array.
2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
3) sum = a[l] + a[r]
4) If sum is -ve, then l++
5) If sum is +ve, then r–
6) Keep track of abs min sum.
7) Repeat steps 3, 4, 5 and 6 while l < r Implementation */

import java.util.*;
class Two_elements_whose_sum_is_closest_to_zero
{
	public static void main(String... args)
	{
		 int a[] = {1, 60, -10, 70, -80, 85};  // -80 , -10 , 1 ,  60 , 70 , 85

		 Arrays.sort(a);
		 int first =0 ;
		 int last = a.length-1;
		 int sum = 0;
		 int min = 85;
		 int minFirstElement = 0;
		 int minSecondElement = 0;

		 while(first<last)
		 {
		 	sum = Math.abs(a[first] + a[last]);

		 	if(sum<=min)
		 	{
		 		min = sum;
		 		minFirstElement = a[first];
		 		minSecondElement = a[last];
		 	}
		 	if(sum<0)
		 		first+=1;
		 	else
		 		last-=1;

		 	
		 }



		 	System.out.println(minFirstElement+"   "+minSecondElement);
	}
}