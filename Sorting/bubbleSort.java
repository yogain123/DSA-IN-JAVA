import java.util.*;
class bubbleSort
{
	public static void main(String... args)
	{
		int a[] = {2,5,3,1,7,9,7,0};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}