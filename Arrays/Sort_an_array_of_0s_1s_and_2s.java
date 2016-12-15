class Sort_an_array_of_0s_1s_and_2s
{
	public static void main(String... args)
	{

		int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int count[] = new int[3];
		int i,j;

		for(i=0;i<a.length;i++)
			count[a[i]]+=1;

		for(i=0;i<=2;i++)
		{
			for(j=1;j<=count[i];j++)
				System.out.print(i+" , ");
		}
	}
}