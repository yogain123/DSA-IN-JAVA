class stackDemoLinkedList
{
	static Node head;
	static Node top = null;
	static int topnum = -1;
	static int size = 4;
	
	stackDemoLinkedList()
	{
		
	}
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
			
			
		}
	}
	
	
	public static void main(String... args)
	{
		stackDemoLinkedList sd = new stackDemoLinkedList();
		//Node first = new Node(1);
		//Node second = new Node(2);
		//Node third = new Node(3);
		//Node forth = new Node(4);
		
		//head=first;
		//first.next=second;
		//second.next=third;
		//third.next=forth;
		
		push(1);
		push(2);
		push(3);
		push(4);
		
		display();
		
		pop();
		pop();
		pop();
		//pop();
		//pop();
		pop();
		System.out.println();
		display();
	}
	
	public static void push(int value)
	{
		
		
		if(topnum == size-1)
			System.out.println("overflow");
		else if(top == null)
		{
			Node newNode = new Node(value);
			top = newNode;
			head=top;
			topnum++;
		}
		
		else
		{
			Node newNode = new Node(value);
			//newNode.next = top;
			top.next = newNode;
			top=top.next;
			topnum++;
		}
		
		
		
			
	}
	
	public static void pop()
	{
		Node p = head;
		if(topnum <= -1)
			System.out.print("underflow");
		else if(topnum == 0)
		{
			head = null;
			topnum--;
		}
		else if(topnum == 1)
		{
			p.next = null;
			topnum--;
		}
		else
		{
			//Node p =head;
			while(p.next.next!=null)
				p=p.next;
			p.next = null;
			topnum--;
		}
		
	}
	
	
	public static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.print(p.data+"-->");
			p=p.next;
		}
	}
}