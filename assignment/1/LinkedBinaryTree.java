

public class LinkedBinaryTree {
	private Node root;
	private int length;
	
	public LinkedBinaryTree() {
		root = null;
		length = 0;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean add(int value)  {
		Node current = root;
		boolean foundPlacement = false;
		
		if(current == null) {
			current = new Node(value);
			foundPlacement = true;
			length++;
		}
		else {
			while(!foundPlacement) {
				if(value < current.data) {
					current = current.left;
				}
				else {
					current = current.right;
				}
			}
		}
		return foundPlacement;
	}
	
	
	public void getPreOrder() {
		
	}

	public void getPostOrder() {
		
	}

//do these recursively
	public String getInOrder(Node root) {
		//append each node's data to the string
	}
	
	private class Node {
		public int data;
		public Node left;
		public Node right;
		
		public Node(int dataIn) {
			data = dataIn;
			left = null;
			right = null;
		}
		
	}
}