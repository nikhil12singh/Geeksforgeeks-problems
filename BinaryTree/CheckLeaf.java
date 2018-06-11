import java.util.Stack;

public class CheckLeaf {

	public static boolean isSame(Node root1, Node root2)
	{
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		stack1.push(root1);
		stack2.push(root2);
		
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
			
			if(stack1.isEmpty() || stack2.isEmpty())
				return false;
			
		Node temp1 = stack1.pop();
		Node temp2 = stack2.pop();
		
		while(temp1!=null && !isLeaf(temp1))
		{
			if(temp1.right!=null)
				stack1.push(temp1.right);
			if(temp1.left!=null)
				stack1.push(temp1.left);
			temp1 = stack1.pop();
		}
		
		while(temp2!=null && !isLeaf(temp2))
		{
			if(temp2.right!=null)
				stack2.push(temp2.right);
			if(temp2.left!=null)
				stack2.push(temp2.left);
			temp2 = stack2.pop();
		}
	
		if(temp1==null && temp2!=null)
			return false;
		if(temp2==null && temp1!=null)
			return false;
		
		if(temp1!=null && temp2!=null)
		{
			
		if(temp1.data!=temp2.data)
			return false;
		}
		}
		
		return true;
		}
	
	public static boolean isLeaf(Node node)
	{
		return ((node.left==null && node.right==null)?true:false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Node root1 = new Node(1);
	      root1.left = new Node(2);
	      root1.right = new Node(3);
	      root1.left.left = new Node(4);
	      root1.right.left = new Node(6);
	      root1.right.right = new Node(7);
	 
	      Node root2 = new Node(0);
	      root2.left = new Node(1);
	      root2.right = new Node(5);
	      root2.left.right = new Node(4);
	      root2.right.left = new Node(6);
	      root2.right.right = new Node(7);
	 
	      if (isSame(root1, root2))
	         System.out.println("Same");
	      else
	         System.out.println("Not Same");
	}

}
