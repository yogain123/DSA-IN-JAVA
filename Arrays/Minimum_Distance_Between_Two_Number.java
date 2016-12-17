import java.util.*;
class Minimum_Distance_Between_Two_Number
{
	public static void main(String... args)
	{
		int a[] =  {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int x,y;
		x = 3;
		y = 6;
		int c = 0;
		int pos1 = -1;
		int pos2 = -1;
		int res;
		int i;
		
		ArrayList<Integer> hs = new ArrayList<Integer>();
		
		for(i=0;i<a.length;i++)
		{
			if(a[i] == x)
				pos1 = i;
		}
		
		for(i=pos1+1;i<a.length;i++)
		{
			if(a[i] == y)
				pos2 = i;
		}
		
		if(pos1==-1 || pos2==-1)
			hs.add(-1);
		else
		{
			res = counting(pos1,pos2,a);
			
			hs.add(res);
		}
		
		
		
		//------------------------------------
		
		for(i=0;i<a.length;i++)
		{
			if(a[i] == y)
				pos1 = i;
		}
		
		for(i=pos1+1;i<a.length;i++)
		{
			if(a[i] == x)
				pos2 = i;
		}
		
		if(pos1==-1 || pos2==-1)
			hs.add(-1);
		else
		{
			res = counting(pos1,pos2,a);
			
			hs.add(res);
		}
		
		Collections.sort(hs);
		
		for(Integer z : hs)
		{
			if(z == -1)
			hs.remove(z);
		}
		
		System.out.println(hs.get(0));
		
	}
	
	
	public static int counting(int pos1,int pos2,int a[])
	{
		int c = 0;
		for(int i = pos1+1;i<=pos2;i++)
			c++;
		return c;
	}
	
}