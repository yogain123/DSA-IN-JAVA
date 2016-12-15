import java.util.*;
class SortElementsByFrequency
{
	public static void main(String... args)
	{
		Integer a[]= new Integer[]{2, 5, 2, 8, 5, 6, 8, 8};
		Integer len = a.length;

		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> countArray = new ArrayList<Integer>();
		Collections.addAll(hs,a);
		Integer count;

		for(Integer z : hs)
		{
			count = getCount(z,a);
			//System.out.println("count of "+z +"is "+count);
			countArray.add(count);
		}

		Integer nums[] = new Integer[hs.size()];
		Integer countss[] =new Integer[hs.size()]; 

		//System.out.println(hs);
		//System.out.println(countArray);



		nums = hs.toArray(nums);
		countss = countArray.toArray(countss);


		//System.out.println(Arrays.toString(nums));

		//System.out.println(Arrays.toString(countss));
		int temp1,temp2;

		for(int i = 0;i<nums.length;i++)
		{
			for(int j =0;j<nums.length-1;j++)
			{
				if(countss[j]<=countss[j+1])
				{
					temp1 = countss[j];
					countss[j] = countss[j+1];
					countss[j+1] = temp1;

					temp2 = nums[j];
					nums[j] = nums[j+1];
					nums[j+1]= temp2;
				}
			}
		}


		for(int p=0;p<nums.length;p++)
		{
			for(int h = 1;h<=countss[p];h++)
			{
				System.out.print(nums[p]+", ");
			}
			System.out.println();
		}

	}

	static Integer getCount(Integer z,Integer a[])
	{
		Integer c = 0;
		for(Integer i=0;i<a.length;i++)
		{
			if(z == a[i])
				c++;
		}

		return c;
	}
}
