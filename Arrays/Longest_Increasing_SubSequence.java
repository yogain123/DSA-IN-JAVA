import java.util.*;
class Longest_Increasing_SubSequence
{
	public static void main(String... args)
	{
		int a[]= {3,4,-1,0,6,2,3};
		int len = a.length;
		
		
		int i,j;
		int countArray[] =new int[a.length];
		for(i=0;i<a.length;i++)
			countArray[i]=1;
		
		i=0;j=1;
		
		while(j<a.length)
		{
			
			if(i!=j)
			{
				if(a[i]<a[j] && (countArray[i]+1>countArray[j]))
					countArray[j] = countArray[i] + 1;
				i++;
			}
			
			else
			{
				i=0;
				j=j+1;
			}
			
			
			
			
		}
		int res = findMax(countArray);
		System.out.println(res);
	}
	
	public static int findMax(int countArray[])
        {
        int max = 0;
        for(int i = 0;i<countArray.length;i++)
            {
            if(countArray[i]>=max)
                max = countArray[i];
        }
        
        return max;
    }
    
}