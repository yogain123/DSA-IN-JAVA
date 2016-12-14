import java.util.*;
class CheckForPairinArrayWithSunAsX
{
	public static void main(String... args)
	{
		int a[] = {1, 4, 45, 6, 10, -8};
		int num = 16;
		Arrays.sort(a);
		//display(a);
		int first = 0;
		int last = a.length-1;
		while(a[first]+a[last]!=num)
		{
			if(a[first]+a[last]>num)
				last-=1;
			else 
				first+=1;
		}

		System.out.println("Numbers are  "+a[first]+" "+a[last]);
	}

	static void display(int a[])
	{
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]);
	}
}