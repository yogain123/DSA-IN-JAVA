import java.util.*;
class MirrorImage
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
		MirrorImage height = new MirrorImage();

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		//Node tempNode = root;

		levelOrderTraversal(root);
		System.out.println("-------");

		root = mirror(root);

		levelOrderTraversal(root);

	}

	static Node mirror(Node root)
	{
		if(root == null)
			return root;

		Node left = mirror(root.left);
		Node right = mirror(root.right);

		root.left = right;
		root.right = left;

		return root;


	}


	static void levelOrderTraversal(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty())
		{
			root=q.poll();
			System.out.println(root.data);
			if(root.left!=null)
				q.offer(root.left);
			if(root.right!=null)
				q.offer(root.right);
		}
		//System.exit(0);
	}
}
