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
	
	// Recursion
	
	public static Node lca(Node root, int data1, int data2)
	{
		if(root==null)
			return root;
		
		if(root.data<data1 && root.data<data2)
			return lca(root.right, data1, data2);
		
		if(root.data>data1 && root.data>data2)
			return lca(root.left, data1, data2);
		
		return root;
	}
	
	//Iterative Version
	
	public static Node lca_iterative(Node root, int data1, int data2)
	{
	
	    while(root!=null)
	    {
	    		if(root.data<data1 && root.data<data2)
	    			root = root.right;
	    		else if(root.data>data1 && root.data>data2)
	    			root = root.left;
	    		else
	    			break;
	    }	
	    return root;
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
        
        //Node node = tree.lca(root,10,14);
	Node node = tree.lca_iterative(root, 10, 14);
        System.out.println(node.data);
	}

}
