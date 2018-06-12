import java.util.LinkedList;
import java.util.Queue;

public class LargestValue {

	Node root;
	
	public static void getMaxValue(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		int max = Integer.MIN_VALUE;
		
		while(!queue.isEmpty())
		{
		Node node = queue.poll();
		
		if(node == null)
		{
			 System.out.print(max+" ");
			 max = Integer.MIN_VALUE;
			 if(!queue.isEmpty())
			 node = queue.poll();
			 else
				 break;
			 //System.out.println(node.data);
			 queue.add(null);
		}
		max = Math.max(node.data, max);
			
		if(node.left!=null)
			queue.add(node.left);
		if(node.right!=null)
			queue.add(node.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestValue tree = new LargestValue();
        tree.root = new Node(4);
        tree.root.left = new Node(9);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(2);
        tree.root.right.right = new Node(7);
        
        getMaxValue(tree.root);
	}

}
