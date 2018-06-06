import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	static Node root;
	
	/* Recursive Method

	public static void level_order(Node root)
	{
		int height = height(root);
		
		for(int i=0;i<height;i++)
		{
			printlevel(root,i);
			System.out.println();
		}
	}
	*/
	
	public static void printlevel(Node root, int level)
	{
		if(root==null)
			return;
		if(level==0)
			System.out.print(root.data+" ");
		
		printlevel(root.left, level-1);
		printlevel(root.right, level-1);
	}
	
	public static void level_order(Node root)
	{
		if(root==null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			System.out.print(node.data+" ");
			
			if(node.left!=null)
				queue.add(node.left);
			
			if(node.right!=null)
				queue.add(node.right);
			
		}
		
	}
	
	public static int height(Node root)
	{
		if(root==null)
			return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(lheight>rheight)
			return lheight+1;
		return rheight+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   LevelOrder tree = new LevelOrder();
	       tree.root= new Node(1);
	       tree.root.left= new Node(2);
	       tree.root.right= new Node(3);
	       tree.root.left.left= new Node(4);
	       tree.root.left.right= new Node(5);
	       
	       level_order(root);
	}

}
