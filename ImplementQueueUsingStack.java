import java.util.*;
class ImplementQueueUsingStack
{
	public static void main(String... args)
	{
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();





		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);

		System.out.println(s1);

		s2.push(s1.pop());
		s2.push(s1.pop());
		s2.push(s1.pop());
		s2.push(s1.pop());

		while(!s2.isEmpty())
			System.out.print(s2.pop()+" ");
	}
}