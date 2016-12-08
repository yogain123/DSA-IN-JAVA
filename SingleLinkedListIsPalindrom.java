import java.util.*;
class SingleLinkedListIsPalindrom
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}


	SingleLinkedListIsPalindrom()
	{
		 
	}

	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		SingleLinkedListIsPalindrom llist = new SingleLinkedListIsPalindrom();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(2);
		Node fifth = new Node(1);

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		Stack<Integer> s = new Stack<Integer>();
		display(s);
		System.out.println(s);

		String check = palindrom(s);
		System.out.println(check);
		

	}
	public static void display(Stack<Integer> s)
	{
		Node p = head;
		while(p!=null)
		{
			System.out.print(p.data+"->");
			s.push(p.data);
			p=p.next;
			
		}
		System.out.println();
		System.out.println("--------------------");
	}

	public static String palindrom(Stack<Integer> s)
	{
		Node p = head;
		
		while(p!=null)
		{
			//System.out.println(p.data+" == "+s.pop());
			if(p.data != s.pop())
				return "Not palindrom";
			p=p.next;
		}
		return "palindrom";
	}


}