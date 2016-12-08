import java.util.*;
class nextGreaterElement
{
	public static void main(String... args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int top;
		int arr[]={13,12,15,5};
		printNextGreaterElement(arr,stack);
	}

	public static void printNextGreaterElement(int arr[],Stack<Integer> stack)
	{
		Integer next,i,element;
		stack.push(arr[0]);
		
		for(i=1;i<arr.length;i++)
		{
			next = arr[i];
			if(!stack.isEmpty())
			{

				element = stack.pop();
		
				while(next>element)
				{
					System.out.println(element+"-->"+next);
					if(stack.isEmpty())
						break;
					
					element = stack.pop();
				}

				if(element>next)
					stack.push(element);

			}
			stack.push(next);	
		}

		while(!stack.isEmpty())
    	{
	        element = stack.pop();
	        next = -1;
	        System.out.println(element+"-->"+next);
    	}


	}


}