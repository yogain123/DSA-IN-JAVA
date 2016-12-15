import java.util.*;
class Next_Greater_Element
{
	public static void main(String... args)
	{
		int a[]= {4,5,2,25};
		Stack<Integer> s = new Stack<Integer>();

		s.push(a[0]);
		int i,k;


		
		for(i=1;i<a.length;)
		{
			k = s.peek();
			if(a[i]>k)
			{
			
				while(a[i]>k && !(s.isEmpty()))
				{
					System.out.println(k+"--->"+a[i]);
					
					s.pop();
					if(!(s.isEmpty()))
					{
						k = s.peek();

						if(k>a[i])
							System.out.println(k+"--->"+-1);
					}
				}
				
				s.push(a[i]);
				i++;

			}
			else
			{

				s.push(a[i]);
				i++;
				
				
				//continue;
			}
			
			//
		}
		System.out.println(a[a.length-1]+"--->"+-1);
	}
}