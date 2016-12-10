import java.util.*;
class ImplementStackUsingQueue
{
	public static void main(String... args)
	{
		PriorityQueue<Integer> s1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> s2 = new PriorityQueue<Integer>();

		s1.offer(1);
		s1.offer(2);
		s1.offer(3);
		s1.offer(4);
		s1.offer(5);
		int len = s1.size();
		System.out.println(s1);
		int c = 0;

		while (c<len)
		{
	
		while(s1.size()!=1)
			s2.offer(s1.poll());
		System.out.print(s1.poll()+" ");

		while(!s2.isEmpty())
			s1.offer(s2.poll());

		c++;
		}


	}
}