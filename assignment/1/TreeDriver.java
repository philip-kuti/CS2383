import java.util.ArrayList;

public class TreeDriver {
	public static void main(String[] args) {
		
		LinkedBinaryTree tree = new LinkedBinaryTree();
		
		//TODO take input from terminal
		//use a delimiter
		
		System.out.println(tree.add(15));
		System.out.println(tree.add(12));
		System.out.println(tree.add(20));
		System.out.println(tree.add(9));
		System.out.println(tree.add(10));
		System.out.println(tree.add(13));
		System.out.println(tree.add(2));
		System.out.println(tree.add(18));
		System.out.println(tree.add(25));
		System.out.println(tree.add(22));
		
		System.out.println("\ntree length: " + tree.length() + "\n");
		
		ArrayList<Integer> inOrder = tree.inOrder();
		ArrayList<Integer> postOrder = tree.postOrder();
		ArrayList<Integer> preOrder = tree.preOrder();
		
		System.out.println("In Order:");
		for(int i = 0; i < inOrder.size(); i++) {
			System.out.println(inOrder.get(i));
		
		}
		
		System.out.println("\nPost Order:");
		for(int i = 0; i < postOrder.size(); i++) {
			System.out.println(postOrder.get(i));
		
		}
		
		System.out.println("\nPre Order:");
		for(int i = 0; i < preOrder.size(); i++) {
			System.out.println(postOrder.get(i));
		
		}
		
		
		
		
		
	}
}
