import java.util.*;
class ExpressionTree
{
	static class Node
	{
		char data;
		Node left,right;
		Node(char data)
		{
			this.data = data;
			left = right = null;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ExpressionTree tree = new ExpressionTree();
		System.out.println("Enter Expression");
		String s = sc.nextLine();
		System.out.println();
		char c[]=s.toCharArray();
		
		Node res = convertToExpressionTree(c);
		
		inorder(res);
		
	}
	
	public static Node convertToExpressionTree(char c[])
	{
		Stack<Node> s = new Stack<Node>();
		Node t,t1,t2;
		for(int i =0;i<c.length;i++)
		{
			if(!isOperator(c[i]))
			{
				t = new Node(c[i]);
				s.push(t);
			}
			else
			{
				t = new Node(c[i]);
				t1 = s.pop();
				t2 = s.pop();
				
				t.right = t1;
				t.left = t2;
				
				s.push(t);
			}
		}
		//t = s.peek();
		t = s.pop();
		
		return t;
		
	}
	
	public static void inorder(Node p)
	{
		if(p!=null)
		{
			inorder(p.left);
			System.out.print(p.data+" ");
			inorder(p.right);
		}
	}
	
	public static boolean isOperator(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }
 
}