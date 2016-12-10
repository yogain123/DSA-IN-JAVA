class BTree
{
	static Node root;

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}

	public static void main(String... args)
	{
		BTree tree = new BTree();

		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);

	}


}