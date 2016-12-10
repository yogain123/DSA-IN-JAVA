import java.util.*;
class ReverseLinkedListInGroupOfGivenSize
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
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		ReverseLinkedListInGroupOfGivenSize llist = new ReverseLinkedListInGroupOfGivenSize();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eight = new Node(8);

		System.out.println("Enter Number");

		int n = sc.nextInt();

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next=eight;
		//eight.next=ninth;

		display(head);
		Node res = Reverse(n,head);
		display(res);
	}
	public static void display(Node p)
	{
		//Node p = head;
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
			
		}
		System.out.println();
		System.out.println("--------------------");
	}

	public static Node Reverse(int n,Node head)
	{
		int count = 0;
		Node prev=null,next=null;
		Node current = head;

		while(current!=null && count!=n)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;

		}

		if(next!=null)
			head.next = Reverse(n,next);

		return prev;

	}

}