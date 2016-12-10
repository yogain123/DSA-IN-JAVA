import java.util.*;
class LinkedList
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
		head = first;
		first.next = second;
		second.next = third;
		
		display();
		
		while(true)
		{
		System.out.println("press 1 to insert at the begining");
		System.out.println("press 2 to insert at the end");
		System.out.println("press 3 to insert at the Some Postion");
		int takeInput = sc.nextInt();
		int num,position;
		
		
		//-----------------------------
		switch(takeInput)
		{
			case 1:
				System.out.println("enter number to be inserted");
				num = sc.nextInt();
				insertAtBegin(num);
				break;
				
			case 2:
				System.out.println("enter number to be inserted");
				num = sc.nextInt();
				insertAtEnd(num);
				break;
				
			case 3:
				System.out.println("enter number to be inserted");
				num = sc.nextInt();
				position = sc.nextInt();
				insertAtAnyPosition(num,position);
				break;
				
		}
		}
		//-----------------------------
		
		
		//insertAtBegin(55);
		//insertAtEnd(100);
		//insertAtThirdPosition(500);
	}
	
	public static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
			
		}
		System.out.println("--------------------");
	}
	
	public static void insertAtBegin(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
		display();
		
	}
	
	public static void insertAtEnd(int data)
	{
		Node k = head;
		Node newNode = new Node(data);
		
		while((k.next)!=null)
			k=k.next;
		
		k.next = newNode;
		newNode.next = null;
		
		display();
		
		
	}
	
	public static void insertAtAnyPosition(int data,int position)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		Node p = head;
		int i =1;
		while(i!=position-1)
		{
			p=p.next;
			i++;
		}
		newNode.next = p.next;
		p.next=newNode;
		
		display();
		
	}
	
	
}