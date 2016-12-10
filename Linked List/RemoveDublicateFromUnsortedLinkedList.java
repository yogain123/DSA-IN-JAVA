import java.util.*;
class RemoveDublicateFromUnsortedLinkedList
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
		RemoveDublicateFromUnsortedLinkedList llist = new RemoveDublicateFromUnsortedLinkedList();
		Node first = new Node(2);
		Node second = new Node(6);
		Node third = new Node(1);
		Node forth = new Node(1);
		Node fifth = new Node(7);
		Node sixth = new Node(7);

		HashSet<Integer> hs = new HashSet<Integer>();

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		//hs = display(hs);
		cleanDisplay();
		remove(hs);
		cleanDisplay();
		//System.out.println(hs);
	}


	public static void remove(HashSet hs)
	{
		Node p = head;

		while(p!=null)
		{
			if(!hs.contains(p.data))
			{
				hs.add(p.data);
				p=p.next;
			}
			else 
			{
				if(p.next!=null)
				{
					p.data = p.next.data;
					p.next = p.next.next;
				}	
				else {
					p =head;
					while(p.next.next!=null)
						p=p.next;
					p.next = null;
					break;
				}
				
				
			}

		}

	}


	public static void cleanDisplay()
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





}