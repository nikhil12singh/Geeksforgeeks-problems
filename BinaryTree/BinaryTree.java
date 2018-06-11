import java.util.Stack;

class BinaryTree 
{
    Node root;
    static boolean left = true, right = true;
  
    // A function to do boundary traversal of a given binary tree
    void printBoundary(Node node) 
    {
        if (node != null) 
        {
        	    if(node.left!=null && left)
        	    	System.out.print(node.data+" ");
        	    
        	 	printBoundary(node.left);
        	 	
        	 	left = false;
        	 	
        	 	
  
            // Print the left boundary in top-down manner.
            
            if(isLeaf(node))
                System.out.print(node.data + " ");
  
            // Print the right boundary in bottom-up manner
            printBoundary(node.right);
            
            //System.out.println(node.data);
        }
    }
       
    public static boolean isLeaf(Node node)
    {
    		return (node.left == null && node.right==null)?true:false;
    }
    
    // Driver program to test above functions
    public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);
        
        Stack<Integer> stack = new Stack<>();
        Node node = tree.root;
        
        while(node.right!=null)
        {
        		stack.push(tree.root.right.data);
        		node = node.right;
        }
  
        while(!stack.isEmpty())
        {
        int n=	stack.pop();
        	System.out.print(stack.pop()+" ");
        }
    }
}
