import java.util.*;
class insertionSort
{
	public static void main(String... args)
	{
		int a[] = {7,8,5,2,4,6,3};
		//int key = a[0];
		int i ,j, temp;
		for(i=1;i<a.length;i++)
		{
			for(j=i;j>=0;j--)
			{
				//key=a[j-1];
				if(j-1>=0 && a[j]<a[j-1])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
