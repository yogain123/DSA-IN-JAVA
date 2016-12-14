class treeTraversal
{
	static Node root;
	
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.left = null;
			this.right = null;;
			this.data = data;
		}
	}
	
	
	public static void main(String... args)
	{
		treeTraversal t =new treeTraversal();
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		inorder(root);
		postorder(root);
		preorder(root);
	}
	
	
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
}
