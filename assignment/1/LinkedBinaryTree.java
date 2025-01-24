import java.util.ArrayList;

public class LinkedBinaryTree {
	private Node root;
	private int length;
	
	public LinkedBinaryTree() {
		root = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	
	
	public boolean add(int value)  {
		Node newNode = new Node(value);
		boolean added = false;
		
		if(root == null) {
			root = newNode;
			added = true;
			length++;
		}
		else {
			added = add(newNode, root);
		}
		return added;
	}
	
	private boolean add(Node newNode, Node current) {
		boolean added = false;
		
		/*if(current == null) {
			current = newNode;
			added = true;
			length++;
		}*/
		
		if(newNode.data < current.data) {
			if(current.left == null) {
				current.left = newNode;
				added = true;
			}
			else {
				added = add(newNode, current.left);
			}
		}
		else {
			if(current.right == null) {
				current.right = newNode;
				added = true;
			}
			else {
				added = add(newNode, current.right);
			}
		}
		return added;
	}
	
	//TODO
	public ArrayList<Integer> preOrder() {
		return preOrder(root);
	}
	
	private ArrayList<Integer> preOrder(Node current) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(current != null) {
			arr.add(current.data);
			arr.addAll(preOrder(current.left));
			arr.addAll(preOrder(current.right));
		}
		return arr;
	}
	
	//TODO
	public ArrayList<Integer> postOrder() {
		return postOrder(root);
	}

	private ArrayList<Integer> postOrder(Node current) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(current != null) {
			arr.add(current.data);
		}
		return arr;
	}
	
	public ArrayList<Integer> inOrder() {
		return inOrder(root);
	}

	private ArrayList<Integer> inOrder(Node current) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(current != null) {
			arr.addAll(inOrder(current.left));
			arr.add(current.data);
			arr.addAll(inOrder(current.right));
		}
		return arr;
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
