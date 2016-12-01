import java.util.*;
class nthFromEnd
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
		LinkedList llist = new LinkedList();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next=fifth;
		fifth.next=sixth;
		
		display();
		
		
		Node firstToGo = head;
		Node secondToGo = head;
		System.out.println("enter the postion");
		int n = sc.nextInt();
		int i =0;
		
		while(i!=n)
		{
			firstToGo = firstToGo.next;
			i++;
		}
		
		while(firstToGo.next!=null)
		{
			firstToGo=firstToGo.next;
			secondToGo=secondToGo.next;
		}
		
		System.out.print(secondToGo.data);
		
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
}