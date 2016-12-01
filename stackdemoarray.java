class stackdemoarray
{
	
	static int size;
	static int stack[];
	static int top;
	
	stackdemoarray(int size)
	{
		this.size=size;
		stack = new int[size];
		top=-1;
	}
	
	public static void push(int value)
	{
		if(top == size-1)
			System.out.println("stack is full");
		else
		{
			top+=1;
			stack[top]=value;
		}
	}
	public static void pop()
	{
		if(top==-1)
			System.out.println("stack is already empty");
		else
			top-=1;
	}
	public static void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(stack[i]+" ");
	}
	
	public static void main(String... args)
	{
		stackdemoarray sd = new stackdemoarray(5);
		sd.push(1);
		sd.push(2);
		sd.push(3);
		sd.push(4);
		sd.push(5);
		
		display();
		System.out.println();
		
		sd.pop();
		sd.pop();
		
		display();
	}
	
}