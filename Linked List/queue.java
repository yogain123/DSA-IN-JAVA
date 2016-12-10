import java.util.*;
class queue
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(1);
		pq.offer(2);
		pq.offer(3);
		pq.offer(4);

		System.out.println(pq);

		pq.poll();
		pq.poll();

		System.out.println(pq.peek()+"  "+pq.peek());
	}
}