import java.util.*;
class DeletingNodeWherePointerIsPointing
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
		DeletingNodeWherePointerIsPointing llist = new DeletingNodeWherePointerIsPointing();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);

		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		display();

		deletingNode(head.next.next);

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

	public static void deletingNode(Node delNode)
	{
		System.out.println("deleting "+delNode.data);
		//Node p =head;
		delNode.data = delNode.next.data;
		delNode.next = delNode.next.next;
		delNode.next.next = null;
	}
}