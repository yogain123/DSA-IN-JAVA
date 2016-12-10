import java.util.*;
class RemoveDublicateFromSortedLinkedList
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
		RemoveDublicateFromSortedLinkedList llist = new RemoveDublicateFromSortedLinkedList();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(2);
		Node forth = new Node(2);
		Node fifth = new Node(3);
		Node sixth = new Node(5);

		/*Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(2);
		Node forth = new Node(2);
		Node fifth = new Node(3);
		Node sixth = new Node(3);*/

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		display();
		remove();

		display();
	}
	public static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
			
		}
		System.out.println();
		System.out.println("--------------------");
	}


	public static void remove()
	{
		Node prev = head;
		Node current = head;
		//Node current = head;

		if(current.next!=null)
			current = current.next;
		else 
		{
			System.out.println(current.data);
			System.exit(0);
		}
		

			while(current!=null)
			{
				if(current.data!=prev.data)
					{
						if(current.next!=null)
						{
							current = current.next;
							prev = prev.next;
						}
						else {
							
							break;

						}

					}
				else 
				{
					if(current.next!=null)
					{
						prev.next = current.next;
						current = current.next;
					}
					else {
						prev.next = null;
						break;
					}
					//current = current.next;
				}

			}
		


	}

}

