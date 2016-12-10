import java.util.*;
import java.math.*;
class IntersectingPointOfTwoLinkedList
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
		Scanner sc = new Scanner(System.in);
		IntersectingPointOfTwoLinkedList llist = new IntersectingPointOfTwoLinkedList();
		Node first1 = new Node(1);
		Node second1 = new Node(2);
		Node third1 = new Node(3);
		Node forth1 = new Node(4);
		Node fifth1 = new Node(5);

		head1 = first1;
		first1.next = second1;
		second1.next = third1;
		third1.next = forth1;
		forth1.next = fifth1;
		
		Node first2est = new Node(00);
		Node first2 = new Node(10);
		Node second2 = new Node(20);

		head2 = first2est;
		first2est.next = first2;

		first2.next = second2;
		second2.next = third1;

		int c1 = display(head1);
		int c2 = display(head2);
		//System.out.println(c1+"  "+c2);
		int diff = Math.abs(c1-c2);
		int count = 0;
		

		if(c1 == c2)
		{
			
			intersectingPoint();
		}
		else if(c1>c2)
		{
			
			while(count != diff)
			{
				head1=head1.next;
				count++;
			}
			intersectingPoint();
		}
		else
		{
			while(count != diff)
			{
				head2=head2.next;
				count++;
			}
			intersectingPoint();
			
		}

		//intersectingPoint();

	}
	public static int display(Node p)
	{
		//Node p = head;
		int c= 0;
		while(p!=null)
		{
			System.out.print(p.data+"->");
			p=p.next;
			c++;
			
		}
		
		System.out.println();
		System.out.println("--------------------");
		return c;
	}

	public static void intersectingPoint()
	{
		while(head1!=head2)
			{
				head1 = head1.next;
				head2 = head2.next;
				
			}
			System.out.println("Meeting point is "+head1.data);
			
	}

	

}
