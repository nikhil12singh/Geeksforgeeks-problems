class Node
{
	int data;
	Node left, right;
	
	Node(int data1)
	{
		data = data1;
		left = right = null;
	}
}

public class BinaryTree {

	static Node root;
	
	static boolean validateBST(Node root, int min, int max)
	{
		if(root==null)
			return true;
		
		if(root.data<min || root.data>max)
			return false;
			
		return (validateBST(root.right, root.data+1, max) && validateBST(root.left, min, root.data-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        System.out.println(validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

}
