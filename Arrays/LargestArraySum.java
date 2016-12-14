// Java program to print largest contiguous array sum
import java.util.*;
class LargestArraySum
{
	public static void main(String... args)
	{
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

		int max_so_far = 0;
		int max_ending_here = 0;

		for(int i=0;i<a.length;i++)
		{
			max_ending_here = max_ending_here + a[i];
			if(max_ending_here < 0)
				max_ending_here = 0;
			if(max_ending_here > max_so_far)
				max_so_far = max_ending_here;

		}
		System.out.println(max_so_far);
	}
}