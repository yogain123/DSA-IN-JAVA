class SizeOfATree
{
	static Node root;
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
		SizeOfATree size = new SizeOfATree();

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		int res = sizeOfATree(root);
		System.out.println(res);
	}

	static int sizeOfATree(Node root)
	{
		if(root == null)
			return 0;
		else
			 return (sizeOfATree(root.left) + 1 + sizeOfATree(root.right));
		
	}
}