/*Function to return max sum such that no two elements
      are adjacent */

import java.util.*;
class MaxSumSuchThatNoTwoElementAreAdjacent
{
	public static void main(String... args)
	{
		int a[] = new int[]{5, 5, 10, 100, 10, 5};

		int inc = a[0];
		int exc = 0;
		int exc_new;
		for(int i=1;i<a.length;i++)
		{
			exc_new = Math.max(inc,exc);

			inc = exc + a[i];
			exc = exc_new;
		}

		System.out.println(Math.max(inc,exc));


	}
}