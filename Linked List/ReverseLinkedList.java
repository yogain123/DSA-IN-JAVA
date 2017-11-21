//https://www.youtube.com/watch?v=sYcOK51hl-A

class ReverseLinkedList
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
		ReverseLinkedList llist = new ReverseLinkedList();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;

		System.out.println("Original Linked List is");
		display(head);
		Node res = reverse();
		System.out.println("Reverse Linked List is");
		display(res);

	}

	public static void display(Node p)
	{
		
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
		}
	}


	public static Node reverse()
	{

		Node current = head;
		Node prev = null;
		Node next = null;

		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}



}
