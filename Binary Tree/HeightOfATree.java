import java.util.*;
class HeightOfATree
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

	public static void main(String... argd)
	{
		HeightOfATree height = new HeightOfATree();

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		int res = heightOfTree(root);
		System.out.println(res);
	}

	static int heightOfTree(Node root)
	{
		if(root==null)
			return 0;
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);

		return 1 + Math.max(leftHeight , rightHeight);
	}

}