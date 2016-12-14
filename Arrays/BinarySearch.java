//Binary Search

class BinarySearch
{
	public static void main(String... args)
	{
		int a[]={1,2,3,4,5,6,7,8};
		int key = 4;
		int first ,last;
		first = 0;
		last = a.length - 1;
		int mid = (first + last)/2;
		
		while(first<=last)
		{
			if(key < a[mid])
				last= mid-1;
			else if(key>a[mid])
				first = mid +1;
			else
			{
				System.out.println("Number found at position "+(mid+1));
				break;
			}

			mid = (first+last)/2;
		}


	}	
}