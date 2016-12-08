class SortInsideSort
{
	static Node head1,head2;
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
		SortInsideSort llist = new SortInsideSort();
		Node first1 = new Node(5);
		Node second1 = new Node(10);
		Node third1 = new Node(15);
		//Node forth1 = new Node(12);
		
		head1 = first1;
		first1.next = second1;
		second1.next = third1;
		//third1.next = forth1;
		
		
		Node first2 = new Node(2);
		Node second2 = new Node(3);
		Node third2 = new Node(20);
		//Node forth2 = new Node(15);
		
		head2 = first2;
		first2.next = second2;
		second2.next = third2;
		//third2.next = forth2;
		
		display(head1);
		System.out.println();
		display(head2);
		insertInSortingOrder(head1,head2);
		System.out.println();
		
		display(head2);
		
		
		
		
	}
	
	public static void display(Node p)
	{
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
		}
	}
	
	
	public static void insertInSortingOrder(Node p1, Node p2)
	{
		
		while(p1!=null)
		{
			Node newNode = new Node(p1.data);
			
			if(p2.next!=null)
			{
			
				
				if(p1.data<=p2.data)
				{
					newNode.next=head2;
					head2 = newNode;
					p2=newNode;
					p1=p1.next;
					p2=head2;
					
				}
				else if((p1.data > p2.data) && (p1.data <= p2.next.data))
				{
					newNode.next = p2.next;
					p2.next = newNode;
					p2 = newNode;
					p1=p1.next;
					p2=head2;
					
				}
			
				else
					p2=p2.next;
			}
			else
			{
				if(p1.data>=p2.data)
				{
					p2.next = newNode;
					newNode.next = null;
					System.out.println();
					display(head2);
					System.exit(0);
					
				}
			}
			
			
			
		}
	}
		
}