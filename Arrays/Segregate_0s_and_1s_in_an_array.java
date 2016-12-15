/*
Maintain two indexes. Initialize first index left as 0 and second index right as n-1.

Do following while left < right
a) Keep incrementing index left while there are 0s at it
b) Keep decrementing index right while there are 1s at it
c) If left < right then exchange arr[left] and arr[right]



*/


import java.util.*;
class Segregate_0s_and_1s_in_an_array
{
	public static void main(String... args)
	{
		 int a[] = new int[]{0, 1, 0, 1, 1, 1};

		 int first = 0;
		 int last = a.length-1;

		 while(first<last)
		 {
		 	while(a[first]!=1 && first<last)
		 		first++;

		 	while(a[last]!=0  && first<last)
		 		last--;

		 	if(first<last)
		 	{
		 		a[first] = 0;
		 		a[last] = 1;
		 		first++;
		 		last--;
		 	}


		 }

		 System.out.println(Arrays.toString(a));
	}
}