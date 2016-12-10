import java.util.*;
class swap
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
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		int c=0;
		display();
		int n1,n2;
		System.out.println("enter numbers to be swapped");
		n1=sc.nextInt();
		n2=sc.nextInt();
	
		Node p = head;
		while(p!=null)
		{
			if(p.data == n1 || p.data == n2)
				c++;
			p=p.next;
		}
		if(c!=2)
			System.out.println("Has duplicate values or one or both value not present to be swapped");
		else
		{
			p= head;
			Node q = head;
			while(p.data!=n1)
				p=p.next;
			while(q.data!=n2)
				q=q.next;
			
			int k;
			k=p.data;
			p.data=q.data;
			q.data=k;
			
			display();
		}
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