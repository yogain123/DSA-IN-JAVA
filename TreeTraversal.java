class TreeTraversal
{
	
	static Node root;
	
	TreeTraversal()
	{
		root = null;
	}
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
	
	
	public static void main(String... args)
	{
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println();
		tree.preOrder(root);
		System.out.println();
		tree.postOrder(root);
		System.out.println();
		tree.inOrder(root);
		
		
	}
	
	void inOrder(Node p)
	{
		
		if(p!=null)
		{
		inOrder(p.left);
		System.out.print(p.data+", ");
		inOrder(p.right);
		}
	}
	
	void preOrder(Node p)
	{
		if(p!=null)
		{
			System.out.print(p.data+", ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}
	
	void postOrder(Node p)
	{
		if(p!=null)
		{
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data+", ");
		}
	}
}